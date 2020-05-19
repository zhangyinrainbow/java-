import java.util.*;
public class treemap{
	public static void main(String[] args){
		Map<String,Integer> map=new TreeMap<>();
		map.put("zhangyin",18);
		map.put("wangwei",44);
		map.put("sunge",40);
		//keySet遍历
		for(String id:map.keySet()){
			int value=map.get(id);
			System.out.println(id+":"+value);
		}
		//keySet遍历 
		for(Map.Entry<String,Integer> entry:map.entrySet()){
			String keytwo=entry.getKey();
			int valuetwo=entry.getValue();
			System.out.println(keytwo+":"+valuetwo);
		}
		//iterator遍历entrySet()
		
	}
}