package Phone;

public class PhoneTest {

	public static void main(String[] args) {
		IPhone X = new IPhone("X", 100, "AT&T", "Zing");
		X.displayInfo();
		System.out.println(X.ring());
		System.out.println(X.unlock());
		
		Galaxy S9 = new Galaxy("S9", 100, "Verizon", "Ring Ring Ring");
		S9.displayInfo();
		System.out.println(S9.ring());
		System.out.println(S9.unlock());
	}

}