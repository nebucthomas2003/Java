
class Tyre {
    String Brand; //reference variable

    Tyre(String Brand) {     //parameterized  constructor
        this.Brand = Brand;
    }

}

class Car {
    Tyre t;

    public void addTyre(Tyre t) {    //parameterized method
        this.t = t;
    }
}

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car();    //object
        c1.addTyre(new Tyre("Apollo"));   
        System.out.println(c1.t.Brand);

    }

}
