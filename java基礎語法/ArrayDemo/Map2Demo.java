package ArrayDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map2Demo {

	public static void main(String[] args) {
		
		//無序HashMap
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Hello~");
		map.put(3, "Now");
		map.put(2, "These");
		
		System.out.println("第一種方式:");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key:"+key+",Value:"+value);
		}
		System.out.println("第二種方式:");
		for(Integer key:map.keySet()) {
			String value=map.get(key);
			System.out.println("Key:"+key+",Value:"+value);
		}
		//有序
		Map<Integer,String> Lmap=new LinkedHashMap<Integer,String>();
		Lmap.put(1, "AA~");
		Lmap.put(3, "TH");
		Lmap.put(2, "CR");
		System.out.println("----------------------------");
		System.out.println("LinkedHashMap:");
		
		for(Integer key:Lmap.keySet()) {
			String value=Lmap.get(key);
			System.out.println("Key:"+key+",Value:"+value);
		}
		//按字母排序
		Map<Integer,String> Tmap=new TreeMap<Integer,String>();
		Tmap.put(1, "AA~");
		Tmap.put(3, "TH");
		Tmap.put(2, "CR");
		System.out.println("----------------------------");
		System.out.println("TreeMap:");
		
		for(Integer key:Tmap.keySet()) {
			String value=Tmap.get(key);
			System.out.println("Key:"+key+",Value:"+value);
		}

	}

}
