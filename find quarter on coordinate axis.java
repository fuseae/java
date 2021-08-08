package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Input x and y: ");
        int x = in.nextInt();
        int y = in.nextInt();

        int quarter =0;

        /* if(x>0 && y>0) {
           quarter = 1;
        }
        if(x>0 && y<0) {
            quarter = 4;
        }
        if(x<0 && y<0) {
            quarter = 3;
        }
        if(x<0 && y>0) {
            quarter = 2;
        } */

        //qwe
        if(x>0) {
            if(y>0) quarter = 1;
            else quarter = 4;
        }
        else {
            if(y>0) quarter = 2;
            else quarter = 3;
        }

        System.out.println("Your quarter: " +quarter);
        in.close();

    }
}
