package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInterface;

public class KidUser implements LibraryUser{
    private int age;
    private String bookType;

    public KidUser() {};

    public KidUser(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if ( age < 12 ){
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
        else{
            System.out.println("You have successfully registered under a Kids Account.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if ( bookType.equals("Kids") ){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }


}
