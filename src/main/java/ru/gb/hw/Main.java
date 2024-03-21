package ru.gb.hw;

/**
 * Задание:
 * +1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
 * а кот пытается покушать 15-20).
 * 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
 * (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть
 * не может быть наполовину сыт (это сделано для упрощения логики программы).
 * 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о
 * сытости котов в консоль.
 * 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 4);
        cats[2] = new Cat("Busya", 3);
        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " " + (cat.isSatiety() ? "наетый" : "голодный"));
        }

        //добавим в тарелку еще еды
        plate.setFood(10);
        System.out.println("Добавили в тарелку еды ");
        plate.info();
    }

}