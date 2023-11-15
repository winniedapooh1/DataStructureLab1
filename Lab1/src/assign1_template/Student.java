package assign1_template;

//2.3.1 mark the class to implement the generic interface Comparable<T> and compare two students.
public class Student implements Comparable<Student> {

    //2.3.1 add your implementation of the compareTo(...) method 
    // compare this student to the other student passed based on their names.
    //   first by last name, then first name if the last name is the same.
    // return 0, positive integer, or negative integer values
    //    0       if this student's name is the same as the other student's name,    
    //    positive integer if this student's name follows the other student's name in the alphabetical order,
    //    negative integer if this student's name precedes the other student's name in the alphabetical order.    
    
    
    //Don't change the code below. Just use them.
    private String id;
    private String firstName;
    private String lastName;
    private String major;
    private String degree;
    private double gpa;

    //constructors
    public Student() {
    }

    public Student(String id, String firstName, String lastName, String major,
            String degree, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.degree = degree;
        this.gpa = gpa;
    }

    //setters
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //getters
    public String getDegree() {
        return degree;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName
                + ", major: " + major + ", degree: " + degree + ", gpa: " + gpa;
    }


    //optional: for testing the coding of your Student class.
    //  verify the code implementing Comparable<T> interface in Java API
    public static void main(String[] args) {

    }
    

    @Override
    public int compareTo(Student other) {
        /*
         * this method compares two students and returns 0,1,-1
         */
        if (lastName.compareTo(other.getLastName()) == 0){
            return firstName.compareTo(other.getFirstName());
        } else {
            return lastName.compareTo(other.getLastName());
        }
    }
}
