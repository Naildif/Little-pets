public class Bird extends Animal{
    private String spieces;
    private boolean canFly;

    public Bird(String name, int age, String spieces, boolean canFly){
        super(name,age);
        this.spieces = spieces;
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("(•ө•)♡˙✧˖Tweet, tweet°⋆｡˚");
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + getName() + "\nSpecies: " + spieces +
                "\nAge: " + getAge());
    }
    public void fly(){
        if(canFly){
            System.out.println(getName() + " can fly high in the sky! ✧*｡");
        }else {
            System.out.println(getName() + " can't fly but is still adorable! ♥");
        }
    }

    public String getSpieces() {
        return spieces;
    }

    public void setSpieces(String spieces) {
        this.spieces = spieces;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
