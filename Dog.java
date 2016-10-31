
public class Dog extends Pet implements Boardable{
	String size;
	
	Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		// TODO Auto-generated constructor stub
	}	
	
    public String getSize() {
		return size;
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
		info = "DOG:\n";
		info += getName() + " owned by " + getOwnerName() + "\n";
		info += "Color: " + getColor() + "\n";
		info += "Sex: " + getSex() + "\n";
		info += "Size: " + getSize();
		return info;
	}
	

}
