package step4;

public class KostaMember {
	private String id;
	private String password;
	
	public void setId(String id) {
		//this�� ���� ��ü�� ����Ų��. this.id�� �ν��Ͻ� ���� id�̰� id�� �Ű����� id�̴�.
		//�Ű����� id�� �ν��Ͻ� ����id�� �����ϱ� ���� this �ڹ� Ű���带 ����Ѵ�
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
}
