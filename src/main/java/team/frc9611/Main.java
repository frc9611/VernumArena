package team.frc9611;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
// char = uint16

public class Main {
    private static int SEQ_NUM = 0x0; // char = uint16
    public static final DatagramSocket SEND_SOCKET;

    static {
        try {
            SEND_SOCKET = new DatagramSocket(1120);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getSeqnum() {
        SEQ_NUM++;
        return SEQ_NUM-1;
    }

    public static void main(String[] args) throws SocketException {


        socket.send(packet);
    }
}