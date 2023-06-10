import java.util.Objects;
public class CgpaInfo {
    private Double score;
    private Integer unit;
    private String grade;


    public CgpaInfo(Double score, Integer unit, String grade){
        this.score = score;
        this.unit = unit;
        this.grade = grade;
    }

    public Double getScore(){
        return score;
    }
    public Integer getunit(){
        return unit;
    }
    public String getGrade(){
        return grade;
    }
    @Override
    public String toString() {
        return "CgpaInfo{" +
                "score='" + score + '\'' +
                ", unit='" + unit + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CgpaInfo cgpaInfo = (CgpaInfo) o;
        return Objects.equals(score, cgpaInfo.unit) && grade == cgpaInfo.grade && Double.compare(cgpaInfo.unit, unit) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(score, unit, grade);
    }
}
