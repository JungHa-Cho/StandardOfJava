package Object_Oriented;

import Polymorphism.Barkable;

public class Tiger extends Animal implements Barkable{
    public String getName() {
        return this.name;
    }

	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("À¸¸£··");
	}

}
