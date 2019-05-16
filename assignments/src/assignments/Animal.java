package assignments;

public class Animal {

	public static void main(String[] args) {
		Animal an= new Animal();
		Dog d= new Dog();
		Dog d1= new Dog(2,4,"nonveg","pet");
		d.Dogfood();
		d.getName();
		d.setName("Tylor");
		
		Cat c = new Cat();
		Cat c1 = new Cat(2,4,"veg-nonveg","pet");
		c.Catfood();
		c.setName("Lusi");
		c.getName();
		
		System.out.println(d1);
		System.out.println(c1);
		
	}

}
