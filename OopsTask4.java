
class Employee{
    String name;
    int empID;
    double salary;

    Employee(String name, int empID, double salary) {
            this.name=name;
            this.empID=empID;
            this.salary=salary;
    }
    
    void displayInfo(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee Salary: "+salary);
        System.out.println("\n");
    }
}

public class OopsTask4 {
    Employee emp1 = new Employee("Rajan", 01526, 088000f);
    Employee emp2 = new Employee("Shubham", 01146, 078345f);

}
