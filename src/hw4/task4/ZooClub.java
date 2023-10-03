package hw4.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addMember(Person person) {
        if (!club.containsKey(person)) {
            club.put(person, new ArrayList<>());
        }
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void addPetTo(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.add(pet);
        }
    }

    public void removePetFromMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            pets.remove(pet);
        }
    }

    public void removePetFromAllMembers(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }
}
