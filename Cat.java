
public class Cat extends Pet implements Boardable{
	String hairLength;

	Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		// TODO Auto-generated constructor stub
	}

	public String getHairLength() {
		return hairLength;
	}
	
    static void setBoardStart(int month, int day, int year) {
		
	}
	
	static void setBoardEnd(int month, int day, int year) {
		
	}
	
	static boolean boarding(int month, int day, int year) {
		return false;
	}

	public String toString() {
		String info = null;
		info = "CAT:\n";
		info += getName() + " owned by " + getOwnerName() + "\n";
		info += "Color: " + getColor() + "\n";
		info += "Sex: " + getSex() + "\n";
		info += "Hair: " + getHairLength();
		return info;
	}

	
}
