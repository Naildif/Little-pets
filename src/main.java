public class main {
    public static void main(String[] args) {

    Cat myBaby = new Cat("Sashimy","Wirehair",1);
    myBaby.makeSound();
    myBaby.loseLives();
    myBaby.loseLives();
    myBaby.showDetails();
    Bird firstBird = new Bird("Roberto",3, "chicken", false);
    firstBird.makeSound();
    firstBird.showDetails();
    firstBird.fly();
    Dog firstDog = new Dog("Tupac", "Labrador",2,1.12);
    firstDog.makeSound();
    firstDog.showDetails();
    firstDog.command();
    }
}
