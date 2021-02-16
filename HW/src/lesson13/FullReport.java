package lesson13;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import lesson12.Employee;
import java.text.NumberFormat;
public class FullReport {
	public Employee[] emp;
	public static void generationReport(Employee[] emp,String language, String country)
			throws UnsupportedEncodingException {
		Locale current = new Locale(language, country);
		ResourceBundle rb = ResourceBundle.getBundle("information", current);
		System.out.println(rb.getString("info"));
		NumberFormat nf=NumberFormat.getInstance();
		for (Employee e:emp) {
			System.out.printf("ФИО сотрудника:%-15s, заработная плата: ",e.getFullName());
			System.out.println(nf.format(e.getSalary())); 
		}
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		Employee emp1=new Employee("Иванов И.И", 36000);
		Employee emp2=new Employee("Сидоров С.С", 106000);
		Employee emp3=new Employee("Иванова А.А", 16000);
		Employee emp4=new Employee("Ива F.F", 6000);
		Employee[] employees = {emp1,emp2,emp3,emp4, new Employee("Швалова Ш.А.", 40000)};
		generationReport(employees, "en","US");
	}
	
}
