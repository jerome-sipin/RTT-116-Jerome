package Classwork_InClassExamples.perscholas;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringExamples {
    public static void main(String[] args) {

        // reminder about 0 based indexing!
        //          012345
        String s = "abcdef";
        // the total length of the string is 6 characters, but most programming languages
        // starts at 0, so there are 5 characters (including the 0)

        // this will print the length of the string
        System.out.println("the length of the string is " + s.length());

        // this will print the string in upper case
        System.out.println("Uppercase = " + s.toUpperCase());

        // this is manually concatenating two Strings
        String concat = s.concat("ghijk");
        System.out.println(concat);

        System.out.println(s.charAt(0)); // prints a
        System.out.println(s.charAt(5)); // prints f
        // System.out.println(s.charAt(6)); // produces an error


        String r = "abc123abc";
        // replace a with z
        // note the single quote, because we are replacing a single character
        System.out.println(r.replace('a', 'z'));

        // replace abc with xyz
        // note the double quote mark because we are replacing a sub-string
        System.out.println(r.replace("abc", "xyz"));

        // replaceAll uses a regular expression
        // \\d means all digits
        System.out.println(r.replaceAll("\\d", "9"));

        // ==== SUBSTRINGS ====
        // One usecase - make sure that file format is correct (check last 3 characters)
        // Example - make sure a file uploaded is a pdf, and not some other type like jpg or png
        //                 0123456789012
        String filename = "someimage.jpg";

        System.out.println(filename.substring(0, 4));
        System.out.println(filename.substring(filename.length() - 4, filename.length()));

        // when we use a single argument with susbtring, it is simply the starting position
        // and it will take the rest of the string
        System.out.println(filename.substring(filename.length() - 4));
        // the above is functionally the same as line 47!! Notice how Intellij underlines
        // the filename.length() and says that it is redundant!

        // we want to print out the index of the . in the string
        // indexOf finds the first occurrence of whatever we are looking for
        System.out.println("The . is in position " + filename.indexOf("."));

        // so to get the file extension we can use a combination of substring and indexOf
        System.out.println(filename.substring(filename.indexOf(".")));

        // the more programmatically correct way of solving this is to use lastIndexOf
        // this is because a file name may have multiple '.' characters. I.e., "some.filename.png"
        // this can also be thought of as searching from left to right instead of from right to left
        System.out.println(filename.substring(filename.lastIndexOf(".")));

        // challenge - how do I get just the filename without the extension?
        String s20 = filename.substring(0, filename.lastIndexOf("."));
        System.out.println(s20);

        // String comparisons
        String s1 = new String("abc");
        String s2 = new String("abc");

        // VERY VERY IMPORTANT!
        // DO NOT use == to compare strings
        System.out.println(s1 == s2); // this will print false because both objects are strings

        // ALWAYS compare 2 strings using the function .equals
        // doing it any other way IS ALWAYS WRONG !!
        System.out.println(s1.equals(s2)); // this will show true because the contents of the
        // strings are the same

        // == compares memory location

        String s3 = new String("xyz");
        System.out.println(s1.equals(s3)); // will show false

        // the function .equalsIgnoreCase will make the comparison non-case-sensitive
        String s40 = new String("ABC");
        System.out.println(s1.equalsIgnoreCase(s40)); // true

        // convert from string to number
        String n = "101";
        // this will take the string 101 and convert it to the number one hundred and one
        Integer n1 = Integer.parseInt(n);

        // this method can throw an exception if the string contains non-numbers
        // Example... Integer n3 = Integer.parseInt("abc123");

        // converting from a number to a string is easy
        String n2 = n1.toString();

        // !!!! - IMPORTANT Strings in Java are immutable - meaning that they cannot be changed after
        // they are created
        String s4 = "abc";
        String s5 = "123";

        // when s4.toUpperCase is called it created another brand new string in memory that is ABC
        // it did not modify s4... it created a new string
        // then it concatenates on the string s5, which creates another new string in memory that is
        // assigned to the variable s6.
        String s6 = s4.toUpperCase();


        // ========== StringBuffer ==========

        // The StringBuffer is mutable, meaning that the internal content of the StringBuffer can be
        // changed and it is good to use when doing lots of string manipulation in a  high-volume system
        // Extra reading that shouuld probably be done - compare the StringBuffer to the StringBuilder
        // They are very similar.
        // Potential interview question - why would you use a StringBuffer or a StringBuilder over a regular String?
        // Answer - for memory management! Strings are immutable and the JVM creates new Strings in memory and then has
        // to garbage collect them; whereas Builder and Buffer are mutable and can be changed in memory, thus are more
        // efficient!
        StringBuffer sb = new StringBuffer();

        // append will add something to the end of the string and it has the same effect as concatenating for
        // strings
        sb.append("abc");
        sb.append("123");
        // the above lines are the equivalent of doing "abc" + "123" or using the .concat method on a string

        // !!! Important !!! - know this for the KBA
        // 01234567890
        // abc1xyz23
        sb.insert(4, "xyz"); // inserts starting at index 4
        // string is now abc1xyz23

        // replace function for String Buffer
        // start at position 0 and go to position 3 (BUT DOES NOT INCLUDE POSITION 3!!!)
        // thus, replace "abc" with "ABC"
        sb.replace(0, 3, "ABC"); // string is now ABC1xyz23

        // You could also replace more than 3 characters
        // So you can think of sb.replace as straight up deleting whatever is at
        // the positions you have specified; in this case, it is deleting what
        // is at positions 0 to 2 and then replacing it with what we have specified, "ABCDEF"
        // !!! This will probably be on the KBA.
        sb.replace(0, 3, "ABCDEF"); // string is now ABCDEF1xyz23

        // We can delete from a string buffer
        sb.delete(0, 3); // string is now DEF1xyz23

        // the following exists, but there isn't really any real-world use cases...
        // this takes the entire string and reverses it
        sb.reverse(); // string is now 32zyx1FED

        System.out.println(sb.toString());

        // !!! KBA Question...
        // Study how this works... it will be on the KBA!!!
        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0, 7, "DEFG").insert(0, "12345");
        // this will just erase the current 3 characters, and replace it with "DEFG", then insert "12345"
        // at position 0
        // string is now 12345DEFG

        kba.reverse(); // string is now GFED54321

        kba.delete(0, 5); // string is now 4321

        // 01234567890123456789
        // ABC
        // 12345DEFG
        // FFED54321
        // 4321

        System.out.println(kba.toString());

        // ====== String Joiner ======

        // The string joiner works kind of like an array.
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // !!! KBA Question to Study!!!
        // The following is about 90% the same thing as the KBA question!
        // This is a memorization check (when are multiple choice questions ever not LOL)
        // A string joiner formats the list of string and separates each one with a delimiter but does not
        // put a delimiter at the end.
        // Has three parameters - delimiter, first character (prefix), last character (suffix)
        StringJoiner sj1 = new StringJoiner("|", "{", "}");
        StringJoiner sj2 = new StringJoiner(":", "[", "]");

        sj1.add("Chris");
        sj1.add("Michael");

        System.out.println(sj1);

        // StringJoiner "arrays" can be merged.

        sj2.add("Sheryl");
        sj2.add("Alice");

        System.out.println(sj2);

        System.out.println(sj1.merge(sj2).toString());
        // Notice how the different delimiters come together (| used to separate first and second sjs)
        // and the prefix/suffix comes from the first sj.


        // ============ formatting =============

        // ???
        // this should not be on the KBA
        // this is legacy stuff left over from C++
        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format("This is an integer: %d and this is a byte: %d and one more variable %d.\n", i, b, 10);
        System.out.format("This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format("And this is a String: %s", "This is a string.\r\n");

        // ================ demical formatting ==================

        // DecimalFormatter exists and makes it easy to format a number nicely
        // it takes in a pattern and will apply that pattern to a number
        // when you need to use it, you can google it and there will be plenty of articles on how to
        // use it, and will take 5 minutes to figure out what you need and when you need to use it
        // as long as you remember that it exists
        // usually used for money
        String pattern = "$##,###,###.##";
        double number = 123456789.123;

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(numberFormat.format(number));


        // =========== math class ===============
        // if cirno touhou made java would it be cirno's perfect math class?


        // ===== trim =====

        String t = "     abc123      ";
        // Eric says that the "arrows" (the -> <-) are helpful in pointing out white space
        System.out.println("->" + t + "<-");
        System.out.println("->" +t.trim() + "<-"); // the white spaces are gone!



        // ====== split ======
        // todo - how to highlight certain comments in intellij??? "todo" seems to have this property
        String vowels = "a:e:i:o:u";

        // splitting the string on the colon (:) and appends to array
        String[] result = vowels.split(":");

        for(i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

        System.out.println("result = " + Arrays.toString(result));
    }
}
