package assignments;

public class Dog extends PetAnimal implements Food{

	private int eyes;
	private int legs;
	private String food;
	private String catogary;
	
	public Dog(int eyes, int legs, String food, String catogary) {
		this.eyes= eyes;
		this.legs= legs;
		this.food= food;
		this.catogary= catogary;
	}
	
	public Dog(){
		
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getCatogary() {
		return catogary;
	}
	public void setCatogary(String catogary) {
		this.catogary = catogary;
	}
	@Override
	public String toString() {
		return "Dog [eyes=" + eyes + ", legs=" + legs + ", food=" + food + ", catogary=" + catogary + "]";
	}

	@Override
	public void Catfood() {
		System.out.println("Cat can eat veg and nonveg both.");
		
	}

	@Override
	public void Dogfood() {
		System.out.println("Dog can eat only nonveg food.");
		
	}
}
