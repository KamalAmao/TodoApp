package oop;

public class TheEmployee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public TheEmployee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getSalary(){
        return salary;
    }
    public int getAnnualSalry(){
        return salary * 12;
    }
    public int raiseSalary(){
        return (salary + salary /100 *10);
    }
    public void setRaiseSalary(int salary){
        this.salary = salary;
        /*if ( salary < 0){
            this.salary = 0;
        }
            this.salary = salary;*/
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public static void main(String[]args){
        TheEmployee employee = new TheEmployee(9, "ola", "ade", 4000);
        employee.setRaiseSalary(800);
        System.out.println("The employee's Id is " + employee.getId());
        System.out.println("The employee's first and last name is " + employee.getFirstName() + " " +employee.getLastName());
        System.out.println("The employee's salary is " + employee.getSalary());
        System.out.println("The employee's annual salary is " + employee.getAnnualSalry());
        System.out.println("The employee's raised salary is " + employee.raiseSalary());

    }
}
