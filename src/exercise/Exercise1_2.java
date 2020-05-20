package exercise;

public class Exercise1_2 {
	public static void main(String args[]) {
		String folder = "c:javadev";
		String file = "file2";
		if(!folder.contains("\\")){
			folder = folder+"\\";
		}
		String pass = folder + file;
		System.out.println(pass);
	}

}
