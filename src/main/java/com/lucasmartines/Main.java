package com.lucasmartines;


import com.lucasmartines.builder.Message;
import com.lucasmartines.factory.ChannelNotificatorFactory;
import com.lucasmartines.factory.Channel;
import com.lucasmartines.strategy.strategies.ChannelNotificator;

public class Main {
    public static void main(String[] args) {
        Message message = Message.builder().to("Lucas").from("Lucas").subject("Hello").build();

        ChannelNotificator channelNotificator = ChannelNotificatorFactory.create(Channel.SMS);
        channelNotificator.notify(message);

        channelNotificator = ChannelNotificatorFactory.create(Channel.EMAIL);
        channelNotificator.notify(message);

        channelNotificator = ChannelNotificatorFactory.create(Channel.WHATSAPP);
        channelNotificator.notify(message);
    }
}
