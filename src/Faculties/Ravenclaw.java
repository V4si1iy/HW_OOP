package Faculties;

import Faculties.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String fullName, int magic, int transgress, int smart, int wisdom, int wit, int creativity) {
        super(fullName, magic, transgress);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public int sumCharacter()
    {
        return smart+ wisdom+ wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString()+
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
