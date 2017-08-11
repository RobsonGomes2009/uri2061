import java.util.Locale;
import java.util.Scanner;

public class uri1059 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
	}

}
