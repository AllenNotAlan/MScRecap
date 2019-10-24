package oopPractical;

public class CartoonApp {

	public static void main(String[] args) {
		
		
		SimpsonsCharacter bart = new SimpsonsCharacter();
		bart.setName("Bart Simpson");
		bart.setCatchPhrase("Eat my shorts!");
		bart.sayCatchPhrase();
		
		SimpsonsCharacter homer = new SimpsonsCharacter();
		homer.setName("Homer Simpsons");
		homer.setCatchPhrase("D'oh!");
		homer.sayCatchPhrase();
		
	}

}
