 class Person {
    String name;
    String gender;
    String address;
    int age;
    public Person(String name, String gender, String address, int age) {
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
    int employeeId;
    String companyname;
    String qualification;
    int salary;
    public Employee(String name, String gender, String address, int age, int employeeId, String companyname, String qualification, int salary) {
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
class Teacher extends Employee {
    int teacherId;
    String subject;
    String department;
    public Teacher(String name,String gender,String address,int age,int employeeId, String companyname, String qualification, int salary, int teacherId, String subject,String department){
    
        super(name, gender, address, age,employeeId,companyname,qualification,salary);
        this.teacherId=teacherId;
        this.subject=subject;
        this.department=department;
    }
    public void displayTeacher(){
        System.out.println("Teacher Id: "+teacherId + " \nSubject:" + subject +"\nDepartment: "+department);

    }
}
public class  TeacherDemo1{
    public static void main(String[]args){
        Employee e=new Employee("suparna","female","palakkad",22,101,"Google","MCA",50000);
        Teacher t=new Teacher("sonia","female","ernakulam",30,101,"Google","MCA",50000,105,"java","computer application");
        t.displayPerson();
        t.displayEmployee();
        t.displayTeacher();
    }
}




