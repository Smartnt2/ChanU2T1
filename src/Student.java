public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String studentName, int studentAge, int studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    public void introduce() {
        if (grade < 6) {
            System.out.println("My name is " + name + " and I am in elementary school!");
        } else if (grade < 9) {
            System.out.println("My name is " + name + " and I am in middle school!");
        } else {
            System.out.println("My name is " + name + " and I am in college!");
        }
        System.out.println("I am " + age + " years old!");
    }

}
