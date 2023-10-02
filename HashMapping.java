import java.util.HashMap;

public class HashMapping {
    public static void main(String[] args){
        HashMap<String, String> courses = new HashMap<String, String>();
        
        courses.put("CSC", "Computer Science");
        courses.put("MTH", "Mathematics");
        courses.put("PHY", "Physics");
        courses.put("CHM", "Chemistry");

        for(String i : courses.keySet()){
            System.out.println("Course Code: " + i + " Department: " + courses.get(i));
        }

    }
}
