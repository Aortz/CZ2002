public class HelloWorld {
    public static void main(String[] args) {
        int result = 1+2; // result should be 3
        // this is a comment
        System.out.println("1 + 2 = " + result);
        result++;
        System.out.println(result%3);
        double first = 20.00d;
        double second = 80.00d;
        double third = (first+second)*100.00d;
        double fourth = third % 40.00d;

        boolean isNoRemainder = (fourth == 0)? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(isNoRemainder) {
            System.out.println("No Remainder");
        }
        else{
            System.out.println("Got some remainder");
        }
    }
}
