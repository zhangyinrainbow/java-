public class ChongXie{
	public static void main(String[] args){
		C c=new C();
		c.run();
		D d=new D();
		d.run();
		C f=new D();
		f.run();
	}
}
class C{
	public void run(){
		System.out.println("zhegeshi C de ");
	}
}
class D extends C{
	@Override
	public void run(){
		System.out.println("zhegeshi D de");
	}
}