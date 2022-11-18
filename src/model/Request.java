package model;

import java.io.Serializable;

public class Request implements Serializable {
    int message;
    Packet packet;

    public Request(int msg, Packet packet) {
        this.message = msg;
        this.packet = packet;
    }

    public int getMessage() {
        return message;
    }

    public Packet getPacket() {
        return packet;
    }
}
