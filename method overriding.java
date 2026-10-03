class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");

        // Printing object
        System.out.println(s1);
    }
}
