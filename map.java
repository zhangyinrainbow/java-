import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class map{
	public  static void main(String[] args){
		Student one=new Student("zhangyin",18);
		Student three=new Student("sunge",40);
		Map<String,Student> target=new HashMap<>();
		target.put("wangwei",one);
		target.put("fengzy",three);
		Student two=target.get("wangwei");
		System.out.println(two==one);
		System.out.println(target.get("fengzy"));
		// for遍历map
		Map<String,Integer> map=new HashMap<>();
		map.put("wangwei",44);
		map.put("sunge",40);
		map.put("zhangyin",18);
		map.put("fengzy",99);
		for(String key:map.keySet()){
			int value=map.get(key);
			System.out.println(key+":"+value);
		}
		//entrySet()遍历
		for(Map.Entry<String,Integer> entry:map.entrySet()){
			String key2=entry.getKey();
			int value2=entry.getValue();
			System.out.println(key2+":"+value2);
		}
		//iterator遍历entrySet()
/* 		Iterator it=map.entrySet().iterator();
		while(it.hashNext()){
			Map.Entry entry=(Map.Entry)it.next();
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key2+":"+value2);
		} */
	}
}
class Student{
	public int age;
	public String name;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
