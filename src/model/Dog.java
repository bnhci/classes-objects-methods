package model;

import java.time.LocalDate;

public class Dog extends Pet {
    private String breed; // добавляем поле только для Dog (упражнение 4)

    public Dog() {}

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public Dog(String name, LocalDate dob, String breed) {
        super(name, dob);
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public void bark() {
        System.out.println("Ruff, ruff!");
    }

    @Override
    public String toString() {
        return "Dog{breed='" + breed + "', " + super.toString() + "}";
    }
}