package advance.dev;
import java.util.Scanner;
public class MainApp {
	public static int divide(int a, int b) throws ThrowsNumber {
		if(b == 0) {
			throw new ThrowsNumber("So nhap vao khong hop le: bang 0");
		}
		return a/b;
	}
	
	public static void parse(String a){
		int so;
	        if (a.trim().equals("")) {
	            System.out.println("Chuoi nay rong, vui long nhap lai");
	        }
	        try {
	            so = Integer.parseInt(a);
	    	    System.out.println("So la: "+ so);
	        } catch (NumberFormatException ex) {
	            System.out.println("Chuoi khong hop le, vui long chi nhap so");
	        }
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao b: ");
		int b = sc.nextInt();
		try {
			int c = divide(a, b);
			System.out.println(c);
		} catch (ThrowsNumber s) {
			// TODO: handle exception
			System.out.println(s.toString());
		}
		System.out.println("Nhap vao a = ");
		String str = sc.next();
		parse(str);
	}

}