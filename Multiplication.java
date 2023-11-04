// Write a progtam that promps the user to input a positive integer. It should then print 
// the multiplication table of that number

import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args) {
        try (Scanner n = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = n.nextInt();

            if(number <= 0){
                System.out.println("Number is not a positive integer");
            } else{
                for(int i = 1; i <= 12; i++){
                    System.out.println(number + " * " + i + " = " + i*number);
                }
            }
        }

    }
}