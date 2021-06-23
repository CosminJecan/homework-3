package org.example;
import java.util.Scanner;

public class TemaSesiunea03 {
    public static void main(String[] args) {
        String a;
        System.out.println("\t" + "Introduceti numele dumneavoastra:");

        a = new Scanner(System.in).nextLine();

        if (a.length() >= 1) {
            System.out.println("Hello, " + a + "!");
            } else {
                System.out.println("Hello, stranger!");
            }
        }
    }