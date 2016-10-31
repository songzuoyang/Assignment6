
public class Pet {
	public String name;
	public String ownerName;
	public String color;
	protected String Sex;
	protected int sexid ;
	
	Pet (String name, String ownerName, String color) {
		
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	void setSex(int sexid) {
		if (sexid==9) {
			Sex = "MALE";
		} else if (sexid==99) {
			Sex = "FEMALE";
		} else if (sexid==999) {
			Sex = "SPAYED";
		} else if (sexid==9999) {
			Sex = "NEUTERED";
		} else {
			Sex = "ARE YOU SERIOUS?";
		}
	}
	
	public String getSex() {
		return Sex;
	}

	@Override
	public String toString() {
		String result = null;
		result = getName() + " owned by " + getOwnerName() + "\n";
		result += "Color: " + getColor() + "\n";
		result += "Sex: " + getSex() + "\n";
		return result;
	}
	
	

}
