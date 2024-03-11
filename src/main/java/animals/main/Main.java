package animals.main;

import animals.data.Command;
import animals.pets.Animal;
import animals.bird.Duck;
import animals.pets.Cat;
import animals.pets.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            String command = scanner.nextLine().trim().toLowerCase();

            Command commandEnum= null;
            try {
                commandEnum = Command.valueOf(command.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Неизвестная команда");
                continue;
            }

            switch (commandEnum) {
                case ADD:
                    System.out.println("Какое животное вы хотите добавить (cat/dog/duck):");
                    String animalType = scanner.nextLine().trim().toLowerCase();
                    System.out.println("Введите имя животного:");
                    String name = scanner.nextLine().trim();
                    System.out.println("Введите цвет животного:");
                    String color = scanner.nextLine().trim();

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

                    Animal animal;
                    switch (animalType) {
                        case "cat":
                            animal = new Cat();
                            break;
                        case "dog":
                            animal = new Dog();
                            break;
                        case "duck":
                            animal = new Duck();
                            break;
                        default:
                            System.out.println("Неизвестное животное");
                            continue;
                    }
                    animals.add(animal);
                    animal.say();
                    break;
                default:
                case LIST:
                    if (animals.isEmpty()){
                        System.out.println("Список животных пустой");
                        break;
                    }
                    break;
                case EXIT:
                    System.exit(0);
                   System.out.println("До свидания!");

            }
        }
    }
}