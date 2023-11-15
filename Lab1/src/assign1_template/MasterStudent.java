package assign1_template;

import java.util.Arrays;

public class MasterStudent extends Student {

    //2.1.3 Add the code for the tasks below.
    //add new data fields: thesis, thesisAdvisor, theisCommittee
    private String thesis;
    private String thesisAdvisor;
    private String[] committee; //thesis committee, excluding thesis advisor    

    //add two required constructors
    public MasterStudent(){

    }
    public MasterStudent(String id,String fName, String lName, String major, String degree, double gpa, String mThesis, String mthesisAdvisor, String [] mCommittee){
        super(id, fName, lName, major, degree, gpa);
        this.thesis = mThesis;
        this.thesisAdvisor = mthesisAdvisor;
        this.committee = mCommittee;

    }
    
    //add getters for all new data fields
    public String getThesis(){
        return thesis;
    }
    public String getThesisAdvisor(){
        return thesisAdvisor;
    }
    public String [] getCommittee(){
        return committee;
    }
    
    //add setters for all new data fields
    public void setThesis(String mthesis){
        thesis = mthesis;
    }
    public void setThesisAdvisor(String mThesisAdvisor){
        thesisAdvisor = mThesisAdvisor;
    }
    public void setCommittee(String [] mCommittee){
        committee = mCommittee;
    }
    
    //add new toString() method that overrides the toString() in Student class


    @Override
    public String toString() {
        String response ="thesis: " + thesis + '\n' +
                ", thesisAdvisor: " + thesisAdvisor + '\n' +
                ", committee: " + Arrays.toString(committee);
        return response;
    }

    //optional: for testing the coding of your MasterStudent class.
    public static void main(String[] args) {

    }
}
