public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("clio");
        System.out.println(clio.doStuff());
        Boat titanic = new Boat ("titanic");
        System.out.println(titanic.doStuff());
    }

}
