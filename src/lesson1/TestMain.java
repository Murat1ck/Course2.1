package lesson1;
public class TestMain {
    public static void main(String[] args) {


        Cat murzik = new Cat("Мурзик", 1);
        murzik.meow();

        Cat begemot = new Cat("Бегемот", -5);
        begemot.setName(null);
        begemot.meow();

        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.addFriends(begemot);
        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        murzik.getFriends()[0].meow();
    }
}

