package Faculties;

import Faculties.Hogwarts;


public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int unerring;
    private int honesty;

    public Hufflepuff(String fullName, int magic, int transgress, int hardworking, int unerring, int honesty) {
        super(fullName, magic, transgress);
        this.hardworking = hardworking;
        this.unerring = unerring;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getUnerring() {
        return unerring;
    }

    public void setUnerring(int unerring) {
        this.unerring = unerring;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public int sumCharacter()
    {
        return hardworking + unerring+ honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardworking=" + hardworking +
                ", unerring=" + unerring +
                ", honesty=" + honesty;
    }
}
