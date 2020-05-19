import java.util.Random;
public class random{
	public static void main(String[] args){
		Random r=new Random(12345);
		for(int i=0;i<=10;i++){
			System.out.println(r.nextInt(100));
		}
		Random w=new Random();
		for(int i=0;i<=10;i++){
			System.out.println(r.nextInt(100));
		}
	}
}