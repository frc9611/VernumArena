package team.frc9611.fms2ds;

import team.frc9611.FMSDate;
import team.frc9611.Main;

public class UpdatePacket {
    private int seqNum = Main.getSeqnum();
    private byte commVersion = 0x00;
    private byte[] controlByte;
    private byte requestByte = 0x00;
    private byte allianceStation;
    private byte tournamentLevel;
    private char matchNumber;
    private byte playNumber = 0x0; // NOT IMPLEMENTED
    private byte[] date = FMSDate.now(); // From FMSDate
    private short remainingTime;

    public UpdatePacket(byte[] controlByte, byte allianceStation, byte tournamentLevel, char matchNumber, byte[] date, short remainingTime) {
        this.controlByte = controlByte;
        this.allianceStation = allianceStation;
        this.tournamentLevel = tournamentLevel;
        this.matchNumber = matchNumber;
        this.date = date;
        this.remainingTime = remainingTime;
    }
}
