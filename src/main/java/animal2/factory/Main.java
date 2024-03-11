package animal2.factory;

import animal2.data.CommandData;
import animal2.pets.Animal2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        ArrayList<Animal2>animals = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите команду (add/list/exit):");
        String commandStr = scanner.next();
        CommandData commandData = CommandData.valueOf(commandStr);


    }
}
