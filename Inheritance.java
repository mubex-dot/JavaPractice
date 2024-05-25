class Person{
    String name = "Mubarak";
    String school = "KASU";
}

class Introduction extends Person{
    public static void main(String[] args) {
        Introduction myIntro = new Introduction();
        System.out.println("My name is " + myIntro.name + " and I school in "+ myIntro.school);
    }
}
