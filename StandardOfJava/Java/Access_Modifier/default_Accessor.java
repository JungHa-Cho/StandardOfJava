package Access_Modifier;

// 같은 패키지 내 접근 가능
public class default_Accessor {
	String lastname = "Park";
	
	public static void main(String[] args) {
		house_park park = new house_park();
		System.out.println(park.lastname);
	}
}
