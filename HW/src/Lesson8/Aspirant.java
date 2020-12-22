package Lesson8;

public class Aspirant extends Students {
	private String work;
	public String getWork() {
		return work;
		
	}
	public void setWork(String work) {
		this.work=work;
	}
	public Aspirant(String firstName,String lastName,String group,double avgMark,String work) {
			super(firstName, lastName, group, avgMark);
			this.work=work;
		}
		public static void main(String[] args) {
			Students student1 = new Students("Иван", "Иванов",
					"group1", 4.8);
			Aspirant aspirant1= new Aspirant("Петр", "Петров", 
					"group2", 5, "work1");
			Students student2 = new Aspirant("Константин", "Сидоров",
					"group1", 4.3, "work2");
			
			System.out.println(student1.getAvgMark());
			System.out.println(student2.getScholarship());
			
			Students[] students ={student1,aspirant1, student2};
			for (Students s :students) {
				System.out.println(s.getLastName() + " " +s.getScholarship());
			}
		}
		
		
		
		
		@Override
		public double getScholarship() {
			return getAvgMark()==5? 200:180;
		}
}
