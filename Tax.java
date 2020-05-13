public class Tax{
	public static void main(String[] args){
		
	}
}

class Income{
	protected double income;
	public double getTax(){
		return income*0.1;
	}
}

class Salary extends Income{
	@Override
	public double getTax(){
		if(income<=5000){
			return 0;
		}else{
			return (income-5000)*0.2;
		}
	}
}

class StateCountSpecial extends Income{
	@Override
	public double getTax(){
		return 0;
	}
}

