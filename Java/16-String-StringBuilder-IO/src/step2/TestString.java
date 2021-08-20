package step2;
// java.lang.String class의 method test 
public class TestString {
	public static void main(String[] args) {
		String name="아이유";
		System.out.println(name.concat("님"));
		System.out.println(name.contains("이"));
		System.out.println(name.contains("어"));
		System.out.println(name.indexOf("유"));//2 index 반환 
		System.out.println(name.indexOf("ㅋ"));//존재하지 않으면 index는 -1을 반환 
		System.out.println(name.startsWith("아이"));
		System.out.println(name.endsWith("유"));
		String info="잘하고 있다";
		System.out.println(info.substring(2));//2 beginIndex
		System.out.println(info.substring(2,5));//고있  beginIndex부터 endIndex 앞까지 
		String id=" javaking ";
		System.out.println(id.length());
		System.out.println(id.trim().length());//양여백을 제거한 후 length를 확인  
		String nick="코코오빠";
		System.out.println(nick.replace("오", "아"));
		String fileName="org.web.t.java";
		System.out.println(fileName.lastIndexOf("."));// . 마지막 문자열의 index 를 반환 
		int i=fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1));//파일의 확장자를 구한다 
		System.out.println(fileName.replace(".java", ""));//.java 를 제외한 문자열 생성 
	}
}




















