package Queues;
public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        Cat tiger = new Cat("Tiger", "Selkirk Rex", "Male", 4, System.currentTimeMillis());
        Dog leo = new Dog("Leo", "Golden Retriever", "Male", 5, System.currentTimeMillis());
        Dog ginger = new Dog("Ginger", "Havanese", "Female", 6, System.currentTimeMillis() + 1); // Ensure different arrival time

        shelter.enqueue(tiger);
        shelter.enqueue(leo);
        shelter.enqueue(ginger);

        Animal adoptedCat = shelter.dequeueCat();
        Animal adoptedAny = shelter.dequeueAny();
        Animal adoptedDog = shelter.dequeueDog();

        System.out.println("DequeueCat: " + adoptedCat.getName() + " (" + adoptedCat.getBreed() + ", " + adoptedCat.getGender() + ", " + adoptedCat.getAge() + " years old)");
        System.out.println("DequeueAny: " + adoptedAny.getName() + " (" + adoptedAny.getBreed() + ", " + adoptedAny.getGender() + ", " + adoptedAny.getAge() + " years old)");
        System.out.println("DequeueDog: " + adoptedDog.getName() + " (" + adoptedDog.getBreed() + ", " + adoptedDog.getGender() + ", " + adoptedDog.getAge() + " years old)");
    }
}