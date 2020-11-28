package Lesson2;

public class Main {
    public static void main (String[] args) throws MyArraySizeException, MyArrayDataException
    {
        String[][] array =  { {"1", "4", "5", "d"}, {"1", "4", "5", "6"}, { "s", "1", "2", "3"}, {"3", "10", "11", "12"}};
boolean finishStatus = false;

while (finishStatus == false){
    try {
        reviewArray(array);
        finishStatus = true;
    } catch (MyArraySizeException e) {
        System.out.println(e.getLocalizedMessage() + ". 2-dimensional arrays of size 4x4 are supported");
        finishStatus = true;
    } catch (MyArrayDataException e1) {
        System.out.println(e1.getLocalizedMessage() + ". The cell value was changed to 0");
        array[e1.i][e1.j] = "0";
        finishStatus = false;
     }
}
    }

    public static void reviewArray (String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int summElementsArray = 0;

        if (isNotNull(arr) == false || isNeedSize(arr)==false){
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (isNumeric(arr[i][j]) == false) {
                    throw new MyArrayDataException(arr[i][j], i, j);
                } else {
                    summElementsArray += Integer.parseInt(arr[i][j]);
                }
            }

        }
        System.out.println(summElementsArray);
    }

    public static boolean isNumeric (String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static boolean isNeedSize  (String [][] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].length != 4)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNotNull(String[][] arr) {
        try {
            if (arr == null) {return false;}
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {return false;}
            }
            return true;
        } catch (NullPointerException npe) {
            throw new MyArraySizeException();
        }
    }
}

