public class JingTai{
	public static void main(String[] args){
		M m=new M();
		m.xiaxie();
		M.setNumber(99);
		System.out.println(M.number);
	}
}

class M{
	public static int number;
	public static void setNumber(int value){
		number=value;
	}
	public void xiaxie(){
		System.out.println("xiaxie");
	}
}