package step3;
// StringBuilder method test
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("김가네");
		System.out.println(sb);
		System.out.println(sb.append("참치김밥"));
		System.out.println(sb.indexOf("가"));
		System.out.println(sb.substring(2, 5));//index 2부터 5앞까지 
		System.out.println(sb.insert(2, "나"));
		System.out.println(sb.delete(2, 5));
		StringBuilder  message=new StringBuilder("뻐이장가가니");
		System.out.println(message.reverse());
	}
}
