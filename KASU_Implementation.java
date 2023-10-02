// KASU_Implementation.java
public class KASU_Implementation {
    public static void main(String[] args) {
        KASU kasu = new KASU();

        // Invoking the Screening method
        kasu.Screening();

        // Invoking the My Department method with sample parameters
        String matricNo = "KASU123";
        String name = "John Doe";
        int age = 25;
        double cgpa = 3.8;

        kasu.MyDepartment(matricNo, name, age, cgpa);
    }
}
