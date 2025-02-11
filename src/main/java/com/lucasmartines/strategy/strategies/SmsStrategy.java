package com.lucasmartines.strategy.strategies;

import com.lucasmartines.builder.Message;

public class SmsStrategy implements ChannelNotificator {

    @Override
    public void notify(Message message) {
        System.out.println("Sending SMS: " + message);
    }
}
