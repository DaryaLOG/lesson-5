public class Bird extends Animal
{
    public Bird(int run, float jump){
        super(run, jump);
        if (run > 5) {
            this.run = 5;
        }
        if (jump > 0.2f) {
            this.jump = 0.2f;
        }
    }
    @Override
    public void toRun(int distanse) {
        if (distanse > this.run) {
            System.out.println("Птица не добежала " + (distanse - this.run) + "м");
        } else {
            System.out.println("Птица пробежала");
        }
    }
    @Override
    public void toJump (float height) {
        if (height > this.jump) {
            System.out.println("Птица не допрыгнула " + (height - this.jump) + "м");
        } else {
            System.out.println("Птица прыгнула");
        }
    }
}



