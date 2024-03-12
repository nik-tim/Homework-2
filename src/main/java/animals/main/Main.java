package animals.main;

import animals.data.Command;
import animals.pets.Animal;
import animals.bird.Duck;
import animals.pets.Cat;
import animals.pets.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            String command = scanner.nextLine().trim().toLowerCase();

            Command commandEnum = null;
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
                    Animal animal = null;
                    while (animal == null) {
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
                                System.out.println("Неизвестное животное. Повторите ввод:");
                                animalType = scanner.nextLine().trim().toLowerCase();
                        }
                    }
                    System.out.println("Введите имя животного:");
                    String name = scanner.nextLine().trim();
                    animal.setName(name);
                    System.out.println("Введите цвет животного:");
                    String color = scanner.nextLine().trim();
                    animal.setColor(color);

                    int age = 0;
                    boolean validAge = false;
                    while (!validAge) {
                        System.out.println("Введите возраст животного:");
                        try {
                            age = Integer.parseInt(scanner.nextLine().trim());
                            if (age < 0) {
                                throw new IllegalArgumentException("Возраст животного не может быть отрицательным!");
                            }
                            validAge = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод возраста,повторите попытку!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    animal.setAge(age);

                    double weight = 0;
                    boolean validWeight = false;
                    while (!validWeight) {
                        System.out.println("Введите вес животного:");
                        try {
                            weight = Double.parseDouble(scanner.nextLine().trim());
                            if (weight < 0) {
                                throw new IllegalArgumentException("Вес животного не может быть отрицательным!");
                            }
                            validWeight = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Неверный ввод веса,повторите попытку!");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    animal.setWeight(weight);
                    animals.add(animal);
                    animal.say();
                    break;
                case LIST:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст");
                        break;
                    }
                    for (Animal animal1 : animals) {
                        System.out.println(animal1.toString());
                    }
                    break;
                case EXIT:
                    System.out.println("До свидания!");
                    return;
            }
        }
    }
}


