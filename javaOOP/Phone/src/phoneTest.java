
public class phoneTest {

	public static void main(String[] args) {
		Galaxy s9 =  new Galaxy("s9",99,"versions last ","Rings Rings Rings ! ");
		IPhone  iphone_ten =  new IPhone("iphone ten",99,"best vesions","Zings Zings !! ");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphone_ten.displayInfo();
		System.out.println(iphone_ten.ring());
		System.out.println(iphone_ten.unlock());

		
	}

	
}
