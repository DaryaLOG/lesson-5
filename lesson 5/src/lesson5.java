public class lesson5
{
    public static void main(String[] args) {

        Dog dog = new Dog(505, 0.5f, 10);
        dog.toRun(300);
        dog.toRun(505);
        dog.toJump(0.7f);
        dog.toJump(0.5f);
        dog.toSwimming(11);
        dog.toSwimming(9);

        Horse horse = new Horse(1500, 3.0f, 100);
        horse.toRun(1600);
        horse.toRun(1400);
        horse.toJump(3.2f);
        horse.toJump(3.0f);
        horse.toSwimming(102);
        horse.toSwimming(99);

        Bird bird = new Bird(5, 0.2f);
        bird.toRun(7);
        bird.toRun(4);
        bird.toJump(0.3f);
        bird.toJump(0.1f);

        Cat cat = new Cat(200, 2);
        cat.toRun(250);
        cat.toRun(170);
        cat.toJump(3);
        cat.toJump(1);

    }

}