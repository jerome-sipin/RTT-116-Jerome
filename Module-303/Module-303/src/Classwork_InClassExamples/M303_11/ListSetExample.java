package Classwork_InClassExamples.M303_11;


import java.util.*;


public class ListSetExample {

    public static void main(String[] args){

        // the list maintains the order they were added, and also kept the duplicates, compared to the set.
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(3);
        intList.add(1);


        for ( Integer i : intList){
            System.out.println(i);
        }


        // -------- iterator

        // first we need to get the iterator from the list
        Iterator<Integer> iterator = intList.iterator();

        // loop over the list using an iterator, we check to make sure the iterator (list) has a next element
        while ( iterator.hasNext()){
            // the .next function is actually 2 operators, first is to return the element at the pointer
            // and second to move the pointer over 1 element
            Integer i = iterator.next();

            // primary use for an iterator is when you want to remove something from the list while you are
            // iterating the list
            if ( i == 3){
                iterator.remove();
            }
        }

        // the iterator is good for looping through the list while also removing what you want.
        // if you try to remove the element from the list inside a regular for loop,
        // IT IS ALWAYS WRONG and will cause an exception.


        System.out.println("-------------------------------");

        // important to understand what a set is - basically, it can be used to deduplicate data
        // it may appear to be maintaining some kind of order when it is printed, but [Eric] can assure you
        // that it is not.
        Set<Integer> intSet = new HashSet<>(){};
        intSet.add(2);
        intSet.add(3);
        intSet.add(3);
        intSet.add(1);

        // not only did it not maintain the order in which I added the elements,
        // it removed the duplicate 3
        for ( Integer i : intSet ){
            System.out.println(i);
        }



    }

}
