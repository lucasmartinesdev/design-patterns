package com.lucasmartines.strategy.strategies;

import com.lucasmartines.builder.Message;

public class EmailStrategy implements ChannelNotificator {

    @Override
    public void notify(Message message) {
        System.out.println("Sending email: " + message);
    }
}
