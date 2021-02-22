public class Horse extends Animal
{
    public Horse(int run, float jump, int swimming){
        super(run, jump);
        this.swimming = swimming;
        if (run > 1500) {
            this.run = 1500;
        }
        if (jump > 3.0f) {
            this.jump = 3.0f;
        }
    }

    @Override
    public void toRun(int distanse) {
        if (distanse > this.run) {
            System.out.println("Лошадь не добежала " + (distanse - this.run) + "м");
        } else {
            System.out.println("Лошадь пробежала");
        }
    }
    @Override
    public void toJump (float height) {
        if (height > this.jump) {
            System.out.println("Лошадь не допрыгнула " + (height - this.jump) + "м");
        } else {
            System.out.println("Лошадь прыгнула");
        }
    }
    @Override
    public void toSwimming (int lenght){
        if (lenght>this.swimming){
            System.out.println("Лошадь не допроплыла " + (lenght-this.swimming) + "м");
        }
        else {
            System.out.println("Лошадь проплыла");
        }
    }

}


