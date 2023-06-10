package com.kamal.classes.oop;

/*
    ACCESS MODIFIER & SPECIFIERS
    - public
    - private
    - protected

    NON-ACCESS MODIFIER
    - final
    - static
    - volatile
    - synchronised

    REFLECTION - Hacking
    Singleton - private constructor;

 */
public class Employee {

    private String employeeName;//getter & setter
    private String employeeDob;
    public int employeeAge;
    private double employeeSalary;


    public Employee(String employeeName, String employeeDob, int employeeAge, double employeeSalary){
        this.employeeName = employeeName;
        this.employeeDob = employeeDob;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public int getEmployeeAge(){
        return employeeAge;
    }
    public void setEmployeeAge(int employeeAge){
        this.employeeAge = employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDob='" + employeeDob + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    //
//    public Employee(String employeeName, int employeeAge, double employeeSalary){
//        this.employeeName = employeeName;
//        this.employeeAge = employeeAge;
//        this.employeeSalary = employeeSalary;
//    }
//
//    public Employee(){
//        this.employeeName = "Kamal Amoo";
//    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ola", "22-2-92", 22, 65000.90);
        System.out.println(employee.getEmployeeName());
        employee.setEmployeeAge(35);
        System.out.println(employee.getEmployeeAge());
        System.out.println(employee);
    }

}
