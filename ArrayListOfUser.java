import java.util.ArrayList;
import java.util.List;
public class ArrayListOfUser {
    private String name;
    private int age;

    public ArrayListOfUser(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int Age){
        this.age = age;
    }

    public static void main(String[]args){
        List<ArrayListOfUser> user = new ArrayList<>();

        user.add(new ArrayListOfUser("kings", 20));
        user.add(new ArrayListOfUser("janet", 25));
        user.add(new ArrayListOfUser("micheal", 22));
        user.add(new ArrayListOfUser("solomon", 23));

        user.forEach(myUser -> {System.out.println("user name "  +myUser.getName() + " user age " + myUser.getAge());});
    }
}
