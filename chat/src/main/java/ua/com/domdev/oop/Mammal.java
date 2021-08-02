package ua.com.domdev.oop;

public class Mammal extends Animal {
    private final String voice;

    public Mammal(String name, String move, String voice) {
        super(name, move);
        this.voice = voice;
    }

    @Override
    public void printMove() {
        System.out.println("Greetings from mammals - " + super.move());
    }

    public String getVoice() {
        return voice;
    }
}
