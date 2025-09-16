package sec01.exam01;

public class SwitchTest {

	public static void main(String[] args) {
		String val = "Mon";
		
		switch(val) {
		case "Mon":
			System.out.println("code 1");
			break;
		case "Tue":
			System.out.println("code 2");
			break;
		case "Wed":
			System.out.println("code 3");
			break;
		default:
			System.out.println("no code");
		}

	}

}
