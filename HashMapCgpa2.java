import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
  
public class HashmapCgpa2 {
  
    public static void main(String[] args) {
          
        HashmapCgpa c1.put(new HashmapCgpa.put("CSE201", "45", "D");) 
        HashmapCgpa c2.(new HashmapCgpa.pu("CSE202", "80", "A"));
        HashmapCgpa c3 = new HashmapCgpa.put("CSE203", "90", "A");
        HashmapCgpa c4 = new HashmapCgpa.put("CSE204", "80", "A");
        HashmapCgpa c5 = new HashmapCgpa.put("CSE205", "60", "B");
        HashmapCgpa c6 = new HashmapCgpa.put("CSE206", "50", "C");
          
        List<HashmapCgpa> mylist = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6));
        HashMap<String, List<String>> myMap = new HashMap<String, List<String>>(); 
        
        for(HashmapCgpa cCourse : mylist) {            
            if (myMap.containsKey(cCourse.course)) {
                myMap.get(cCourse.course).add(cCourse.grade+"-"+cCourse.unit);
            } else {
                myMap.put(cCourse.course, new ArrayList<String>());
                myMap.get(cCourse.course).add(cCourse.score+"-"+cCourse.unit+ "-" + cCourse.grade);
            }
        }
        System.out.println(myMap);
    }
  
}