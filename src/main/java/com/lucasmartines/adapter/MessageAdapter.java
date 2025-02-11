package com.lucasmartines.adapter;

import com.lucasmartines.builder.Message;

public class MessageAdapter extends Message {

    private final ExternalMessage externalMessage;

    public MessageAdapter(ExternalMessage externalMessage) {
        this.externalMessage = externalMessage;
    }

    @Override
    public String getTo() {
        return externalMessage.getTo();
    }
    @Override
    public String getFrom() {
        return externalMessage.getFrom();
    }
    @Override
    public String getSubject() {
        return externalMessage.getSubject();
    }
    @Override
    public String getBody() {
        return externalMessage.getBody();
    }

    @Override
    public String toString() {
        return "MessageAdapter{" +
                "externalMessage=" + externalMessage +
                '}';
    }
}
