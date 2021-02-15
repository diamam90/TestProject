package lesson14;
import java.util.function.Consumer;
import Lesson7.Phone;
public class ConsumerDemo {

	public static void main(String[] args) {
		Phone ph1 = new Phone("Samsung", "666"); 
		Consumer<Phone> consumer1 = phone->System.out.println("Продали телефон"+ phone);
		consumer1.accept(ph1);
		Consumer<Phone> consumer2 = phone->System.out.println("Отправляем телефон" +phone);
		Consumer<Phone> consumer3 = consumer1.andThen(consumer2);
		consumer3.accept(ph1);
	}

}
