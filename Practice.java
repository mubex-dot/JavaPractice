import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String[] studentList = new String[2];

        for(int i = 0; i < studentList.length; i++){
            System.out.println("Enter a name");
            studentList[i] = name.nextLine();
        }

        for (int i = 0; i < studentList.length; i++){
            System.out.println(i + 1 + ": " + studentList[i]);
        }
    }
}