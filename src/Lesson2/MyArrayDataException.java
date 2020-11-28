package Lesson2;

public class MyArrayDataException extends RuntimeException {
    int i;
    String s;
    int j;
public MyArrayDataException (String s, int i, int j){

    super("The data " + s + " in the array cell [" + i + " " + j + "] is incorrect");
    this.s = s;
    this.i =i;
    this.j =j;

}
}


