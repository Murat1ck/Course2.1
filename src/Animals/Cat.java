package Animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    public static Integer count;
    public static class Breed {
        private String name;
        private String country;
        private String hairType;

        public Breed(String name, String country, String hairType) {
            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }

        public String getName() {
            return name;
        }


        public String getCountry() {
            return country;
        }


        public String getHairType() {
            return hairType;
        }
    }



    private String name;
    private final int birthYear;
    private Cat[] friends;
    private Breed breed;



    public Cat(String name) {
        this(name, LocalDate.now().getYear());
    }

    public Cat(int birthYear) {
        this("Кот", birthYear);
    }

    public Cat(String name, int age) {
        this.name = name;

        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }

        friends = new Cat[0];
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня звут " + name);
        System.out.println("Мне " + getAge() + " лет");
    }

    public Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }

        return friends;
    }

    public void addFriends(Cat friend) {
        this.friends = Arrays.copyOf(getFriends(), this.getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}

