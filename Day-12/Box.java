
public class Box {

    int length;
    int breadth;
    int area;

    Box(int length) {//constructor 1
        this.length = length;
    }

    Box(int length, int breadth) {//constructor2
        this(length);

        this.breadth = breadth;
    }

    Box(int length, int breadth, int area) {//constructor3
        this(length, breadth);
        this.area = area;
        System.out.println("Length is" + length + "Breadth is:" + breadth + "Area is:" + area);
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);//object

    }

}
