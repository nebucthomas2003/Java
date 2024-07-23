class Triangle {   //parent class
    int length;
    int breadth;

    Triangle(int length, int breadth) {  //constructor
        this.length = length;
        this.breadth = breadth;

    }

}

public class RightangleTriangle extends Triangle {   //child class
    int area;

    RightangleTriangle(int length, int breadth) {  //constructor
        super(length, breadth);   //super call statement
        this.length = length;
        this.breadth = breadth;
        this.area = area;
    }

    public static void main(String[] args) { //main method
        RightangleTriangle r = new RightangleTriangle(10, 25);
        System.out.println("Area is:" + r.length * r.breadth);
    }

}
