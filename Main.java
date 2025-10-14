package sec04.exam;

public class Main {

	public static void main(String[] args) {
		int gasYank = 100;
		int minGas = 20;
		int numOfRounds =20;
		
		Car hyundai = new Car(gasTank, mingas,"Hyundai","Yellow");
		
		int numOfRound = 0;
		while(numOfRound <numOfRounds)
		{
			numOfRound++;
			
			if(hyundai.IsLeftGas()) {
				hyundai.RunOneRound();
			}
			else {
				hyundai.AddGas(gasYank);
			}
		}
		
		hyundai.showNumberOfCars();
		Car c1 = new Car(1,1,"",""");
		Car c2 = new Car(1,1,"",""");
		Car c3 = new Car(1,1,""","");
		Car c4 = new Car(1,1,"",""");
		
		hyundai.showNumberOfCars();
	}

}
