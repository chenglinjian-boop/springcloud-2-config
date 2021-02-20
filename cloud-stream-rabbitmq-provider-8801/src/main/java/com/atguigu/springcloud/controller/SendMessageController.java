package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.IMessageChnnal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: SendMessageController
 * @description:
 * @author: liusCoding
 * @create: 2020-06-10 12:37
 */

@RestController
public class SendMessageController {
    private final IMessageChnnal messageProvider;

    public SendMessageController(IMessageChnnal messageProvider) {
        this.messageProvider = messageProvider;
    }

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
