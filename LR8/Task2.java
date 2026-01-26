package LR8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        if (createInputFile(inputFile)) {
            System.out.println("Исходный файл создан: " + inputFile);
        } else {
            System.err.println("Ошибка при создании исходного файла.");
            return;
        }

        if (processAndWriteOutput(inputFile, outputFile)) {
            System.out.println("Результат записан в: " + outputFile);
        } else {
            System.err.println("Ошибка при обработке файла или записи результата.");
        }
    }

    private static boolean createInputFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(filename), StandardCharsets.UTF_8))) {

            writer.write("Первая строка текста");
            writer.newLine();
            writer.write("Вторая строка текста");
            writer.newLine();


            double[] numbers = {3.14, -2.5, 0.0, 7.8, -10.2};
            for (double num : numbers) {
                writer.write(String.valueOf(num));
                writer.newLine();
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean processAndWriteOutput(String input, String output) {
        List<String> lines = new ArrayList<>();
        List<Double> positiveNumbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(input), StandardCharsets.UTF_8))) {

            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {

                    lines.add(line);
                } else if (lineCount > 2) {

                    try {
                        double num = Double.parseDouble(line);
                        if (num > 0) {
                            positiveNumbers.add(num);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Не удалось преобразовать в число: " + line);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(output), StandardCharsets.UTF_8))) {

            if (!lines.isEmpty()) {
                writer.write(lines.get(0));
                writer.newLine();
            }

            for (Double num : positiveNumbers) {
                writer.write(String.valueOf(num));
                writer.newLine();
            }

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}