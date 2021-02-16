package lesson14;
import java.util.function.Predicate;
	
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> predicate1 = s-> s!=null;
		Predicate<String> predicate2  = s-> s.isEmpty();
		Predicate<String> predicate3=predicate1.and(predicate2);

		System.out.println((predicate3).test(""));
		System.out.println(predicate3.test("dasdasd"));
		System.out.println(predicate3.test(null));
		Predicate<String> predicate4 = s-> s.startsWith("J");
		Predicate<String> predicate5 = s-> s.startsWith("N");
		Predicate<String> predicate6 = s-> s.endsWith("A");
		Predicate<String> predicate7 = predicate4.or(predicate5).and(predicate6);
		System.out.println();
		System.out.println(predicate7.test("JAVA"));
		System.out.println(predicate7.test("JAVa"));
		System.out.println(predicate7.test("NanyA"));
	}

}
