package test.pattern;

public class TestSingletonDesignPattern {
	public static void main(String[] args) {
		//private 생성자 이므로 compile error
		//CompanyDAO dao = new CompanyDAO();
		//public static 메서드를 이용해 
		//CompanyDAO 객체의 주소값을 반환받는다.
		System.out.println(CompanyDAO.getInstance());
		System.out.println(CompanyDAO.getInstance());
		System.out.println(CompanyDAO.getInstance());
		//CompanyDAO의 getCompanyInfo를 호출해서
		System.out.println(CompanyDAO.getInstance().getCompanyInfo());
	}
}
