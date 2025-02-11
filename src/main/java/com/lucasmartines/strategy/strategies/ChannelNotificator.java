package com.lucasmartines.strategy.strategies;

import com.lucasmartines.builder.Message;

public interface ChannelNotificator {
    void notify(Message message);
}
