public class student {
    int studentId;
    String student_name;
    String student_sername;
    int Percentage;
    void getStudent(){
        System.out.println("student_name: " + student_name+" \n" + "studentId: "+studentId+ " \n" + "Percentage: "+ Percentage+"%");
    }

    void setStudent(int id, String name, int p ){
        student_name = name;
        studentId = id;
        Percentage = p;
    }
    int getPercentage(){
        return Percentage = 79;
    }
    String getName(){
        return student_name = "Sandeep";
    }
    public static void main(String[] args) {
        student details = new student();
        /*details.studentId = 2345;
        details.student_name = "Nithin";
        details.student_sername = "Dadive";
        details.Percentage = 89;*/

        details.setStudent(2342, "Nithin", 89);
        details.getStudent();

        details.setStudent(2333, "Ramesh", 78);
        details.getStudent();

        String Name =details.getName();
        System.out.println("Name: "+ Name );

        int percent = details.getPercentage();
        System.out.println("percent: " + percent+ "%");
    }
}