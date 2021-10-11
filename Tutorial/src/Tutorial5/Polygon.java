//Question 1
//1a. ClassF
//1b. ClassA
//1c ClassE
//1d ClassC
//1e. Compilation Error!

//Question 2
//2a) If method print(String, String) is declared as abstract, then downcasting will occur
//2bi. Upcasting is done. c.print will implemented using ClassD method
//2bii. ClassC is an abstract class and abstract class cannot instantiate object
//2biii. Upcast is ok. However, there will be a compile error since ClassA has no print(string, string) method

//2ci.
// ClassC is an ancestor of ClassD. Hence upcasting is ok(ClassC c = new ClassD()).
// However, Class E is a descendant of ClassC, hence there is down-casting occurring. There will be a compilation error that is produced and a way to avoid this would be to do explicit down-casting
// Explicit down-casting will result in runtime error.

//2cii.
//ClassB is not even in the same family as ClassE. Compilation will occur

//2ciii.
//ClassA is an ancestor of ClassF, hence upcasting is being carried out (ClassA = new ClassF())
//a.print(12, "there) will be printed using ClassA method
//a.print(88); compilation error has ClassA doesn't have a print(int) method

//2civ.
//ClassA is an ancestor of ClassC so upcasting will occur (ClassA a = new ClassC())
//ClassG g= (ClassG)a; Explicit down-casting is being done here, so there will be no compilation error, but there will be runtime error as Object is ClassC and cannot be cast to downcasting G
//g.print("hello"); this will printed using ClassG's print(string) method

//2cv
//ClassA is an ancestor of ClassC so upcasting will occur (ClassA a = new ClassC())
//ClassG g= (ClassG)a; Explicit down-casting is being done here, so there will be no compilation error, but there will be runtime error as Object is ClassC and cannot be down-casted to ClassG
//g.print("hello","there"); this will be printed using ClassC's print(string) method, however ClassC to ClassF is downcasting

//2cvi
//ClassA is an ancestor of ClassF so upcasting will occur (ClassA a = new ClassF())
//ClassC f = (ClassC)a; Explicit down-casting is being done here, so there will be no compilation error, but there will be runtime error
//f.print(88, "there"); Compilation is ok as the print(int, String) method is inherited from ClassA. Runtime is ok since A is a ClassF object and ClassF to ClassC is upcasting

package Tutorial5;

public class Polygon {
    public enum KindofPolygon { POLY_PLAIN, POLY_RECT, POLY_TRIANG};
    protected String name;
    protected float width;
    protected float height;
    protected KindofPolygon polytype;
    public Polygon(String theName, float theWidth, float theHeight) {
        name = theName;
        width = theWidth;
        height = theHeight;
        polytype = KindofPolygon.POLY_PLAIN;
    }
    public KindofPolygon getPolytype() {
        return polytype;
    }
    public void setPolytype(KindofPolygon value) {
        polytype = value;
    }
    public String getName() { return name; }
    public float calArea() { return 0; }
    public void printWidthHeight( ) {
        System.out.println("Width = " + width + " Height = " + height);
    }
}


