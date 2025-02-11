package com.lucasmartines.strategy.strategies;

import com.lucasmartines.builder.Message;

public class WhatsappStrategy implements ChannelNotificator {

    @Override
    public void notify(Message message) {
        System.out.println("Sending Whatsapp: " + message);
    }
}
