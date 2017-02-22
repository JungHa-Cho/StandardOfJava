package Access_Modifier;

// private는 해당 클래스에서만 접근이 가능하다.
public class private_Accessor {
	private String secret;
	private String getSecret(){
		return this.secret;
	}
}
