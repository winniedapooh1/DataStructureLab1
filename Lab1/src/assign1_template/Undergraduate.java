package assign1_template;

public class Undergraduate extends Student {

    //2.1.2 Add the code for tasks below
    //add new data fields: generalEduAdvisor, majorAdvisor
    private String generalEduAdvisor;
    private String majorAdvisor;

    //add two required constructors
    public Undergraduate(){

    }
    public Undergraduate (String id,String fName, String lName, String major, String degree,double gpa, String generalEduAdvisor, String majorAdvisor){
        super(id,fName, lName, major, degree, gpa);
        this.generalEduAdvisor = generalEduAdvisor;
        this.majorAdvisor = majorAdvisor;
    }

    public void setGeneralEduAdvisor(String uGeneralEduAdvisor){
        generalEduAdvisor = uGeneralEduAdvisor;
    }
    public void setMajorAdvisor(String uMajorAdvisor){
        majorAdvisor = uMajorAdvisor;
    }
    public String getGeneralEduAdvisor(){
        return generalEduAdvisor;
    }
    public String getMajorAdvisor(){
        return majorAdvisor;
    }
    
    //add getters for all new data fields
    
    //add setters for all new data fields
    
    //add new toString() method that overrides the toString() in Student class
    public String toString(){
        String response = "";
        response = "General Edu Advisor: " + generalEduAdvisor + "\n"+ " Major Advisor: " + majorAdvisor;
        return response;
    }
    
    //optional: for testing the coding of your Undergraduate class.
    public static void main(String[] args) {

    }

}
