package ru.geekbrains.homework6;

public class Animal
{
    protected String name;
    protected String color;
    protected int age;

    Animal(String name, String color, int age)
    {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    void jump( float height, float jumpHeight)
    {
        System.out.println(name + " jump = " + (height <= jumpHeight && height > 0));
    }

    void run(int length, int runLength)
    {
        System.out.println(name + " run = " +(length <= runLength && length > 0));
    }

    void swim(int length, int swimLength)
    {
        System.out.println(name + " swim = " + (length <= swimLength && length > 0));
    }
}
