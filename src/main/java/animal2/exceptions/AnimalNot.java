package animal2.exceptions;

import animal2.data.AnimalData;

public class AnimalNot extends Exception{
    public AnimalNot(AnimalData animalData){
        super(String.format("Animal %s not supported",animalData.name()));
    }
}
