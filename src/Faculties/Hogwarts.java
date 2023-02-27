package Faculties;

public class Hogwarts {
    private final String fullName;
    private int magic;
    private int transgress;

    public Hogwarts(String fullName, int magic, int transgress) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }
    public int sumCharacter()
    {
        return magic + transgress;
    }

    @Override
    public String toString() {
        return  "fullName='" + fullName + '\'' +
                ", magic=" + magic +
                ", transgress=" + transgress + ", ";
    }
}
