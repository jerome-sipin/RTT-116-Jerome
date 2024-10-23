package Classwork_InClassExamples.M303_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {

    public static void main(String[] args){

        String[] strArray = {"one", "two", "three", "four", "five"};

        List<String> list = Arrays.asList(strArray);

        // in one line of code, we are going to loop over the entire list and print all elements to upper case
        // this is called a lambda expression
        // you use this when you want to do something super fast/quick/easily
        list.stream().forEach(e ->System.out.println(e.toUpperCase()));

        // alternatively...
        // you will usually see this in one line, though.
//        list.stream().forEach( e -> {
//                System.out.println(e.toUpperCase());
//            }
//        );

        // this is a very fast way of removing an item from a list in one line of code.
        //list.removeIf(e-> e.startsWith("o"));

        System.out.println("====================================");

        // the primary use for this filter is when you're trying to find something in a list of entities
        List<String> filteredList = list.stream().filter(e -> !e.startsWith("o")).collect(Collectors.toList());

        // note that we can chain this together to do 2 filters
        List<String> filteredList1 = list.stream()
                .filter(e -> e.startsWith("t"))
                .filter(e -> !e.startsWith("o"))
                .collect(Collectors.toList());

        // loop over the filtered list and print elements
        filteredList.stream().forEach(a -> System.out.println(a));

        System.out.println("=============================");

        // loop over the filtered list and print elements
        filteredList1.stream().forEach(a -> System.out.println(a));

    }


}
