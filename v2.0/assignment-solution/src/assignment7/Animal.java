package assignment7;

import java.util.Objects;

public class Animal {
    private String animalName;
    private String owner;

    public Animal() {}

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(String animalName, String owner) {
        this.animalName = animalName;
        this.owner = owner;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(animalName, animal.animalName) && Objects.equals(owner, animal.owner);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
