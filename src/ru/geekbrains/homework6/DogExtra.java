package ru.geekbrains.homework6;

public class DogExtra extends AnimalExtra
{

    DogExtra(String name, String color, int age)
    {
        super(name, color, age);
        super.jumpHeight = 0.5f;
        super.runLength = 500;
        super.swimLength = 10;
    }

    //  Разброс в ограничениях. Определяем "int runLength" в одном из конструкторов.
    DogExtra(String name, String color, int age, int runLength)
    {
        super(name, color, age);
        super.jumpHeight = 0.5f;
        super.swimLength = 10;
        super.runLength = runLength;
    }

}
