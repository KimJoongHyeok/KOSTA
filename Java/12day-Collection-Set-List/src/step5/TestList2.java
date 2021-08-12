package step5;
//TestList2 �� Generic�� �������� �ʾ��� ���� ��, Generic�� ������ TestList3 �� ���غ���.
import java.util.ArrayList;

//DTO : Data Transfer Object , VO : Value Object , DAO : Data Access Object
public class TestList2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new FriendDTO("������", 100));
		list.add(new FriendDTO("�ں���", 200));
		list.add(new FriendDTO("���ϴ�", 50));
		//list.add("������"); //Generic�� �������� �ʾƼ� �ٸ� Ÿ���� ��ҵ� �߰� ����
		//list ��� �� index�� 1�� ����� name�� ����ϰ��� �Ѵ�
		/*
		Object o = list.get(1);
		FriendDTO dto = (FriendDTO)o; //����ȭ, Object down casting �� �ʿ�
		System.out.println(dto.getName()); //�ڽ� Ŭ������ ������ ����� ȣ���� �� ����
		*/
		//�Ʒ��� ���� �ٿ��� ����
		FriendDTO dto = (FriendDTO)list.get(1);
		System.out.println(dto.getName());
		//for���� �̿��� ����� getMoney() ȣ���ؼ� money���
		System.out.println("******************");
		for(int i = 0;i<list.size();i++) {
			FriendDTO fd = (FriendDTO)list.get(i);
			System.out.println(fd.getMoney());
		}
		

	}
}
