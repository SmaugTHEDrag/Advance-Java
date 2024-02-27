package Model;
import java.time.LocalDate;
public class test {

		public static void main(String[] args) {
			System.out.println("hello");
			
			Person tom = new Person("Tom", "Smith", LocalDate.of(1985, 2, 12 ));
			Person janet = new Person("Janet", "Jackson", LocalDate.of(1985, 12, 3));
			
			tom.setSpouse(janet);
			
			Dog fido = new Dog("Fido", LocalDate.of(2018, 1, 1));
			Cat fides = new Cat("Fides", LocalDate.of(2019, 2, 3));
			tom.setPet(fido);
			fido.bark();
			fides.meow();
			System.out.println(tom);
		}
		
	}
