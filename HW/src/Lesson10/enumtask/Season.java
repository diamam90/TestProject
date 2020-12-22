package Lesson10.enumtask;

public enum Season {
	WINTER(-10), SUMMER(30){
		@Override
		public String getDescription() {
			return "������ ����� ����";
		}
	}, SPRING(5), AUTUMN(4);
	private int avgTemp;
	Season(int  avgTemp){
		this.avgTemp=avgTemp;
	}
	public int getAvgTemp() {
		return avgTemp;
	}
	public String getDescription() {
		return "�������� ����� ����";
	}
}
