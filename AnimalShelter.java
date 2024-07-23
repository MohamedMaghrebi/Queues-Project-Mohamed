package Queues;
import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Animal> animals = new LinkedList<>();
//    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            animals.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            animals.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (animals.isEmpty() && animals.isEmpty()) {
            return null;
        } else if (animals.isEmpty()) {
            return animals.pollFirst();
        } else if (animals.isEmpty()) {
            return animals.pollFirst();
        }

        Animal oldestDog = animals.peekFirst();
        Animal oldestCat =  animals.peekFirst();

        if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) {
            return animals.pollFirst();
        } else {
            return animals.pollFirst();
        }
    }

    public Dog dequeueDog() {
        return (Dog) animals.pollFirst();
    }

    public Cat dequeueCat() {
        return (Cat) animals.pollFirst();
    }

    public void printShelterList() {
        System.out.println("Animals In Shelter");
        if(animals.isEmpty()){
            System.err.println("Shelter Has No Animals In It");
        } else{
            for(Animal animal: animals){

                System.out.println(" Animal Name: "+ animal.getName() + " Animal Breed: "+  animal.getBreed());
            }

        }


    }
}