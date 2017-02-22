package Object_Oriented;

import Polymorphism.Barkable;

public class Lion extends Animal implements Barkable{
    public String getName() {
        return this.name;
    }
	
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("æÓ»Ô");
	}

}
