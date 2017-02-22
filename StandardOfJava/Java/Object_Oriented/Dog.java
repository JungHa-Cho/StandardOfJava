package Object_Oriented;

// extends = 상속 키워드
public class Dog extends Animal{
	public void sleep(){
		System.out.println(this.name+" zzz");
	}
	
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
	}
}
