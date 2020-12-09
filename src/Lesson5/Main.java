package Lesson5;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main (String[] args) {
       arrayPutHalfSize();
       arrayPutFullSize();

    }

    public static void arrayPutFullSize (){
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i]= (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i/2));
        }
        System.out.println("Time " + "arrayPutFullSize "+(System.currentTimeMillis() - a));
        }
        public static void arrayPutHalfSize(){
            float[] arr = new float[SIZE];
            for (int i = 0; i < SIZE; i++) {
                arr[i] = 1;
            }
        long a = System.currentTimeMillis();
        float[] arrFirstHalf =new float[HALF];
        float[] arrSecondHalf =new float[HALF];
        System.arraycopy(arr, 0, arrFirstHalf, 0, HALF);
        System.arraycopy(arr, HALF, arrSecondHalf, 0, HALF);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                for (int i = 0; i < HALF; i++) {
                    arr[i]= (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i/2));
                }
            }
        });
           t1.start();
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run () {
                    for (int i = HALF; i < SIZE; i++) {
                        arr[i]= (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i/2));
                    }
                }
            });
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.arraycopy(arrFirstHalf,0, arr, 0, HALF);
            System.arraycopy(arrSecondHalf,0, arr, HALF, HALF);
            System.out.println("Time " + "arrayPutHalfSize "+(System.currentTimeMillis() - a));
            }
    }


