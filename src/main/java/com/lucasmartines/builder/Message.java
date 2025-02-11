package com.lucasmartines.builder;

public class Message {
    private String from;
    private String to;
    private String subject;
    private String body;

    private Message() {

    }

    public static Message builder() {
        return new Message();
    }

    public Message from(String from) {
        this.from = from;
        return this;
    }

    public Message to(String to) {
        this.to = to;
        return this;
    }

    public Message subject(String subject) {
        this.subject = subject;
        return this;
    }

    public Message body(String body) {
        this.body = body;
        return this;
    }

    public Message build() {
        return this;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
