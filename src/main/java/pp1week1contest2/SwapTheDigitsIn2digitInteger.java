package main.java.pp1week1contest2;

import java.util.Scanner;

public class SwapTheDigitsIn2digitInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n%10 + "" + n/10);
    }
}
