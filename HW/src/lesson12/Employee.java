package lesson12;

public class Employee {
	private String fullName;
	private int salary;
	public Employee(String fullName, int salary) {
		this(fullName);
		this.salary=salary;
	}
	public Employee(String fullName) {
		this.fullName=fullName;
	}
	public String getFullName() {return fullName;}
	public double getSalary() {return salary;}
	public void setFullName(String name) {fullName=name;}
	public void setSalary(int salary) {this.salary=salary;}
	public static void main(String[] args) {
		Employee emp1=new Employee("Иванов И.И", 36000);
		Employee emp2=new Employee("Сидоров С.С", 106000);
		Employee emp3=new Employee("Иванова А.А", 16000);
		Employee emp4=new Employee("Ива F.F", 6000);
		Employee[] employees = {emp1,emp2,emp3,emp4, new Employee("Швалова Ш.А.", 40000)};
		Report.generationReport(employees);
	}
}
class Report{
	public static void generationReport(Employee... emp) {
		for (Employee e:emp) {
		System.out.printf("ФИО сотрудника:%-15s, заработная плата:%,12.2f\n",e.getFullName(),e.getSalary());
		}
	}
}