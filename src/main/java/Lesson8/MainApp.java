package Lesson8;

public  class MainApp {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Барсик");
        cat01.jump(3);
        cat01.run(5);
        Robot robot01 = new Robot("Валли");
        robot01.run(10);
        robot01.jump(2);
        Human human1=new Human("Петр");
        human1.jump(1);
        human1.run(10);

    }
}

interface Runnable {
    void run (int distance);
    void jump (int distance);
}

class Robot implements Runnable {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.printf ("%s пробежал %d километров.\n", name, distance);
    }

    @Override
    public void jump(int distance) {
        System.out.printf("%s перепрыгнул %d метров! \n", name, distance);
    }
}

class Human implements Runnable {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s пробежал %d километров.\n", name, distance);
    }

    @Override
    public void jump(int distance) {
        System.out.printf("%s перепрыгнул %d метров! \n", name, distance);
    }
}

class Cat implements Runnable {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s пробежал %d километров.\n", name, distance);
    }

    @Override
    public void jump(int distance) {
        System.out.printf("%s перепрыгнул %d метров! \n", name, distance);
    }
}