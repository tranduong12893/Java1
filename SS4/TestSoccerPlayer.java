package SS4;

public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer objSoccerPlayer = new SoccerPlayer();
        objSoccerPlayer.run();
        objSoccerPlayer.display();
        System.out.println();
        objSoccerPlayer.jump();
        objSoccerPlayer.display();
        System.out.println();
        objSoccerPlayer.kickBall();
        objSoccerPlayer.display();
        System.out.println();
    }
}
