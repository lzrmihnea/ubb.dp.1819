package ro.ubb.dp1819.lab1.prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(1L, "Andrei", 9);
        Student student2 = student1;
        Student student3 = student1.clone();

        System.out.println(" The first one:");
        System.out.println(student1);

        System.out.println("\n The next one should be the exact same");
        System.out.println(student2);

        System.out.println("\n The last one should be different");
        System.out.println(student3);

    }
}
