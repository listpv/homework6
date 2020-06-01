package ru.geekbrains.homework6;

public class AnimalExtra
{
    protected String name;
    protected String color;
    protected int age;
    float jumpHeight;
    int runLength;
    int swimLength;

    AnimalExtra(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    void jump( float height)
    {
        System.out.println(name + " jump = " + (height <= jumpHeight && height > 0));
    }

    void run(int length)
    {
        System.out.println(name + " run = " +(length <= runLength && length > 0));
    }

    void swim(int length)
    {
        System.out.println(name + " swim = " + (length <= swimLength && length > 0));
    }
}
