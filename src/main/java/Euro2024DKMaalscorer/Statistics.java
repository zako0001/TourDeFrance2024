package Euro2024DKMaalscorer;

import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    // Attributes
    private final Map<String, Set<String>> teamsWithMembers;

    // Constructor
    public Statistics(String filename) throws FileNotFoundException {

        List<Cyclist> cyclists = new TDFFileReader(filename).readFile();
        teamsWithMembers = new HashMap<>();

        for (Cyclist cyclist : cyclists) {

            teamsWithMembers.putIfAbsent(cyclist.team(), new HashSet<>());
            teamsWithMembers.get(cyclist.team()).add(cyclist.name());
        }
    }

    // Getters
    public Set<String> getTeams() {
        return teamsWithMembers.keySet();
    }

    public Map<String, Set<String>> getTeamsWithMembers() {
        return teamsWithMembers;
    }

    public Set<String> getTeamMembers(String team) {
        return teamsWithMembers.get(team);
    }
}