package Generic;

public class GenericMain {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("Adelaide Crows");
        footballPlayerTeam.addPlayer(joe);

        System.out.println(footballPlayerTeam.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Clubs");
        baseballPlayerTeam.addPlayer(pat);

        System.out.println(baseballPlayerTeam.numPlayers());
    }
}
