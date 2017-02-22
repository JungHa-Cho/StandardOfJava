package Object_Oriented;

public class Zoo_Keeper {
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getName());
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.setName("tiger");
		
		Lion lion = new Lion();
		lion.setName("lion");
		
		Zoo_Keeper zooKeeper = new Zoo_Keeper();
		//zooKeeper.feed(tiger);
		//zooKeeper.feed(lion);
	}
}
