package ru.geekbrains.homework6;

public class Dog extends Animal
{
    final float jumpHeight = 0.5f;
    final int runLength;
//  final int runLength = 500;
    final int swimLength = 10;

//  Разброс в ограничениях. Определяем "final int runLength" в одном из конструкторов.
    Dog(String name, String color, int age)
    {
        super(name, color, age);
        runLength = 500;
    }

    Dog(String name, String color, int age, int runLength)
    {
        super(name, color, age);
        this.runLength = runLength;
    }

// Если предположить, что необходимо будет динамически менять ограничения, например в следствии развития навыков,
// тогда нужно будет снимать "final" и прописывать "set" для каждого поля.
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
