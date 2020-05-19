import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class list{
	public static void main(String[] args){
		List<String> s=new ArrayList<>();
		s.add("zhangyin");
		s.add("zhangyinone");
		s.add("zhangyintwo");
		for(String ss:s){
			System.out.println(ss);
		}
	}
}
