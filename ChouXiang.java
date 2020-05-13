public class ChouXiang{
	public static void main(String[] args){
		F f=new G();
		f.run();
	}
}

abstract class F{
	public abstract void run();
}

class G extends F{
	@Override
	public void run(){
		System.out.println("gogo");
	}
}