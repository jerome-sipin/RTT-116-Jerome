package M303_5;

import java.util.ArrayList;
import java.util.List;

public class ForLoopsExamples {
    public static void main(String[] args) {

        // this is the original 190s for loop and it works great for when you want to count
        // or do something a set number of times.
        // this is also good for ositioning within an array or string
        for ( int count = 1 ; count < 10 ; count++){
            System.out.println("For loop iteration " + count);
        }

        // count down
        for ( int count = 10 ; count >= 1 ; count--){
            System.out.println("For loop iteration " + count);
        }

        // the array is 0 based... so that means the positions in the array are from 0 to 4
        String [] strings = { "one", "two", "three", "four", "five" };

        // old style for loop
        for (int pos = 0 ; pos < strings.length ; pos++){
            System.out.println("string at position" + pos + " = " + strings[pos]);
        }

        // looping over the characters in a string
        //                   0123456
        String characters = "abcdefg";

        // note that the string.length() method does use the ()
        for (int pos = 0 ; pos < characters.length() ; pos++){
            // in the string we are using the method charAt to get the character at a position
            char value = characters.charAt(pos);
            System.out.println("character at position" + pos + " = " + value);
        }

        // looping over a list
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");

        // note that the list uses .size() to get the number of elements in the list
        for (int pos = 0 ; pos < stringList.size() ; pos++){
            String value = stringList.get(pos);
            System.out.println("string at position" + pos + " = " + value);
        }


        // new style for loop
        // how Eric reads this in his mind - "for string in stringlist"
        // this for loop is easier to type and read, but does not contain the position in the list that each item came
        // from, which is okay in most cases.
        for (String string : stringList){
            System.out.println("new for loop " + string);
        }

        // new style for loop for array (using strings array created above)
        for (String value : strings){
            System.out.println("new style for loop for an array " + value);
        }

    }
}
