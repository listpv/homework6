package ru.geekbrains.homework6;

public class Practice6
{

 /*   1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
        В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
        или высоту (для прыжков).
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
        собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
        (Например, dog1.run(150); -> результат: run: true)
        5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м.,
        у другой 600 м.*/
    public static void main(String[] args)
    {
        Cat cat = new Cat("Barsik","red",3);
        Dog dog1 = new Dog("Bobik","black", 4);
        Dog dog2 = new Dog("Sharik","white", 5, 400);
        Dog dog3 = new Dog("Druzhok","grey", 6, 600);

        Animal[] zoo = {cat, dog1, dog2, dog3};

//   Например, все животные должны пробежать 250 метров, прыгнуть на 1 метр, проплыть 5 метров.
        int distanceRun = 250;
        float heightJump = 1f;
        int distanceSwim = 5;
        for(int i = 0; i < zoo.length; i++)
        {
            if(zoo[i] instanceof Cat)
            {
                ((Cat)zoo[i]).run(distanceRun);
                ((Cat)zoo[i]).jump(heightJump);
                ((Cat)zoo[i]).swim(distanceSwim);
            }
            if(zoo[i] instanceof Dog)
            {
                ((Dog)zoo[i]).run(distanceRun);
                ((Dog)zoo[i]).jump(heightJump);
                ((Dog)zoo[i]).swim(distanceSwim);
            }
            System.out.println();
        }
    }
}
