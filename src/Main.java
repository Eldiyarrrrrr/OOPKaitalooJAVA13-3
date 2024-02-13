public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "BAHA";
        student1.age = 18;
        student1.group = "Js";


        Student student2 = new Student();
        student2.name = "BEKA";
        student2.age = 20;
        student2.group = "Java";


        Student student3 = new Student();
        student3.name = "KUBA";
        student3.age = 18;
        student3.group = "Java";


        Student student4 = new Student();
        student4.name = "YZAT";
        student4.age = 13;
        student4.group = "Js";


        Student student5 = new Student();
        student5.name = "ELDIYAR";
        student5.age = 21;
        student5.group = "Java";


        int [] ages = {student1.age, student2.age, student3.age, student4.age, student5.age};


        double round = 0;
        for (int i = 0; i < ages.length; i++) {
            round += ages[i];



        }
        System.out.println("Ortocho arifmetikalyk sany: " + round / 5);
    }
}