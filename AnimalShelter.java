package Queues;
import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null;
        } else if (dogs.isEmpty()) {
            return cats.pollFirst();
        } else if (cats.isEmpty()) {
            return dogs.pollFirst();
        }

        Dog oldestDog = dogs.peekFirst();
        Cat oldestCat = cats.peekFirst();

        if (oldestDog.getArrivalTime() < oldestCat.getArrivalTime()) {
            return dogs.pollFirst();
        } else {
            return cats.pollFirst();
        }
    }

    public Dog dequeueDog() {
        return dogs.pollFirst();
    }

    public Cat dequeueCat() {
        return cats.pollFirst();
    }
}