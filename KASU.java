class KASU {
    void Screening(){
        System.out.println("I am qualified");
    }
    void MyDepartment(String MatricNo, String Name, int Age, double CGPA){
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Matric Number: " + MatricNo);
        System.out.println("CGPA: " + CGPA);
    }
}

class KASU_Implementation{
    public static void main(String[] args){
        KASU StuInfo = new KASU();
        StuInfo.Screening();
        StuInfo.MyDepartment("KASU/20/CSC/1010", "Mubarak", 20, 3.1);
    }
}
