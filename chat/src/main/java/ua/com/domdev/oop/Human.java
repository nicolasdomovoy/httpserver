package ua.com.domdev.oop;

public class Human extends Mammal{
    private final String surname;

    public Human(String name, String move, String voice, String surname){
        super(name, move, voice);
        this.surname = surname;
    }

    @Override
    public String getVoice() {
        return "Human says: " + super.getVoice();
    }

    @Override
    public void printMove() {
        System.out.println(super.move());
    }
}
