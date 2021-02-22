public class Cat extends Animal
{
    public Cat(int run, float jump){
        super(run, jump);
        if (run > 200) {
            this.run = 200;
        }
        if (jump > 2.0f) {
            this.jump = 2.0f;
        }
    }
    @Override
    public void toRun(int distanse) {
        if (distanse > this.run) {
            System.out.println("Кошка не добежала " + (distanse - this.run) + "м");
        } else {
            System.out.println("Кошка пробежала");
        }
    }
    @Override
    public void toJump (float height) {
        if (height > this.jump) {
            System.out.println("Кошка не допрыгнула " + (height - this.jump) + "м");
        } else {
            System.out.println("Кошка прыгнула");
        }
    }
}






