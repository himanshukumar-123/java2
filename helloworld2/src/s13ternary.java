
public class s13ternary {

	public static void main(String[] args) {
		int age=18;
		boolean haslicence = true;
		boolean candrive = (age>18) ? true : false;
		boolean canRentAcar = candrive ? (haslicence ? true : false) : false;
		
		System.out.println("age=" + age);
		System.out.println("haslicence=" + haslicence);
		System.out.println("age=" + candrive);
		
		System.out.println("canRentAcar" + canRentAcar);
		
		String result = candrive ? (haslicence ? "has licence can drive" : "no licence a driver can not drive") : "driver is mad"; 
		System.out.println(result);
	}

}
