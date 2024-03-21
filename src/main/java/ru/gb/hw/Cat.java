package ru.gb.hw;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            System.out.println(name + " ест...");
            plate.decreaseFood(appetite);
            System.out.println(name + " съел " + appetite + " кусочков еды");
            this.satiety = true;
        } else {
            System.out.println("Недостаточно еды для " + name + " в тарелке");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {

        return appetite;
    }

    public String getName() {
        return this.name;
    }
}
