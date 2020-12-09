package Lesson3;

import java.util.*;

public class Lesson3 {
    public static void main (String[] args) {
        String[] array = {"map", "temp", "make", "folk", "dot", "dot", "food", "take", "put", "get", "pop", "send", "reset", "dot", "folk", "folk", "get","map"};
        ArrayList < String > arrayList = new ArrayList<>(Arrays.asList(array));
        Set wordUnique = new HashSet(Arrays.asList(array));
        Iterator<String> iter = wordUnique.iterator();

        while (iter.hasNext()){
            String s = iter.next();
            int countWord = 0;
            for( int j = 0; j< arrayList.size();j++){
                if(s.equals(arrayList.get(j))){
                    countWord += 1;
                }
            }
            System.out.println(s + " " + countWord);

        }

        Set wordUn = new HashSet();

        for (int i=0; i< arrayList.size(); i++) {
            int countWord = 0;
            String wordFind = arrayList.get(i);
            for( int j = 0; j< arrayList.size();j++){
                if(wordFind.equals(arrayList.get(j))){
                    countWord += 1;
                }
            }
            wordUn.add(wordFind+" "+countWord);
        }
        System.out.println(wordUn);
    }
}
