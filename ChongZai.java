public class ChongZai {
    public static void main(String[] args) {
        ReturnHello Hello = new ReturnHello();
		Hello.ReturnHelloone();
        Hello.ReturnHelloone("zhangsan");
		Hello.ReturnHelloone("zhangsan","lisi");
    }
}

class ReturnHello {
	public void ReturnHelloone(){
		System.out.println("hello");
	}
	public void ReturnHelloone(String name){
		System.out.println("hello"+name);
	}
	public void ReturnHelloone(String name,String nameone){
		System.out.println("Hello"+name+"and"+nameone);
	}
}
