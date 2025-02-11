 class Person {
    String name;
    String gender;
    String address;
    int age;
    public person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    
    }
    public void displayPerson(){
        System.out.println("Name: "+name + "\nGender: "+gender+"\nAddress: "+address+"\nAge: "+age);
        
    }
}
class Employee extends Person {
    String employeeId;
    String companyname;
    String qualification;
    int salary;
    public Employee(String name, String gender, String address, int age, String employeeId, String companyname, String qualification, int salary) {
        super(name, gender, address, age);
        this.employeeId=employeeId;
        this.companyname=companyname;
        this.qualification=qualification;
        this.salary=salary;
    }
    public void displayEmployee(){
        System.out.println("Employee ID: "+employeeId + "\nCompany Name: "+companyname +"\nQualification: "+qualification+"\nSalary: "+salary);
    }
}
class Teacher extends Person {
    String teacherId;
    String subject;
    int experience;
    public Teacher(String name, String gender, String address, int age, String teacherId, String

