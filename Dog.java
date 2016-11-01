import java.util.Date;

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
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 0001 && year <=9999){
			this.boardStart= (year,month,day);
		} else {
			System.out.println("Please input vaild date");
		}
	}
	
	static void setBoardEnd(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			this.boardEnd=new (year,month,day);
		} else {
			System.out.println("Please input vaild date");
		}
	}
	
	static boolean boarding(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			Date test=new (year,month,day);
			if((test.before(boardEnd)&&test.after(boardStart))||test.equals(boardEnd)||test.equals(boardStart))
				return true;
			else
				return false;
		} else {
			System.out.println("Please input vaild date");
			return false;
		}
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
