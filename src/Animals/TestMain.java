package Animals;

import Animals.Cat;

public class TestMain {
    public static void main(String[] args) {
        Cat.Breed brShBreed = new Cat.Breed("British", "GB", "Short");


        Cat murzik = new Cat("Мурзик", 1);
        murzik.meow();
        murzik.setBreed(brShBreed);
        Cat.count = 1;

        Cat begemot = new Cat("Бегемот", -5);
        begemot.setName(null);
        begemot.meow();

        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.getFriends()[0].meow();
    }
}

