public class EmployeeData{
    private String studentName;
    private String studentId;
    private static int counter =0;
    public EmployeeData(String name){
        this.studentId = String.format("%02d",++counter);
        this.studentName = name;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public String toString(){
        return String.format("%s\n%s",this.studentId,this.studentName);
    }








}
