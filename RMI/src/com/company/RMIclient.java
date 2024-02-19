package com.company;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
class RMIClient {
    public static void main(String args[]) {
        try {
            int choice = 0;
            String word, content;
            Scanner sc = new Scanner(System.in);
            dictionary stub = (dictionary) Naming.lookup("rmi://localhost:5000/add");
            while (choice !=6) {
                switch (choice) {
                    case 1:
                        System.out.println("Word Count in Dictionary is: " + stub.count());
                        break;
                    case 2:
                        System.out.println("Enter the word to be entered into Dictionary: ");
                        word = sc.next();
                        System.out.print("\nEnter the content of the word to be entered into Dictionary: ");
                        content = sc.next();

                        if (stub.insert(word, content))
                            System.out.println("Word entered into dictionary successfully");
                        else
                            System.out.println("Word not found!");

                        break;
                    case 3:
                        System.out.println("Enter the word to be deleted: ");
                        word = sc.next();
                        if (stub.delete(word))
                            System.out.println("Word deleted from dictionary successfully");
                        else
                            System.out.println("Word not found!");
                        break;
                    case 4:
                        System.out.println("Enter the word to be looked up: ");
                        word = sc.next();
                        if("".equals(stub.search(word)))
                            System.out.println("Word not found!");
                        else
                            System.out.println("The Content of the word is: " + stub.search(word));
                        break;
                    case 5:
                        System.out.println("The Entire Dictionary is: "+stub.showContent());
                        break;
                    default:
                        System.out.println("Please enter a valid choice!");
                        break;

                }
                System.out.println("1 - Count\n2 - Insert\n3 - Delete\n4 - Lookup\n5 - Print Entire Dictionary\n6 - Exit\nEnter your choice: ");
                choice = sc.nextInt();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}