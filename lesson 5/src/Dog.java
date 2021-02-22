public class Dog extends Animal
{
    public Dog(int run, float jump, int swimming) {
        super(run, jump);
        this.swimming = swimming;
        if (run > 500) {
            this.run = 500;

        }
        if (jump > 0.5f) {
            this.jump = 0.5f;
        }

    }
    @Override
    public void toRun(int distanse){
        if (distanse>this.run) {
            System.out.println("Собака не добежала " + (distanse-this.run) + "м");
        }
        else {
            System.out.println("Собака пробежала");

        }

    }
    @Override
    public void toJump (float height){
        if (height>this.jump) {
            System.out.println("Собака не допрыгнула " + (height-this.jump) + "м");
        }
        else {
            System.out.println("Собака прыгнула");
        }
    }
    @Override
    public void toSwimming (int lenght){
        if (lenght>this.swimming){
            System.out.println("Собака не допроплыла " + (lenght-this.swimming) + "м");
        }
        else {
            System.out.println("Собака проплыла");
        }
    }

}
