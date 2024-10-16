package Classwork_InClassExamples.M303_11;

public class GenericValueObject<T, K extends Number> {

    private T typeT;

    public T getT(){
        return typeT;
    }

    public void setT(T typeT){
        this.typeT = typeT;
    }

    public static void main(String[] args){

        // You can think of the T as any data type.

        // creating your own generic class is something that is very rare for an engineer and primarily is
        // used when

        GenericValueObject<String, Integer> str = new GenericValueObject<>();
        str.setT("String");
        String s1 = str.getT();

        GenericValueObject<Integer, Double> value = new GenericValueObject<>();
        value.setT(10);
        Integer i = value.getT();

    }

}
