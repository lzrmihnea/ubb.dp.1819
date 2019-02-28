package ro.ubb.dp1819.lab1.prototype;

public class Student {

    private long id;
    private String name;
    private int gradeAtDesignPatterns;

    public Student(long id, String name, int gradeAtDesignPatterns) {
        this.id = id;
        this.name = name;
        this.gradeAtDesignPatterns = gradeAtDesignPatterns;
    }

    // This is private, indicating it cannot be normally used
    private Student(String name, int gradeAtDesignPatterns) {
        this.name = name;
        this.gradeAtDesignPatterns = gradeAtDesignPatterns;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student clone = new Student(this.name, this.gradeAtDesignPatterns);
        // The clone does not have an ID, it is a different object memory-wise
        return clone;
    }

    @Override
    public String toString() {
        String objectHashCode = super.toString();

        return objectHashCode
                + ", id: "
                + this.id
                + ", name: "
                + this.name
                + ", grade at DP: "
                + this.gradeAtDesignPatterns;
    }
}
