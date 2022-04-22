package homework;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReadWriteExamples {

    public static void main(String[] args) throws Exception {
        readFileExample();
    }

    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static void readFileExample() throws Exception {
        int initialLength = 0;
        Path txt = Path.of("texts-examples", "read-write-example.txt");
        try (Scanner in = new Scanner(txt, StandardCharsets.UTF_8)) {
            String word = in.next();
            int[] myArray = new int[Integer.parseInt(word)];
            for (int i = 0; i < Integer.parseInt(word); i++) {
                String next = in.next();
                if (next.length() > initialLength) {
                    initialLength = next.length();
                }
                myArray[i] = Integer.parseInt(next);
            }

            System.out.println(initialLength);

            try (PrintStream outFile = new PrintStream("texts-examples/a.txt", StandardCharsets.UTF_8)) {
                for (int j : myArray) {
                    int count = getCountsOfDigits(j);
                    System.out.println(count);
                    for (int i = 0; i < initialLength - count; i++) {
                        outFile.print(" ");
                    }
                    outFile.print(j);
                    outFile.println();
                    outFile.flush();
                }
            }
        }
    }
}
