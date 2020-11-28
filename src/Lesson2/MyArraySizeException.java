package Lesson2;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException(){
        super("The array with this size cannot be processed by the method");

    }
}
