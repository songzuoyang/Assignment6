import java.util.ArrayList;

public class AnimalHospital {
	public ArrayList<Pet> pets;
	void printPetInfoByName(String name) {
		for(int i=0; i<pets.size();i++){
			if(pets.get(i).getName().equals(name)){
				System.out.println(pets.get(i).toString());
			}
		}
	}
	
	void printPetInfoByOwner(String name) {
		for(int i=0; i<pets.size();i++){
			if(pets.get(i).getOwnerName().equals(name)){
				System.out.println(pets.get(i).toString());
			}
		}
	}
	
	void printPetsBoarding(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			for(int i=0; i<pets.size();i++){
				if(pets.get(i).getClass().toString().endsWith("Dog")&&((Dog)pets.get(i)).boarding(year,month,day))
					System.out.println(pets.get(i).toString());
				if(pets.get(i).getClass().toString().endsWith("Cat")&&((Cat)pets.get(i)).boarding(year,month,day))
					System.out.println(pets.get(i).toString());				
			}
		}
	}

}
