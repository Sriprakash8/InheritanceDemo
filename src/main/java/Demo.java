public class Demo {
    public static void main(String[] args) {
       // Person person = new Person();

       Student student = new Student("Sri", "vcvcx", "GRT");
       
    }
}

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(){
        System.out.println("Parent constructor is called");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Student extends Person{
    String schoolName;

    public Student(String firstName, String lastName, String schoolName) {
        super(firstName, lastName);
        this.schoolName = schoolName;
    }

    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student() {
        System.out.println("Student constructor is called");

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
