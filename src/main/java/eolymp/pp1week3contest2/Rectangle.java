package main.java.eolymp.pp1week3contest2;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rectangleMake(n);


    }
    public static void rectangleMake(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println("###");
        }
    }

}
