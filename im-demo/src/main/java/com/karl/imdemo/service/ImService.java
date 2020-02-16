package com.karl.imdemo.service;

import com.karl.imdemo.common.RongCloudCore;
import com.karl.imdemo.domain.TUser;
import io.rong.RongCloud;
import io.rong.models.response.TokenResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ImService {
    @Autowired
    public RongCloudCore rongCloudCore;

    public TokenResult getRongCloudUserToken(TUser tUser) throws Exception {
        return rongCloudCore.getRongCloudInstance(tUser);
    }

    public Boolean createChatRomm() throws Exception {
        return rongCloudCore.createChatroom();
    }

    public String getChatRommId(String roomName) throws Exception {
        return rongCloudCore.getChatRoomId(roomName);
    }

}
