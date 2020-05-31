package ru.geekbrains.homework6;

public class Cat extends Animal
{
    final float jumpHeight = 2f;
    final int runLength = 200;
    final int swimLength = 0;

    Cat(String name, String color, int age)
    {
        super(name, color, age);
    }

    void jump( float height)
    {
        super.jump(height, jumpHeight);
    }

    void run(int length)
    {
        super.run(length, runLength);
    }

    void swim(int length)
    {
        super.swim(length, swimLength);
    }
}
