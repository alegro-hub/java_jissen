package exercise;

public class exercise1_1 {
	public static void main(String args[]) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=100;i++) {
			sb.append(i+",");
		}
		
		String s = sb.toString();
		System.out.println(s);
		String[] words = s.split(",");
		
		for(String w : words) {
			System.out.println(w);
		}
	}

}
