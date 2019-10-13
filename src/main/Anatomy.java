package main;

import java.util.Scanner;

public class Anatomy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        int c = a.length();
        String f = "";
        int e = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                f = f.concat(Character.toString(a.charAt(i)));
                if (f.length() == 7) {
                    e = 1;
                    break;
                }
            } else {
                f = "";
            }
        }
        if (e == 1) {
            System.out.println("YES");

        } else
            System.out.println("NO");
    }
}