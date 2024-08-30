public class Cat extends Animal {
    private int lives;

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
        this.lives = 9;
    }

    @Override
    public void makeSound() {
        System.out.println("≽^•༚• ྀི≼ ᵐᵉᵒʷ ᵐᵉᵒʷ ≽ܫ≼");
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + getName() + "\nBreed: " + getBreed() +
                "\nAge: " + getAge() + "\nNumber of lives: " + lives);
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




