package Classwork_InClassExamples.M303_10;

public class PrivateClassExample {

    public void thisCanHaveAnyName(){
        InnerPrivateClass ipc = new InnerPrivateClass();
    }

    public static void main(String[] args){

        // we want to get outside this static method so that we can code like normal
        // otherwise, everything would have to be static, which we really don't want
        // we are just making a new instance of the class, and it just so happens that
        // it is the same class
        PrivateClassExample pce = new PrivateClassExample();
        // execute a non-static method on the class we just created
        pce.thisCanHaveAnyName();
    }

    // this is just to show that the java language will allow an internal private
    private class InnerPrivateClass {

        private String a;
        private String b;

        // getters and setters
    }
}
