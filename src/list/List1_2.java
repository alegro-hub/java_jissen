package list;

public class List1_2 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		if(s1.contains("Java")) {
			System.out.println("•¶š—ñs1‚ÍJava‚ğŠÜ‚ñ‚Å‚¢‚Ü‚·");
		}
		if(s1.endsWith("Java")){
			System.out.println("•¶š—ñs1‚ÍAJava‚ª––”ö‚É‚ ‚è‚Ü‚·");
		}
		System.out.println("•¶š—ñs1‚ÅÅ‰‚ÉJava‚ª“oê‚·‚éˆÊ’u‚Í"+s1.indexOf("Java"));
		System.out.println("•¶š—ñs1‚ÅÅŒã‚ÉJava‚ª“oê‚·‚éˆÊ’u‚Í"+s1.lastIndexOf("Java"));
		
	}

}
