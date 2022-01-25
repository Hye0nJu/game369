import java.util.Scanner;

public class game369 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		System.out.println(a);
		
		int count = 0;
		
		for(int i = 0; i < 2 ; i++) {
			if(a % 10 == 3 || a % 10 == 6 || a % 10 == 9) {
				count = count + 1;
			}
			a = a / 10;
		}
		
		if(count == 1) {
			System.out.println("¹Ú¼öÂ¦");
		}
		else if(count == 2) {
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		
		in.close();
	}

}
