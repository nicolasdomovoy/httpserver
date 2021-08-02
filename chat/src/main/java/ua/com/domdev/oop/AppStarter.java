package ua.com.domdev.oop;

import java.util.ArrayList;
import java.util.List;

public class AppStarter {

    public static void main(String[] args) {
//        Animal animal = new Animal("Root animal", "no legs - no move");
        Fish fish = new Fish("Whale", "bulb bulb");
        Mammal mammal = new Mammal("Dog", "Run run", "Gav-gav");
        Human human = new Human("Ivan", "Run, Ivan! Run!!!", "What???", "Ivanov");

//        System.out.println(animal.move());
        System.out.println(fish.move());
        System.out.println(mammal.move());
        System.out.println(human.move());

        Animal fromFish = fish;
        System.out.println(fromFish.move());

        Animal fromMammal = mammal;
        System.out.println(fromMammal.move());

        Mammal fromHuman = human;
        System.out.println(fromHuman.getVoice());

        List<Animal> animals = new ArrayList<>();
//        animals.add(animal);
        animals.add(mammal);
        animals.add(fish);
        animals.add(fromHuman);

        System.out.println("__________________");

        for (Animal animal1 : animals) {
            animal1.printMove();
        }

        System.out.println("");

    }

}
