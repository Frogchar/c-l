package com.atguigu.springcloud.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@EnableBinding(Sink.class)
@Component
public class ReceiveMessageListenerController {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        String payload = message.getPayload();
        System.err.println(payload);
    }

}
