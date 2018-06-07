package extensionObject;

public class PeasantRole extends Role {

	public PeasantRole(Animal owner){
		super(owner);
		System.out.println("Peasant Role creating...");
	}

	public void playRole() {
		this.owner.move();
		System.out.println("gardening...");
		
	}
}
