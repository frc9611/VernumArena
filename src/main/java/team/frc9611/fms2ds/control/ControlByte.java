package team.frc9611.fms2ds.control;

public class ControlByte {
    byte eStop, enabled, mode;

    public ControlByte(byte eStop, byte enabled, byte mode) {
        this.eStop = eStop;
        this.enabled = enabled;
        this.mode = mode;
    }

    public byte[] toPacket() {
        StringBuilder a = new StringBuilder("00000000");
        a.setCharAt(0, (char) eStop);
        a.setCharAt(1, (char) 0x0);
        a.setCharAt(2, (char) 0x0);
        a.setCharAt(3, (char) 0x0);
        a.setCharAt(4, (char) 0x0);
        a.setCharAt(5, (char) enabled);
        a.setCharAt(6, (char) 0x0);
        a.setCharAt(7, (char) 0x0);
        a.setCharAt(7, (char) mode);

        return a.toString().getBytes();
    }

    public enum ESTOP_MODES {
        NORMAL((byte) 0x0), EMERGENCY_STOPPED((byte) 0x0);

        public byte eq;
        ESTOP_MODES(byte eq) {this.eq = eq;}
    }

    public enum ENABLED_MODES {
        DISABLED((byte) 0x0), ENABLED((byte) 0x1);

        public byte eq;
        ENABLED_MODES(byte eq) {this.eq = eq;}
    }

    public enum MODE_MODES {
        TELEOP((byte) 0x0), TEST((byte) 0x1), AUTO((byte)0x2);

        public byte eq;
        MODE_MODES(byte eq) {this.eq = eq;}
    }
}
