package Lesson8;

import java.util.Random;

public  class MainApp {

    public static Random random = new Random();

    public static void main(String[] args) {

       /* int length = random.nextInt(10)+1;
        int heigth = random.nextInt(10)+1;*/

        Runner cat01 = new Cat ("Барсик", random.nextInt(10)+1, random.nextInt(10)+1);
        Runner robot01 = new Robot("Валли", random.nextInt(10)+1, random.nextInt(10)+1);
        Runner human1=new Human("Петр", random.nextInt(10)+1, random.nextInt(10)+1);

        Runner [] rivals =new Runner[3];
        rivals [0] = robot01;
        rivals [1] = cat01;
        rivals [2] = human1;

        int distanceHeigth = random.nextInt(10)+1;
        int distanceLength = random.nextInt(10)+1;

        for (Runner a: rivals) {
            System.out.println(a);
            if (a.jumpAble(distanceHeigth) && a.runAble(distanceLength)){

                System.out.println( " прошел дистанцию!\n ***\n");}
            else
                System.out.println(" сошел с дистанции!\n ***\n");
        }
    }
}

interface Runner {

    boolean jumpAble (int distance);
    boolean runAble (int length);
}

class Robot implements Runner {

    private String name;
    private int heigth;
    private int length;

    public Robot(String name, int heigth, int length) {
        this.name = name;
        this.heigth = heigth;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean jumpAble(int distance) {
        if (distance <= this.heigth) {
            System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров!");
            return false;
        }
    }

    @Override
    public boolean runAble(int distance) {
        if (distance <= this.length) {
            System.out.println(name + " пробежал дистанцию " + distance + " метров!");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров!");
            return false;
        }
    }

    public String toString() {
        return String.format("%s, имеет способность перепрыгивать препятствие высотой %d метров, " +
                "и пробегать трассы длиной %d километров \n", name, heigth, length );
    }
}

    class Human implements Runner {

        private String name;
        private int heigth;
        private int length;

        public Human(String name, int heigth, int length) {
            this.name = name;
            this.heigth = heigth;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean jumpAble(int distance) {
            if (distance <= this.heigth) {
                System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров");
                return false;
            }
        }

        @Override
        public boolean runAble(int distance) {
            if (distance <= this.length) {
                System.out.println(name + " пробежал дистанцию " + distance + " метров");
                return true;
            } else {
                System.out.println(name + " не смог пробежать " + distance + " метров");
                return false;
            }
        }

        public String toString() {
            return String.format("%s, имеет способность перепрыгивать препятствие высотой %d метров, " +
                    "и пробегать трассы длиной %d километров!\n", name, heigth, length);
        }
    }

    class Cat implements Runner {

        private String name;
        private int heigth;
        private int length;

        public Cat(String name, int heigth, int length) {
            this.name = name;
            this.heigth = heigth;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean jumpAble(int distance) {
            if (distance <= this.heigth) {
                System.out.println(name + " перепрыгнул препятствие высотой " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог перепрыгнуть препятствие высотой " + distance + " метров!");
                return false;
            }
        }

        @Override
        public boolean runAble(int distance) {
            if (distance <= this.length) {
                System.out.println(name + " пробежал дистанцию " + distance + " метров!");
                return true;
            } else {
                System.out.println(name + " не смог пробежать " + distance + " метров!");
                return false;
            }
        }

        public String toString() {
            return String.format("%s, имеет способность перепрыгивать препятствие высотой %d метров, " +
                    "и пробегать трассы длиной %d километров! \n", name, heigth, length);
        }
    }
