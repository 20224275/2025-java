package sec04.exam;

public class Car {
	int gas;
	static int numberOfCars;
	
	int mingas; //한바퀴 돌때 필요한 gas
	String teamName;
	String color;
	
	
	Car(int gas, String teamName, String color){
		this.gas = gas;
		this.mingas = mingas;
		this.teamName = teamName;
		this.color = color;
		numberOfCars++;
		
	}
	boolean IsLesftGas() {
		if(gas < mingas) {
			System.out.println("연료를 보충해야합니다.")
			return false;
		}
		System.out.println("한바퀴 더 돌 수 있어요.")
		return true;
	}
	
	void AddGas(int gas) {
		System.out.println("연료 만땅.")
		this.gas = gas;
	}
	void RunOneRound()
	{
		System.out.println("한바퀴 완주.")
		this.gas -= migas;
	}
	
	static void showNumberOfCars()
	{
		System.out.println("Number of Cars :" +numberOfCars);
		
	}

}
