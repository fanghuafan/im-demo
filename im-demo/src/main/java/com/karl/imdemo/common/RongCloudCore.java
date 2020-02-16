package com.karl.imdemo.common;

import com.karl.imdemo.domain.TUser;
import io.rong.RongCloud;
import io.rong.methods.chatroom.Chatroom;
import io.rong.methods.user.User;
import io.rong.models.chatroom.ChatroomModel;
import io.rong.models.response.ResponseResult;
import io.rong.models.response.TokenResult;
import io.rong.models.user.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class RongCloudCore {
    private static final Logger log = LoggerFactory.getLogger(RongCloudCore.class);

    @Value("${rongcloud.appKey}")
    private String appKey;
    @Value("${rongcloud.appSecret}")
    private String appSecret;

    public Map<String, String> chatRooms = new HashMap<>();
    public Chatroom chatroom;
    public RongCloud rongCloud;

    public TokenResult getRongCloudInstance(TUser tUser) throws Exception {
        if (tUser == null) {
            return null;
        }
        rongCloud = RongCloud.getInstance(appKey, appSecret);
        User user = rongCloud.user;
        // 用户信息
        UserModel userModel = new UserModel()
                .setId(String.valueOf(tUser.getId()))
                .setName(tUser.getNickName())
                .setPortrait("https://files.sekorm.com/opt/fileStore/portal/memberImg/headImg/sys/big/4.jpg");
        TokenResult result = user.register(userModel);
        System.out.println("getToken:  " + result.toString());
        return result;
    }

    /**
     * 创建聊天室
     *
     * @return
     */
    public Boolean createChatroom() throws Exception {
        if (rongCloud == null) {
            return null;
        }
        if (chatRooms != null && chatRooms.size() > 0) {
            return true;
        }
        ChatroomModel[] chatrooms = new ChatroomModel[1];
        ChatroomModel model = new ChatroomModel();
        model.setId(UUID.randomUUID().toString());
        model.setName("Sekorm IM Chat");
        chatrooms[0] = model;
        chatroom = rongCloud.chatroom;
        ResponseResult responseResult = chatroom.create(chatrooms);
        log.info("创建聊天室成功！{}", responseResult);
        log.info("(ChatroomModel)创建聊天室成功！{}", model);
        if (responseResult.code == 200) {
            chatRooms.put(model.getName(), model.getId());
            return true;
        }
        return false;
    }

    public String getChatRoomId(String roomName) {
        return chatRooms.get(roomName);
    }

}
