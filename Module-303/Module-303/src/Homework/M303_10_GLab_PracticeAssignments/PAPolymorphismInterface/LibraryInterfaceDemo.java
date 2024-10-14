package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInterface;

public class LibraryInterfaceDemo {
    public static void main(String[] args){

        System.out.println("------- Kids -------");

        KidUser kid1 = new KidUser(10);
        KidUser kid2 = new KidUser(18);

        kid1.registerAccount();
        kid2.registerAccount();

        kid1.requestBook("Kids");
        kid2.requestBook("Fiction");

        System.out.println("------- Adults -------");

        AdultUser adult1 = new AdultUser(5);
        AdultUser adult2 = new AdultUser(23);

        adult1.registerAccount();
        adult2.registerAccount();

        adult1.requestBook("Kids");
        adult2.requestBook("Fiction");

    }
}
