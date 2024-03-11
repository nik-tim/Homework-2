package animal2.pets;

public abstract class Animal2 {
    private String name;
    private String color;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }
    public void Eat() {
        System.out.println("Я ем");
    }
    public String toString() {
        String ageStr;
        if (age % 10 == 1 && age % 100 != 11) {
            ageStr = age + " год";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            ageStr = age + " года";
        } else {
            ageStr = age + " лет";
        }
            return "Привет! меня зовут " + name + ",мне " +ageStr+",я вешу - " +weight +" "+"кг," + " мой цвет - "+color;

        }
    public abstract void say();
}





