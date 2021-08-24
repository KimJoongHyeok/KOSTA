package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	// key : tel value : Member����
	private LinkedHashMap<String, Member> map = new LinkedHashMap<String, Member>();
	private String path;

	public SchoolService(String path) {
		super();
		this.path = path;
	}

	public void addMember(Member member) throws DuplicateTelException {

		if (map.containsKey(member.getTel())) {
			throw new DuplicateTelException(member.getTel() + "�� �ߺ��Ǿ� ��� �Ұ��մϴ�.");
		}
		map.put(member.getTel(), member);
	}

	public void printAll() {
		Collection<Member> col = map.values();
		Iterator<Member> it = col.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public Member findMemberByTel(String tel) throws MemberNotFoundException {

		if (map.containsKey(tel) == false) {
			throw new MemberNotFoundException(tel + "�� �ش��ϴ� ������������ ���� ã�� ���߽��ϴ�.");
		}
		return map.get(tel);
	}

	public Member deleteMemberByTel(String tel) throws MemberNotFoundException {
		if (map.containsKey(tel) == false) {
			throw new MemberNotFoundException(tel + "�� �ش��ϴ� ������������ ���� ã�� ���߽��ϴ�.");
		}
		return map.remove(tel);
	}

	public void updateMember(Member e) throws MemberNotFoundException {
		if (map.containsKey(e.getTel()) == false) {
			throw new MemberNotFoundException(e.getTel() + "tel�� �ش��ϴ� �������� �������� �ʾ� �����Ұ�");
		}
		map.put(e.getTel(), e);
	}

	public void saveData() throws FileNotFoundException, IOException {
		ObjectOutputStream oos = null;
		File dir = new File(path).getParentFile();
		if(dir.isDirectory() == false) {
			dir.mkdirs();
		}
		try {
			oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(map);
		} finally {
			if (oos != null)
				oos.close();
		}
	}

	@SuppressWarnings("unchecked")
	public LinkedHashMap<String, Member> loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		
		File file = new File(path);
		if(file.isFile() == false) {
			saveData();
		}
		try {
			ois = new ObjectInputStream(new FileInputStream(path));
			map = (LinkedHashMap<String, Member>) ois.readObject();
		} finally {
			if (ois != null)
				ois.close();
		}
		return map;
	}
	
	//����� loadData()
	public void loadData2() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(path);
		if(file.isFile()) {
			ObjectInputStream ois2 = null;
			try {
				ois2 = new ObjectInputStream(new FileInputStream(file));
				ois2.readObject();
			}finally {
				if(ois2 != null) ois2.close();
			}
		}
	}
	
	public boolean findMemberByTel2(String tel) {
		boolean flag = true;
		if(map.containsKey(tel) == true) {
			System.out.println("�Է��Ͻ� " + tel+" tel��ȣ�� �ߺ��� ��ȣ�Դϴ�.�ٽ� �Է����ּ���.");
			flag = true;
		}
		else
			flag = false;
		return flag;
	}

}
