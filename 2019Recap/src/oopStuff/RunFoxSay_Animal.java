package oopStuff;

public class RunFoxSay_Animal {

	public static void main(String[] args) {
		
		Animal dog = new Animal("Dog", "Woof", "Brown", "Pointy", "Small");
		Animal cat = new Animal("Cat", "Meow", "Black", "Flat", "Small");
		Animal bird = new Animal("Bird","Tweet", "Black", "No Nose", "Small");
		Animal fox = new Animal("Fox", "Ring-ding-ding-ding-dingeringeding!", "Blue", "Pointy", "Tiny");
		
		
		dog.makeNoise();
		cat.makeNoise();
		bird.makeNoise();
		fox.makeNoise();
		
	}

}
