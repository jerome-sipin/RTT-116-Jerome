package Homework.M303_10_GLab_PracticeAssignments.GLabInterfaces;

public interface Movable {
    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();

}
