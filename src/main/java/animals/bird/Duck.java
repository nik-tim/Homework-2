package animals.bird;

import animals.pets.Animal;

public class Duck extends Animal implements Flying {

    public Duck() {
    }

    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Кря!");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу!");
    }
}
