package Tutorial5;

public class TestPolygon {
    public static void printArea(Rectangle r) {
        System.out.println("The area of the Rectangle is " + r.calArea());
    }
    public static void printArea(Triangle t) {
        System.out.println("The area of the Triangle is " + t.calArea());
    }
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle("Rect1", 3.0f, 4.0f);
        printArea(rect1); //static binding
        rect1.printWidthHeight();

        Triangle triangle1 = new Triangle("Triangle1", 3.0f, 4.0f);
        printArea(triangle1); //static binding
        rect1.printWidthHeight();
    }
}
