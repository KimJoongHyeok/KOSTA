package step2;

public class TestString {
	public static void main(String[] args) {
		String name = "아이유";
		System.out.println(name.concat("님"));
		System.out.println(name.contains("이"));
		System.out.println(name.contains("어"));
		System.out.println(name.indexOf("유")); //2index 반환
		System.out.println(name.indexOf("ㅋ")); //존재하지 않으면 index 는 -1을 반환
		System.out.println(name.startsWith("아"));
		System.out.println(name.startsWith("아이")); //어떤 단어로 시작하는지, 아 도 true, 아이 도 true
		System.out.println(name.endsWith("유")); //어떤 단어로 끝나는지
		String info = "잘하고있다.";
		System.out.println(info.substring(2)); //2 begin index
		System.out.println(info.substring(2,4)); //고있
		info = "잘하고 있다."; //공란 추가
		System.out.println(info.substring(2,5));
		String id = " java king";
		System.out.println(id.length()); //공란도 숫자 세줘야함
		System.out.println(id.trim()); //양 옆 여백을 제거
		System.out.println(id.trim().length()); //양 여백을 제거한 후 length를 확인
		String nick = "코코오빠";
		System.out.println(nick.replace("오", "아"));
		String fileName = "org.web.t.java";
		System.out.println(fileName.lastIndexOf(".")); // . 마지막 문자열의 index를 반환
		int i = fileName.lastIndexOf(".");
		System.out.println(fileName.substring(i+1)); //파일의 확장자를 구한다.
		System.out.println(fileName.replace(".java", "")); //.java를 제외한 문자열을 생성
	}
}
