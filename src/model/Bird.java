package model;

import java.time.LocalDate;

public class Bird extends Pet {
    public Bird() {
    }

    public Bird(String name, LocalDate dob) {
        super(name, dob);
    }

    public void sing() {
        System.out.println("Tweet!");
    }
}
