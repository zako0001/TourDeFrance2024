package Euro2024DKMaalscorer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

class StatisticsTest {

    static Statistics statistics;

    @BeforeAll
    static void beforeAll() throws FileNotFoundException {

        // Arrange
        statistics = new Statistics("src/main/resources/tdffinishers2024.csv");
    }

    @DisplayName("Correct number of teams")
    @Test
    void getTeams1() {

        // Act
        int numberOfTeams = statistics.getTeams().size();

        // Assert
        assertEquals(22, numberOfTeams);
    }

    @DisplayName("Two of the teams are read correctly")
    @Test
    void getTeams2() {

        // Act
        boolean setContainsTheseTwoTeams =
            statistics.getTeams().contains("UAE TEAM EMIRATES") &&
            statistics.getTeams().contains("ASTANA QAZAQSTAN TEAM");

        // Assert
        assertTrue(setContainsTheseTwoTeams);
    }

    @DisplayName("Can read two different cyclists each from two different teams")
    @Test
    void getTeamMembers() {

        // Act
        boolean setContainsTheseTwoTeams =
            statistics.getTeamMembers("UAE TEAM EMIRATES").contains("TADEJ POGAČAR") &&
            statistics.getTeamMembers("UAE TEAM EMIRATES").contains("JOAO ALMEIDA") &&
            statistics.getTeamMembers("ASTANA QAZAQSTAN TEAM").contains("DAVIDE BALLERINI") &&
            statistics.getTeamMembers("ASTANA QAZAQSTAN TEAM").contains("MARK CAVENDISH");

        // Assert
        assertTrue(setContainsTheseTwoTeams);
    }
}