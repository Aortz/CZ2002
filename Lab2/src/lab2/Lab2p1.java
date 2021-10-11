package lab2;
import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Perform the following methods:");
            System.out.println("1. multiplication test");
            System.out.println("2. quotient using division by subtract");
            System.out.println("3. remainder using division by subtract");
            System.out.println("4. count the number of digits");
            System.out.println("5. position of a digit");
            System.out.println("6. extract all digits");
            System.out.println("7. quit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("Enter m: ");
                    int number1 = sc.nextInt();
                    System.out.println("Enter n: ");
                    int number2 = sc.nextInt();
                    int quotient = divide(number1, number2);
                    System.out.println(number1 + "/" + number2 + " = "+ quotient + "\n");
                    break;
                case 3:
                    System.out.println("Enter m: ");
                    number1 = sc.nextInt();
                    System.out.println("Enter n: ");
                    number2 = sc.nextInt();
                    int modulo = modulus(number1, number2);
                    System.out.println(number1 + "%" + number2 + " = " + modulo + "\n");
                    break;
                case 4:
                    System.out.println("Enter n: ");
                    number1 = sc.nextInt();
                    int digit = countDigits(number1);
                    if(digit != -1){
                        System.out.println("n: "+ number1 + " count = " + digit);
                    }
                    else{
                        System.out.println("n: "+ number1 + " - Error Input");
                    }
                    break;
                case 5:
                    System.out.println("Enter n: ");
                    int n = sc.nextInt();
                    System.out.println("Enter digit: ");
                    int digits = sc.nextInt();
                    int pos = position(n,digits);
                    System.out.println("n: "+ n + " digit = " + digits);
                    System.out.println("position = " + pos);
                    break;
                case 6:
                    System.out.println("Enter n: ");
                    long number = sc.nextLong();
                    long newNumber = extractOddDigits(number);
                    if(newNumber == -2){
                        System.out.println("oddDigits = Error input!!");
                    }
                    else{
                        System.out.println("oddDigits = " + newNumber);
                    }
                    break;
                case 7:
                    System.out.println("Program terminating...");
            }
        } while (choice < 7);
    }

    public static void mulTest(){
        int min = 1;
        int max = 9;
        int count = 0;
        Scanner sc1 = new Scanner(System.in);
        int right  = 0;
        while(count < 5){
            int first_random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            int second_random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println("How much is " + first_random_int + " times " + second_random_int);
            int answer = sc1.nextInt();
            if(answer == first_random_int*second_random_int){
                right++;
            }
            count++;
        }
        System.out.println(right + " answers out of 5 are correct\n");
    }

    public static int divide(int m, int n){
        int count = 0;
        while(m-n >= 0){
            m = m - n;
            count++;
        }
        return count;
    }
    public static int modulus(int m, int n){
        int count = 0, modulo = 0;
        count = divide(m, n);
        modulo = m - n*count;
        return modulo;
    }
    public static int countDigits(int n){
        int count = 0;
        if(n <= 0){
            count = -1;
            return count;
        }
        while(n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int position(int n, int digit){
        int count = 0;
        int remainder = 0;
        if(n <= 0){
            count = -1;
            return count;
        }
        while(n > 0) {
            remainder = n % 10;
            if(remainder == digit){
                count++;
                return count;
            }
            n = n / 10;
            count++;
        }
        return -1;

    }

    public static long extractOddDigits(long n){
        long oddCount = 0, counter = 0;
        long remainder = 0;
        long newOdd = 0;
        if(n <= 0){
            oddCount = -2;
            return oddCount;
        }
        while(n > 0){
            remainder =  n%10;
            if(remainder%2 !=0){
                for(counter = oddCount; counter > 0; counter--){
                    remainder *= 10;
                }
                newOdd += remainder;
                oddCount++;
            }
            n /= 10;
        }
        if(oddCount == 0){
            return -1;
        }
        return newOdd;
    }
}
