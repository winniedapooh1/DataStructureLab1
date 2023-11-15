package assign1_template;


import assign1_template.Student;

public class TestStudents {
    public static void main(String[] args) {
        //Student myDept = new Student(null, null, null, null, null, 0.0);
        //2.2 Code given to you. Just use them.

        //create an array of Student objects.
        Student[] cisDept = new Student[4];

        //Create and add 4 students, two undergraduates, two master students
        //   add these students to the array 
        //They are commented since you haven't added your code to Undergraduate, MasterStudent

        String[] theisCommittee = {"Tom", "Richard", "Gene"};
        cisDept[0] = new MasterStudent("222", "Steve", "Jobs", "IST", "MS", 3.5,
                "How to make ipad smarter", "Jamie", theisCommittee);

        cisDept[1] = new Undergraduate("444", "Bill", "Gates", "CS", "BS", 3.0, "Erin", "Sally");

        String[] theisCommittee2 = {"Jie", "Zoran", "Gene"};
        cisDept[2] = new MasterStudent("333", "Amy", "Jobs", "CS", "MS", 3.8,
                "Study of Robots That can Perform", "Eduard", theisCommittee2);

        cisDept[3] = new Undergraduate("111", "Melinda", "Gates", "IST", "BS", 3.0, "Erin", "Frank");


        //2.2 Add the code to do the task below.

        //Use a loop to print the information about all students in the student array.
        //   Must use the toString() methods
        for (int i = 0; i < cisDept.length; i++) {
            /*
             * this prints all of the Students in the cisDept
             */
            System.out.println(cisDept[i].toString());
            System.out.println();
        }

        
        System.out.println(indexOfMin(cisDept));
        

        //2.3.2 add the code for the task below
        // call indexOfMin(...), passing the array  cisDept,
        // print the student located at the return value of indexOfMin(...)


    }


    //2.3.2 add the code for the task below
    //  implement this method, return the index of the first student in
    //   the array in the alphabetical order of student names (last name first, then first name
    //  You must call compareTo(...) method in your Student class.
    //  Using Arrays.sort(...) in this method will lead to point deduction.
    public static int indexOfMin(Student[] myDept) {
        String min = myDept[0].getLastName();
        int index = 0;
        for(int i = 1; i < myDept.length;i++){
            if (min.compareTo(myDept[i].getLastName()) > 0){ //compares to get the new min
                index = i;
                min = myDept[i].getLastName();
            } else if (min.compareTo(myDept[i].getLastName()) == 0){ //compares to see if hey are the same
                if (myDept[index].getFirstName().compareTo(myDept[i].getFirstName()) > 0){ //this is the new min when compared the first name
                    index = i;
                    min = myDept[i].getLastName();
                }
            } else if (min.compareTo(myDept[i].getLastName()) < 0){ // This case does not matter
                continue;
            }
        }
        System.out.println("index of min: ");
        return index;
    }
}