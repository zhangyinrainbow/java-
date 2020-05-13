public class JieKou{
	public static void main(String[] args){
		I i=new I("wangwei40");
		i.run();
		System.out.println(i.getName());
		L l=new L();
		l.A();
		l.B();
	}
}

interface H{
	public abstract void run();
	public abstract String getName();
}

class I implements H{
	private String name;
	public I(String name){
		this.name=name;
	}
	@Override
	public void run(){
		System.out.println(this.name+"...run");
	}
	@Override
	public String getName(){
		return this.name;
	}
}

interface J{
	public abstract void A();
}
interface K extends J{
	public abstract void B();
}

class L implements K{
	@Override
	public void B(){
		System.out.println("B");
	}
	public void A(){
		System.out.println("A");
	}
}