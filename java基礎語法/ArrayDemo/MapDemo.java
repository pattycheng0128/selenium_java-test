package ArrayDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>map=new HashMap<Integer,String>();
		//key���୫��
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "B");
		System.out.print(map);
		System.out.println(map.get(4));
		
		//key���ƭȷ|�Q�̫�@�ӻ\��(����o�˨ϥ�)
		Map<Integer,String>map2=new HashMap<Integer,String>();
		map2.put(1, "AA");
		map2.put(3, "BB");
		map2.put(3, "CC");
		map2.put(3, "DD");
		System.out.print(map2);
		System.out.println(map2.get(3));

	}

}
