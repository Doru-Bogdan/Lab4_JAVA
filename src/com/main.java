package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

    public static void citireFisierCuvinte() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/dorumancila/Desktop/Lab4_JAVA/src/com/fisier_in.txt"));
        Scanner scan1 = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();
        String []cuv = line.split(" ");
        String cuvant = scan1.next();
        boolean gasit = false;
        for (String s : cuv) {
            if (s.equals(cuvant)) {
                //System.out.println("Cuvantul se afla in string");
                gasit = true;
                break;
            }
        }
        if (gasit)
            System.out.println("Cuvantul se afla in string! ");
        else System.out.println("Cuvantul nu se afla in string ");
    }


public static void citirePanaLaNumar() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        StringBuffer string = new StringBuffer();

        String word;
//        while(true) {
//            String word;
//            word = scan.next();
//            if (word.equals("10"))
//                break;
//            else {
//                string.append(word);
//                string.append(" ");
//            }
//        }

        do {
            word = scan.next();
            if (word.equals("10"))
                break;
            string.append(word);
            string.append(" ");
        } while (!word.equals("10"));
        scan.close();

        PrintWriter print = new PrintWriter(new File("/Users/dorumancila/Desktop/Lab4_JAVA/src/com/out.txt"));
        print.print(string);
        print.close();
}


    public static void main(String[] args) throws FileNotFoundException {
        //citireFisierCuvinte();
        citirePanaLaNumar();
    }

}
