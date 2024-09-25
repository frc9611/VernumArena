package team.frc9611.fms2ds;

import team.frc9611.Main;
import team.frc9611.fms2ds.control.ControlByte;

import java.net.DatagramPacket;

public class FMStoDS_PacketRunnable implements Runnable {

    @Override
    public void run() {

        ControlByte control =  new ControlByte(
                ControlByte.ESTOP_MODES.NORMAL.eq,
                ControlByte.ENABLED_MODES.DISABLED.eq,
                ControlByte.MODE_MODES.TELEOP.eq
        );

        byte[] controlPacket = control.toPacket();

        Main.SEND_SOCKET.send(new DatagramPacket());
    }
}
