package Faculties;

import Faculties.Hogwarts;

import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String fullName, int magic, int transgress, int nobility, int honor, int bravery) {
        super(fullName, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public int sumCharacter()
    {
        return nobility + bravery+ honor;
    }


    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;

    }
}
