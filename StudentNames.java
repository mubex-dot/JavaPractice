// a. Write a java program that prompts user to supply the names of twenty (20) students and store the names in
// an array with the help of a scanner class, looping statement and array itself. 
// b. Write a Java block of code that printout the entire 20 names supplied i.e the content of the array in a above
// c. Write a Java block of code that automatically assigns serial numbers while printing the names.  

import java.util.Scanner;
import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {
        String name = "";
        ArrayList<String> nameList = new ArrayList<String>();
        for (int i = 0; i < 20; i++){
            Scanner names = new Scanner(System.in);
                System.out.println("Enter a name: ");
                name = names.nextLine();
            
            nameList.add(name);
        }
        System.out.println(nameList.size());
        System.out.println("The list of names of the students you supplied are found below");
        for(int i = 1; i <= 20;){
            for(int j = 0; j < nameList.size(); j++){

                System.out.println(j + 1 + " : " + nameList.get(j));
            }
            break;
        }

        
    }
}
