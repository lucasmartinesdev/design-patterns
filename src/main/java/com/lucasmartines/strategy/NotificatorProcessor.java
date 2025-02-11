package com.lucasmartines.strategy;

import com.lucasmartines.builder.Message;
import com.lucasmartines.strategy.strategies.ChannelNotificator;

public class NotificatorProcessor {

    private final ChannelNotificator channelNotificator;

    public NotificatorProcessor(ChannelNotificator channelNotificator) {
        this.channelNotificator = channelNotificator;
    }

    public void notify(Message message) {
        channelNotificator.notify(message);
    }
}
