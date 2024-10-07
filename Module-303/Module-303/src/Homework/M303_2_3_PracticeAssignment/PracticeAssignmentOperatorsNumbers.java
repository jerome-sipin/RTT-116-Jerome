package Homework.M303_2_3_PracticeAssignment;

public class PracticeAssignmentOperatorsNumbers {
    public static void main(String[] args) {

        // =============== Task 1 ===============
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(Integer.toBinaryString(x)); // 100

        // Task 1 part A
        int a = 9;
        System.out.println(Integer.toBinaryString(a));
        a = a << 1;
        System.out.println(Integer.toBinaryString(a)); // 10010

        // Task 1 part B
        int b = 17;
        System.out.println(Integer.toBinaryString(b));
        b = b << 1;
        System.out.println(Integer.toBinaryString(b)); // 100010

        // Task 1 part C
        int c = 88;
        System.out.println(Integer.toBinaryString(c));
        c = c << 1;
        System.out.println(Integer.toBinaryString(c)); // 10110000

        System.out.println("End of Task 1");

        // =============== Task 2 ===============
        int d = 150;
        System.out.println(Integer.toBinaryString(d));
        d = d >> 2;
        System.out.println(Integer.toBinaryString(d)); // 100101

        // Task 2 part A
        int e = 225;
        System.out.println(Integer.toBinaryString(e));
        e = e >> 2;
        System.out.println(Integer.toBinaryString(e)); // 111000

        // Task 2 part B
        int f = 1555;
        System.out.println(Integer.toBinaryString(f));
        f = f >> 2;
        System.out.println(Integer.toBinaryString(f)); // 110000100

        // Task 2 part C
        int g = 32456;
        System.out.println(Integer.toBinaryString(g));
        g = g >> 2;
        System.out.println(Integer.toBinaryString(g)); // 1111110110010

        System.out.println("End of Task 2");

        // =============== Task 3 ===============
        int h, i, j;
        h = 7;
        i = 17;
        j = (h & i);
        //     111
        // & 10001
        //   00001
        // Prediction: j == 1 (both binary and decimal)
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));

        System.out.println("End of Task 3");

        // =============== Task 4 ===============
        //     111
        // | 10001
        //   10111
        // Prediction: decimal 23 | binary 10111
        j = (h | i);
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));

        System.out.println("End of Task 4");

        // =============== Task 5 ===============
        int k = 20;
        System.out.println("Value of k before increment: " + k);
        k++;
        System.out.println("Value of k after increment: " + k);

        System.out.println("End of Task 5");
        // =============== Task 6 ===============
        int l = 15;
        System.out.println("Original value of l: " + l);
        ++l; // first method of incrementing
        System.out.println("Value of l: " + l);
        l++;
        System.out.println("Value of l: " + l);
        l = l + 1;
        System.out.println("Value of l: " + l);

        System.out.println("End of Task 6");

        // =============== Task 7 ===============
        int m, n;
        m = 5;
        n = 8;
        int o = (++m) + n;
        System.out.println("Value of o: " + o);
        int p = (m++) + n;
        System.out.println("Value of p: " + p);
        System.out.println("End of Task 7");

    }
}
