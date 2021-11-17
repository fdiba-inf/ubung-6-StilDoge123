package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n = input.nextInt();
        int temp = n;
        boolean isPalindrome = false;
        while(n!=0){
           int a = n%10;
           sum = sum*10 + a;
           n/=10;
        }
        if(temp == sum){
            isPalindrome = true;
        }
        System.out.println("Palindrome: " + isPalindrome);
    }
}
