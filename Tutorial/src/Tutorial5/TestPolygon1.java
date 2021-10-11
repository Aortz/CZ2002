package Tutorial5;

public class TestPolygon1 {
    public static void printArea(Polygon p) {
        System.out.println("The area of the Rectangle is " + p.calArea());
    }
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle("Rect1", 3.0f, 4.0f);
        printArea(rect1); //dynamic binding
        rect1.printWidthHeight();

        Triangle triangle1 = new Triangle("Triangle1", 3.0f, 4.0f);
        printArea(triangle1); //dynamic binding
        rect1.printWidthHeight();
    }
}
