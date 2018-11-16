package com.company;
import java.util.Set;

public class Main {
    Set<Predmet> predmeti;
    Set<Student> studenti;
    Set<Upis> upisani;

    void Upisi(Student s, Predmet p, PlanStudija ps) {
        upisani.add(new Upis(s, p, ps));

    }

    public static void main(String [ ] args) {
        System.out.println("Kompajlira se");
    }
}

