package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        PhoneBook.add("Smith", "+790527545354");
        PhoneBook.add("White", "+1545456444554");
        PhoneBook.add("White", "");
        PhoneBook.add("White", null);
        PhoneBook.add("", "+1545456424554");
        PhoneBook.add(null, "+1545456424554");
        PhoneBook.add("Smith", "+790525423445354");
        PhoneBook.add("Smith", "+790527545354");
        PhoneBook.add("Smith", "+34324234234");
        PhoneBook.get("Smith");
        }
    }

