package ss08_mvc_refactoring.pratice.model;

public class Student {
    private  String studentName;
    private int studentOfId;
    private double studentScore;
    private int studentCount;

    public Student() {
    }

    public Student(String studentName, int studentOfId, double studentScore, int studentCount) {
        this.studentName = studentName;
        this.studentOfId = studentOfId;
        this.studentScore = studentScore;
        this.studentCount = studentCount;
    }

    public String getStudentName() {

        return studentName;
    }

    public  void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentOfId() {
        return studentOfId;
    }

    public void setStudentOfId(int studentOfId) {
        this.studentOfId = studentOfId;
    }

    public double getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentOfId=" + studentOfId +
                ", studentScore=" + studentScore +
                ", studentCount=" + studentCount +
                '}';
    }
}
