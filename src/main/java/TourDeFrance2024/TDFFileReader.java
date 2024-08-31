package TourDeFrance2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {

    // Attribute
    private final Scanner scanner;

    // Constructor
    public TDFFileReader(String fileName) throws FileNotFoundException {

        scanner = new Scanner(new File(fileName));
    }

    // Method
    public List<Cyclist> readFile() {

        List<Cyclist> cyclists = new ArrayList<>();

        while (scanner.hasNextLine()) {

            String[] lineSegments = scanner.nextLine().split(";");

            String name = lineSegments[1];
            String team = lineSegments[2];

            cyclists.add(new Cyclist(name, team));
        }

        return cyclists;
    }
}