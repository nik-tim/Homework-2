package animals.pets;

import java.util.Scanner;

public class AnimalInfo {
    public static void AnimalInfo(Scanner scanner) {
        System.out.println("Введите возраст животного:");
        int age = 0;
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
            if (age < 0) {
                throw new IllegalArgumentException("Возраст животного не может быть отрицательным!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод возраста,повторите попытку!");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Введите вес животного:");
        double weight = 0;
        try {
            weight = Double.parseDouble(scanner.nextLine().trim());
            if (weight < 0) {
                throw new IllegalArgumentException("Вес животного не может быть отрицательным!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод веса,повторите попытку!");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
