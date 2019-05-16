package assignments;

public class PetAnimal {

	private String food;
	private String name;
	
	public PetAnimal(String food, String name){
		this.food= food;
		this.name=name;
	}
	public PetAnimal() {
		
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PetAnimal [food=" + food + ", name=" + name + "]";
	}
	
}
