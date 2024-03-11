package animal2.factory;

import animal2.bird.Duck2;
import animal2.data.AnimalData;
import animal2.exceptions.AnimalNot;
import animal2.pets.Animal2;
import animal2.pets.Cat2;
import animal2.pets.Dog2;

public class AnimalFactory {
    public Animal2 create(AnimalData animalData) throws AnimalNot {
        return switch (animalData) {
            case DUCK -> new Duck2();
            case DOG -> new Dog2();
            case CAT -> new Cat2();
        };
    }
}
