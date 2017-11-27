package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int  n = rand.nextInt(100) + 1;
        int printStar;
        private void printStar(int n){
            if(n > 0){
                System.out.print("*");
                printStar(n-1);
            }
        }
    }
}
