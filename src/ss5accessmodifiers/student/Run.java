package ss5accessmodifiers.student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Cuong");
        student.setClasses("C09");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
