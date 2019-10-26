package oopStuff;

public class Animal {
	
	private String name;
	private String animalSound;
	private String eyeColour;
	private String noseType;
	private String pawSize;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the animalSound
	 */
	public String getAnimalSound() {
		return animalSound;
	}
	/**
	 * @param animalSound the animalSound to set
	 */
	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}
	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}
	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	/**
	 * @return the noseType
	 */
	public String getNoseType() {
		return noseType;
	}
	/**
	 * @param noseType the noseType to set
	 */
	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}
	/**
	 * @return the pawSize
	 */
	public String getPawSize() {
		return pawSize;
	}
	/**
	 * @param pawSize the pawSize to set
	 */
	public void setPawSize(String pawSize) {
		this.pawSize = pawSize;
	}
	
	public void makeNoise() {
		
		if(!this.name.equalsIgnoreCase("Fox")) {
			System.out.println(this.name+" goes "+this.animalSound);
		} else {
			for(int loop = 0;loop<3;loop++) {
				System.out.println(this.animalSound);
			}
		}
		
	}
	/**
	 * @param name
	 * @param animalSound
	 * @param eyeColour
	 * @param noseType
	 * @param pawSize
	 */
	public Animal(String name, String animalSound, String eyeColour, String noseType, String pawSize) {
		super();
		this.name = name;
		this.animalSound = animalSound;
		this.eyeColour = eyeColour;
		this.noseType = noseType;
		this.pawSize = pawSize;
	}
	
	
	
}
