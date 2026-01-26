package LR8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task3{
    public static void main(String[] args) {
        String inputPath = "Z:\\Pushkin.txt";
        String outputPath = "Z:\\consonants_output.txt";


        String consonantsRegex = "(?iu)^[бвгджзйклмнпрстфхцчшщ].*";

        try {

            List<String> lines = Files.readAllLines(Paths.get(inputPath), StandardCharsets.UTF_8);

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath), StandardCharsets.UTF_8)) {
                for (int i = 0; i < lines.size(); i++) {
                    String currentLine = lines.get(i);

                    String[] words = currentLine.split("[\\s,.;:!?—]+");

                    StringBuilder foundWords = new StringBuilder();
                    int count = 0;

                    for (String word : words) {

                        if (!word.isEmpty() && word.matches(consonantsRegex)) {
                            foundWords.append(word).append(" ");
                            count++;
                        }
                    }

                    if (count > 0) {
                        writer.write("Строка " + (i + 1) + ": " + foundWords.toString().trim());
                        writer.newLine();
                        writer.write("Количество слов: " + count);
                        writer.newLine();
                        writer.write("---------------------------");
                        writer.newLine();
                    }
                }
            }
            System.out.println("Обработка завершена. Результаты в файле: " + outputPath);

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}