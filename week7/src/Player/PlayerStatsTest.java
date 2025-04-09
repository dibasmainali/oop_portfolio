package Player;

public class PlayerStatsTest {
    public static void main(String[] args) {
        FootballStats Dibas = new FootballStats("Dibas Mainali", 900, 1000);
        CricketStats Bibas = new CricketStats("Bibas Mainali", 600, 25000);

        Dibas.showFootballStats();
        Bibas.showCricketStats();
    }
}


