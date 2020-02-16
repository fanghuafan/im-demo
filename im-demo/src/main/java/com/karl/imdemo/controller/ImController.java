package com.karl.imdemo.controller;

import com.karl.imdemo.common.RandomName;
import com.karl.imdemo.common.RongCloudCore;
import com.karl.imdemo.domain.TUser;
import com.karl.imdemo.service.ImService;
import io.rong.models.response.TokenResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class ImController {
    private static final Logger log = LoggerFactory.getLogger(ImController.class);
    @Autowired
    public ImService imService;

    @RequestMapping("/im")
    public String imRoute(Locale locale, Model model) throws Exception {
        model.addAttribute("greeting", "Hello!");
        model.addAttribute("chatRoomName", "Sekorm IM Chat");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        //生成6位随机数字
        Integer id = (int) ((Math.random() * 9 + 1) * 100000);
        log.info("生成ID:{}", id);

        TUser tUser = new TUser();
        tUser.setId(id);

        int r1 = 0;
        while (true) {
            r1 = (int) (Math.random() * 10 + 1);
            System.out.println(r1 + "====");
            if ((3 <= r1) && (r1 < 6)) {
                System.out.println(r1);
                break;
            } else {
                System.out.println("Error!");
            }
        }

        String chineseName = RandomName.randomName(true, r1);
        tUser.setName(chineseName);
        tUser.setNickName(chineseName);
        TokenResult TokenResult = imService.getRongCloudUserToken(tUser);

        // 创建聊天室
        imService.createChatRomm();

        model.addAttribute("token", TokenResult.getToken());
        model.addAttribute("userNmae", chineseName + "(" + id + ")");
        model.addAttribute("chatRoomId", imService.getChatRommId("Sekorm IM Chat"));

        return "im";
    }

}
