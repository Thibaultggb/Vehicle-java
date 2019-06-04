public abstract class Vehicle {

    public abstract String doStuff();

    //Atributs
    private String brand;
    private int kilometers;

    //Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    //Getter and Setter
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

}
