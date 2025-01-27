class Animal{
    String name ;
    int age;
    
    public Animal(String name , int age ){
    this.name = name;
    this.age = age ;
      }
     public void makeSound(){
        System.out.println("Animal makes sound");
     };
        }
    class Dog extends Animal{
    
    public Dog(String name , int age){
    super(name,age);
    }
    public void makeSound(){
        System.out.println("Name of the dog is"+ name);
        System.out.println(" and Age is "+ age);
    System.out.println("The Dogs are Barking");
          }
       }
    
    class Cat extends Animal{
    public Cat(String name , int age){
        super(name , age);
    }
    public void makeSound(){
        System.out.println("Name of the cat is"+ name);
        System.out.println("and Age is "+ age);
    System.out.println(" The cat is Mewing");
         }
         }
    class Bird extends Animal {
        public Bird(String name , int age){
            super(name , age);
        }
        public void makeSound(){
            System.out.println("Name of the bird is "+ name);
            System.out.println(" and Age is "+ age);
            System.out.println(" The cat is Mewing");


        }
    }
    public class AnimalSound{
     public static void main(String[] args) {
        
        Dog dog = new Dog("Husky", 7);
        Cat cat = new Cat("Persian",5);
        Bird bird = new Bird("Eagle", 8);
        
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
     }

    }