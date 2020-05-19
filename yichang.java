import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class yichang{
	public static void main(String[] args) throws Exception{
		byte[] bs=toGBK("中文");
		System.out.println(Arrays.toString(bs));
	}

	static byte[] toGBK(String s){
/* 		try{
			return s.getBytes("GBK");
		}catch(UnsupportedEncodingException e){
			System.out.println(e); 
            return s.getBytes(); 
		} */
		return s.getBytes();
		System.out.println("如果是测试代码，上面的写法就略显麻烦。如果不想写任何try代码，可以直接把main()方法定义为throws Exception：");
	}
}
