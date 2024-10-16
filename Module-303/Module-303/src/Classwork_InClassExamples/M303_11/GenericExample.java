package Classwork_InClassExamples.M303_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericExample {

    public static void main(String[] args) {

        // basically the type between <> is the only type allowed into the list
        // in older versions of Java it was required on both sides of the =,
        // but new version only require the left side
        List<String> strings = new ArrayList<String>();
        strings.add("String1");
        // strings.add(1)

        // this one will only allow integers to be in the list
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        // ints.add("String2");

        // The big takeaway from this is that this restricts the list to only one data type. Think about
        // how lists in Python can be multi-data type.

        // this one is a map
        // Map<K, v>
        Map<String, Integer> m = new HashMap<>();


    }

}
