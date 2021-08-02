package ua.com.domdev.oop;

public abstract class Animal {
    private final String name;
    private String move;

    public Animal(String name, String move) {
        this.name = name;
        this.move = move;
    }

    public Animal() {
        this.name = "Default";
        this.move = "None";
    }


    public String move() {
        return this.move;
    }

    public void printMove() {
        System.out.println(move());
    }
}
