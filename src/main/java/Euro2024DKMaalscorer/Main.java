package Euro2024DKMaalscorer;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Statistics statistics = new Statistics("src/main/resources/tdffinishers2024.csv");

        System.out.println(statistics.getTeams());
        System.out.println(statistics.getTeamsWithMembers());
        System.out.println(statistics.getTeamMembers("UAE TEAM EMIRATES"));
    }
}