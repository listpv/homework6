package ru.geekbrains.homework6;

public class PracticeExtra
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
        CatExtra cat = new CatExtra("Barsik","red",3);
        DogExtra dog1 = new DogExtra("Bobik","black", 4);
        DogExtra dog2 = new DogExtra("Sharik","white", 5, 400);
        DogExtra dog3 = new DogExtra("Druzhok","grey", 6, 600);

        AnimalExtra[] zoo = {cat, dog1, dog2, dog3};

//        Например, все животные должны пробежать 250 метров, прыгнуть на 1 метр, проплыть 5 метров.
        int distanceRun = 200;
        float heightJump = 1f;
        int distanceSwim = 5;

        for(int i = 0; i < zoo.length; i++)
        {
            zoo[i].run(distanceRun);
            zoo[i].jump(heightJump);
            zoo[i].swim(distanceSwim);
            System.out.println();
        }
    }
}
