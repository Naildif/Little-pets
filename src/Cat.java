public class Cat extends Animal {
      private int lives;

    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = 9;
    }
    @Override
    public void makeSound() {
        System.out.println("Miam, miuau, miamiauuuu");
    }

    @Override
    public void showDetails(){
        String catName = getName();
        int catAge = getAge();
        System.out.println("Name: "+getName() + "\nAge: "+getAge()+ "\nLives left: "+lives);
    }

    public void loseLives() {
        if (lives > 0) {
            lives--;
        }
    }

    public int getLives() {
            return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}




