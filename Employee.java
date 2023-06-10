public class Employee {
    //public Employee{
        private String employeeName;
        private String employeeDob;
        private int employeeAge;
        private double empolyeeSalary;
    
    public Employee(String employeeName, String employeeDob, int employeeAge, double empolyeeSalary){
        this.employeeName = employeeName;
        this.employeeDob = employeeDob;
        this.employeeAge = employeeAge;
        this.empolyeeSalary = empolyeeSalary;
    }
    public Employee(){
        
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public String getEmployeeName(){
        return employeeName; 
    }
    public static void main(String[]args){
        Employee myEmployee = new Employee("ola", "ll-10-22", 20, 10000.00);
        myEmployee.setEmployeeName("kunle");
        System.out.println(myEmployee.getEmployeeName());
    }
}
