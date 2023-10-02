// write a java program that prompts the user to supply the list of course codes and their titles. The program should be able 
// to detect the department for which the course code belongs to. for example, CSC 202 belongs to csc dept and PHY 102 belongs
// to physics department

import java.util.Scanner; // for accepting user input
import java.util.HashMap; // for creating a key value pair

public class CourseDept {
    public static void main(String[] args){
        Scanner code = new Scanner(System.in);
        System.out.println("What is the course code?");
        String courseCode = code.nextLine().toUpperCase(); // to change whatever input to upper caee

        Scanner title = new Scanner(System.in);
        System.out.println("What is the course title?");
        String courseTitle = title.nextLine();

        HashMap<String, String> courses = new HashMap<String, String>(); // creating hashmap for key value pair
        
        courses.put("CSC", "Computer Science");
        courses.put("MTH", "Mathematics");
        courses.put("PHY", "Physics");
        courses.put("CHM", "Chemistry");

        boolean found = false; // to check if the item is found in the hashmap

        for(String i : courses.keySet()){
            if (courseCode.contains(i)){
                System.out.println("The course code " + courseCode + " belongs to " + courses.get(i) + " department.");
                found = true; // item found
                break; // break from the loop
            }
        }
         if(!found){
                System.out.println("The course code you gave doesn't belong on the list"); // item not found
            }        
    }
}
