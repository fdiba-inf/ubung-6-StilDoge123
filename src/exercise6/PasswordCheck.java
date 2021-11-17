package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passLength = 0;
        int digitCount = 0;
        boolean passValid = true;
        do{
            String password = input.next().toString();
             passLength = password.length();
            for (int i = 0; i < passLength; i++) {
                if(!Character.isLetterOrDigit(password.charAt(i))){
                    passValid=false;
                    break;
                }
                else if(Character.isDigit(password.charAt(i))){
                    digitCount++;
                }
            }
        }while(passValid == false || digitCount <2 || passLength<8);
        System.out.println("Password is valid!");
    }
}
