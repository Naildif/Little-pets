abstract class Animal{
   private String name;
   private int age;

   public Animal(String name, int age){
      this.age = age;
      this.name =name;
   }
   public abstract void makeSound();
   public abstract void showDetails();

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}