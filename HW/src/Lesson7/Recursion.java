package Lesson7;

public class Recursion {
	int begin;
	int end;
	Recursion(int numA,int numB){
		sravn(numA,numB);
		methodOfRec(begin,end);
	}
	
	void sravn(int numA,int numB) {
		if (numA>numB) {
			end=numA;
			begin=numB;
			}
		else {
			end=numB;
			begin=numA;
		}
	}
	int methodOfRec(int begin,int end) {
		
		if (end<begin) {
			return begin;
		}
		System.out.print(end+"\t");
		end=methodOfRec(begin,end-1);
		return end;
	}
}