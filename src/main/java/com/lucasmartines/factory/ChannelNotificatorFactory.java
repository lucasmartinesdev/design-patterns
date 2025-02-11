package com.lucasmartines.factory;

import com.lucasmartines.strategy.strategies.ChannelNotificator;
import com.lucasmartines.strategy.strategies.EmailStrategy;
import com.lucasmartines.strategy.strategies.SmsStrategy;
import com.lucasmartines.strategy.strategies.WhatsappStrategy;

import java.util.Map;

public class ChannelNotificatorFactory {
    private static final Map<Channel, ChannelNotificator> strategies = Map.of(
            Channel.EMAIL, new EmailStrategy(),
            Channel.SMS, new SmsStrategy(),
            Channel.WHATSAPP, new WhatsappStrategy()
    );

    public static ChannelNotificator create(Channel channel) {
       return strategies.get(channel);
    }
}
