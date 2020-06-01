package ru.geekbrains.homework6;

public class CatExtra extends AnimalExtra
{
    CatExtra(String name, String color, int age)
    {
        super(name, color, age);
        super.jumpHeight = 2f;
        super.runLength = 200;
        super.swimLength = 0;
    }
}
