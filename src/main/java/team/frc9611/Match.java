package team.frc9611;

public class Match {
    private String matchName;
    private int tournamentLevel;
    private short remainingTime;


    public enum TOURNAMENT_LEVEL {
        MATCH_TEST((byte) 0x0), PRACTICE((byte) 0x0), QUALIFICATION((byte) 0x02), PLAYOFF((byte) 0x03);

        public byte eq;
        TOURNAMENT_LEVEL(byte eq) {this.eq = eq;}
    }
}
