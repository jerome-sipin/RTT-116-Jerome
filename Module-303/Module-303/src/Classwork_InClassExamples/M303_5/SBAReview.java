package Classwork_InClassExamples.M303_5;

public class SBAReview {
    public static void main(String[] args){
        // Basic Java SBA review

        // looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";

        // note that the string.length() method does use the ()
        for (int pos = 0 ; pos < characters.length() ; pos++){
            // in the string we are using the method charAt to get the character at a position
            char value = characters.charAt(pos);
            System.out.println("character at position " + pos + " = " + value);
        }

        // conversion of a string or character into an integer
        // character with the value 1
        char one = '1';
        Character c = Character.valueOf(one);
        int x = Integer.parseInt(c.toString());

        // Simplified way that IntelliJ wants it to be
        char d = '2';
        int y = Integer.parseInt(Character.toString(d));

        // They have the same output
        System.out.println(x);
        System.out.println(y);

        char abc = '2';
        Character cba = Character.valueOf(abc);
        Integer qwe = Integer.parseInt(cba.toString());

        char three = '3';
        Integer tri = Integer.parseInt(Character.toString(three));

        char twice = '2';
        Integer twice1 = Integer.parseInt(Character.toString(twice));

        char lkj = '5';
        Integer poi = Integer.parseInt(Character.toString(lkj));
        System.out.println(poi);

    }
}
