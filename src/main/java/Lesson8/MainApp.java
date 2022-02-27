package Lesson8;

public  class MainApp {

    public static void main(String[] args) {

        Cat cat01 = new Cat ("Барсик", 1, 3);

        if (cat01.runAble(2) && cat01.jumpAble(10))
            System.out.println(cat01.getName() + " прошел дистанцию!");
        else
            System.out.println(cat01.getName() + " сошел с дистанции!");

        System.out.println("\n***\n");

        Robot robot01 = new Robot("Валли", 3, 15);

        if (robot01.runAble(2) && robot01.jumpAble(10))
            System.out.println(robot01.getName() + " прошел дистанцию!");
        else
            System.out.println(robot01.getName() + " сошел с дистанции!");

        System.out.println("\n***\n");

        Human human1=new Human("Петр", 10, 15);

        if (human1.runAble(2) && human1.jumpAble(10))
            System.out.println(robot01.getName() + " прошел дистанцию!");
        else
            System.out.println(robot01.getName() + " сошел с дистанции!");


    }
}
interface Runner {
    boolean jumpAble (int distance);
    boolean runAble (int lenght);
}

class Robot implements Runner {

    private String name;
    private int height;
    private int lenght;

    public Robot(String name, int height, int lenght) {
        this.name = name;
        this.height = height;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jumpAble(int distance) {
        if (distance <= this.height) {
            System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров!");
            return false;
        }
    }

    @Override
    public boolean runAble(int distance) {
        if (distance <= this.lenght) {
            System.out.println(name + " пробежал дистанцию " + distance + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров!");
            return false;
        }
    }
}

    class Human implements Runner {

    private String name;
    private int height;
    private int lenght;

    public Human(String name, int height, int lenght) {
        this.name = name;
        this.height = height;
        this.lenght = lenght;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean jumpAble(int distance) {
            if (distance <= this.height) {
                System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров");
                return false;
            }
        }

        @Override
        public boolean runAble(int distance) {
            if (distance <= this.lenght) {
                System.out.println(name + " пробежал дистанцию " + distance + " метров");
                return true;
            } else {
                System.out.println(name + " не смог пробежать " + distance + " метров");
                return false;
            }
        }
    }

    class Cat implements Runner {

        private String name;
        private int height;
        private int lenght;

        public Cat (String name, int height, int lenght) {
            this.name = name;
            this.height = height;
            this.lenght = lenght;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean jumpAble(int distance) {
            if (distance <= this.height) {
                System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров!");
                return false;
            }
        }

        @Override
        public boolean runAble(int distance) {
            if (distance <= this.lenght) {
                System.out.println(name + " пробежал дистанцию " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог пробежать " + distance + " метров!");
                return false;
            }
        }
    }
