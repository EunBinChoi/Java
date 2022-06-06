package overview;

public class CarTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar sc1 = new SportsCar(1);
		System.out.println(sc1);
		
		SportsCar sc2 
		= new SportsCar
		(2, "TICO", "Red", 40, 20);
		System.out.println(sc2);
		
		////////////////////////////////////////
		// c1 -> sc3 (+ turbo 20)
		Car c1 = new Car(3, "TICO", "Black", 30);
		SportsCar sc3 = new SportsCar(c1, 20);
		System.out.println(sc3);
	}

}
