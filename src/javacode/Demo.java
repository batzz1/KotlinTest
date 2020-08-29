package javacode;

public class Demo {

    public static void main(String[] args) {

        GameKT gameKT = new GameKT("2K","WWE","2020");
        gameKT.component1();
        gameKT.getManufacturer();
        gameKT.setYear("2021");
        System.out.println(gameKT.component1());
        System.out.println(gameKT.component2());
        System.out.println(gameKT.component3());
        System.out.println(gameKT.getYear());
        System.out.println(gameKT.getClass());

    }
}
