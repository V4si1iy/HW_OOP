package Faculties;

import Faculties.Hogwarts;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int magic, int transgress, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magic, transgress);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    @Override
    public int sumCharacter()
    {
        return trick + determination + ambition+ resourcefulness + lustForPower;
    }


    @Override
    public String toString() {
        return super.toString() +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }
}
