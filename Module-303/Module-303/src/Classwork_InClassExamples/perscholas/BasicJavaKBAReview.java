package Classwork_InClassExamples.perscholas;

public class BasicJavaKBAReview {
    public static void main(String args[]) {
        // Understand how this loop works. There is a lot of trickery in here.
        // Go through it in debugger.
        int x = 2;
        int y = 0;
        for (; y < 10; ++y) { // ++y will increment BEFORE the loop starts.
            if (y % x == 0)
                continue;
            else if (y == 8)
                break;
            else

                System.out.print(y + " ");
        }
    }
}
