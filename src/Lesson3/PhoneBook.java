package Lesson3;

import java.util.ArrayList;

public class PhoneBook {
    private String name;
    private String phoneNumber;
    public PhoneBook (String name,String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    static  ArrayList<PhoneBook> phBook = new ArrayList<>();
    public static void add(String nameContact, String number) {
        if (nameContact == null || number == null || nameContact == "" || number == "") {
            System.out.println("Enter the non null data in the fields");
        } else {
            PhoneBook phoneBook = new PhoneBook(nameContact, number);
            if (phoneBook.presenceList(phoneBook)) {
                System.out.println("This contact is already available");
            } else {
                phBook.add(phoneBook);
            }
        }
    }
    public static void infoAll(){
        phBook.forEach((phoneBook) -> System.out.println(phoneBook.name + " " + phoneBook.phoneNumber));
    }
    protected boolean presenceList(PhoneBook newcontact){
        for(int i =0; i< phBook.size();i++)
        if (equalsContact(newcontact, phBook.get(i))){
            return true;
        }
            return false;
    }
    public boolean equalsContact (PhoneBook contact1, PhoneBook contact2) {
        if(contact1.name == contact2.name && contact1.phoneNumber == contact2.phoneNumber) {
            return true;
        }
            return false;
    }
    public static void get(String name){
        for (int i = 0; i < phBook.size(); i++) {
            if(name == phBook.get(i).name) {
                System.out.println(phBook.get(i).name + " " + phBook.get(i).phoneNumber);
            }
        }
    }
}

