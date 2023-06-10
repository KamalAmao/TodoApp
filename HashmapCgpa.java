
public class HashmapCgpa {
    String course;
    String score;
    String unit;
    String grade;

    public String getCourse(){
        return course;
    }
    public void setCourse(){
        this.course = course;
    }

    public String getScore() {
        return score;
    }
  
    public void setScore(String score) {
        this.score = score;
    }
  
    public String getunit() {
        return unit;
    }
  
    public void setUnit(String unit) {
        this.unit = unit;
    }
  
    public String getGrade() {
        return grade;
    }
  
    public void SetGrade(String grade) {
        this.grade = grade;
    }
  
    HashmapCgpa(String score, String unit, String grade) {
        this.course = course;
        this.score = score;
        this.unit = unit;
        this.grade = grade;
        
    }
  
}

