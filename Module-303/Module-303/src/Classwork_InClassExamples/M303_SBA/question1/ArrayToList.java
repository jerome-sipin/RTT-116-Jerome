package Classwork_InClassExamples.M303_SBA.question1;

import java.util.ArrayList;

class ArrayToList implements MyList{
    ArrayList<String> z;
    ArrayToList(){
        z = new ArrayList<String>();
    }

    @Override
    public void convert(String[] a){
        // Find length of array a
        int x = a.length;

        // Loop through array a. Append elements in a to List
        for ( int i = 0 ; i < x ; i++ ){
            z.add(a[i]);
            System.out.println(z.get(i));
        }
    }

    @Override
    public void replace(int idx){
        // Find
    }

    @Override
    public ArrayList<String> compact(){
        ArrayList<String> result = null; //change later

        // Loop through the list. Find nulls and remove.

        return result;

    }



}