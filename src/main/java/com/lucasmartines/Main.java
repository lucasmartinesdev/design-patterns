package com.lucasmartines;


import com.lucasmartines.adapter.ExternalMessage;
import com.lucasmartines.adapter.MessageAdapter;
import com.lucasmartines.builder.Message;
import com.lucasmartines.factory.ChannelNotificatorFactory;
import com.lucasmartines.factory.Channel;
import com.lucasmartines.strategy.strategies.ChannelNotificator;

public class Main {
    public static void main(String[] args) {
        //Adapter
        ExternalMessage externalMessage = new ExternalMessage("Lucas", "Lucas", "Hello", "Hello, Lucas!");
        Message messageAdapter = new MessageAdapter(externalMessage);

        Message message = Message.builder().to("Lucas").from("Lucas").subject("Hello").build();

        ChannelNotificator channelNotificator = ChannelNotificatorFactory.create(Channel.SMS);
        channelNotificator.notify(messageAdapter);

        channelNotificator = ChannelNotificatorFactory.create(Channel.EMAIL);
        channelNotificator.notify(messageAdapter);

        channelNotificator = ChannelNotificatorFactory.create(Channel.WHATSAPP);
        channelNotificator.notify(messageAdapter);
    }
}
