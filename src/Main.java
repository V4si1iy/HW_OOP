import Faculties.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Gryffindor("Harry Potter", random100(), random100(), random100(), random100(), random100()),
                new Gryffindor("Hermione Granger", random100(), random100(), random100(), random100(), random100()),
                new Gryffindor("Ron Weasley", random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Draco Malfoy", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Graham Montague", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Slytherin("Gregory Goyle", random100(), random100(), random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Zachariah Smith", random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Cedric Diggory", random100(), random100(), random100(), random100(), random100()),
                new Hufflepuff("Justin Finch-Fletchley", random100(), random100(), random100(), random100(), random100()),
                new Ravenclaw("Zhou Chang", random100(), random100(), random100(), random100(), random100(), random100()),
                new Ravenclaw("Padma Patil", random100(), random100(), random100(), random100(), random100(), random100()),
                new Ravenclaw("Marcus Belby", random100(), random100(), random100(), random100(), random100(), random100()),
        };
        compareGryffindor((Gryffindor) students[0], (Gryffindor) students[1]);
        compareHufflepuff((Hufflepuff) students[6], (Hufflepuff) students[7]);
        compareSlytherin((Slytherin) students[3], (Slytherin) students[4]);
        compareRavenclaw((Ravenclaw) students[students.length - 2], (Ravenclaw) students[students.length - 1]);
        compareAll(students[0], students[students.length - 1]);
    }

    private static int random100() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private static void compareGryffindor(Gryffindor student1, Gryffindor student2) {
        System.out.println(student1);
        System.out.println(student2);
        if (student1.sumCharacter() > student2.sumCharacter()) {
            System.out.println(student1.getFullName() + " лучше ученика " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучше ученика " + student1.getFullName());
        }

    }

    private static void compareSlytherin(Slytherin student1, Slytherin student2) {
        System.out.println(student1);
        System.out.println(student2);
        if (student1.sumCharacter() > student2.sumCharacter()) {
            System.out.println(student1.getFullName() + " лучше ученика " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучше ученика " + student1.getFullName());
        }

    }

    private static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2) {
        System.out.println(student1);
        System.out.println(student2);
        if (student1.sumCharacter() > student2.sumCharacter()) {
            System.out.println(student1.getFullName() + " лучше ученика " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучше ученика " + student1.getFullName());
        }

    }

    private static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2) {
        System.out.println(student1);
        System.out.println(student2);

        if (student1.sumCharacter() > student2.sumCharacter()) {
            System.out.println(student1.getFullName() + " лучше ученика " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучше ученика " + student1.getFullName());
        }

    }

    private static void compareAll(Hogwarts student1, Hogwarts student2) {
        System.out.println(student1);
        System.out.println(student2);
        if (student1.sumCharacter() > student2.sumCharacter()) {
            System.out.println(student1.getFullName() + " лучше в магии, чем ученик " + student2.getFullName());
        } else {
            System.out.println(student2.getFullName() + " лучше в магии, чем ученик " + student1.getFullName());
        }
    }

}