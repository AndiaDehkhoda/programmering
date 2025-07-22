import java.util.Scanner;

public class TextReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextStats stats = new TextStats();

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            stats.addLine(line);
        }

        System.out.println("Antal rader: " + stats.getLineCount());
        System.out.println("Antal tecken: " + stats.getCharacterCount());
    }
}