package step1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		//map�� key�� value ������ ����
		
		map.put("a", "������");
		map.put("b", "�ں���");
		System.out.println(map.size());
		System.out.println(map);
		//key�� �̿��� value �˻�
		System.out.println(map.get("b"));
		//������ �����ϴ� key�� map�� �߰� 
		map.put("a", "��ȿ��"); //key�� �����ؾ� �ϹǷ� value�� ������Ʈ
		System.out.println(map.size()); //2
		System.out.println(map);
		System.out.println(map.get("a"));
		map.put("c", "�ں���");
		System.out.println(map);
		//key�� ���� ������ Ȯ���غ���
		System.out.println(map.containsKey("a")); //�����ϸ� true, �������� ����� false
		System.out.println(map.containsKey("f")); //�����ϸ� true, �������� ����� false
		//key�� �̿��� ����, ������ ��� ������ ��ȯ
		System.out.println(map.remove("b"));
		System.out.println(map.remove("r")); //������Ұ� ������ null ��ȯ
		
		map.put("k", "�����");
		map.put("t", "�̰���");
		//map�� �����ϴ� key���� ��ȯ
		System.out.println("**map���� key�鸸 ���**");
		Set<String> set = map.keySet();
		//Iterator interface : java.util.Collection ������ ��� ����ü ��Ҹ� �ݺ�, ������ �� �ִ� ����� ����
		Iterator<String>it = set.iterator();
		while(it.hasNext()) { //��Ұ� �����ҋ� ���� true��ȯ
			System.out.println(it.next()); //��Ҹ� ��ȯ
		}
		System.out.println("**map���� value�鸸 ���**");
		Collection<String> col = map.values();
		Iterator<String>it2 = col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
	}
}
