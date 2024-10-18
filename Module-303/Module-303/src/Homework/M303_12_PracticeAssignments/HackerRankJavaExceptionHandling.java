package Homework.M303_12_PracticeAssignments;


import java.util.Scanner;

class MyCalculator {
    private long a, b;
    private long c = 0;
    private long result = 0;

    public long power(int x, int y) throws Exception{
        if ( ( x == 0 ) && ( y == 0 ) ){
            throw new Exception("n and p should not be zero.");
        }
        if ( ( x < 0 ) || ( y < 0 )){
            throw new Exception("n or p should not be negative.");
        }
        a = (long)x;
        b = (long)y;
        c = x;
        if ( y == 0){
            result = 1;
        }
        else {
            for (int i = 1 ; i < y ; i++){
                c = c * a;
            }
            result = (long)c;
        }
        return result;
    }


}

public class HackerRankJavaExceptionHandling {

    public static void main(String[] args) {

        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(myCalculator.power(x, y));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


