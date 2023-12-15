package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Thong tin mot sinh vien");
		System.out.println("Ten:");
		String tenSv = sc.nextLine();
		System.out.println("ma sinh vien:");
		int msv = sc.nextInt();
		System.out.println("can cuoc cong dan:");
		long cccd = sc.nextLong();
		System.out.println("ten lop:");
		String className = sc.next();
		System.out.println("ten truong:");
		String schoolName = sc.next();
		System.out.println("diem trung binh ");
		float dtb = sc.nextFloat();
		System.out.println(" Thong tin cong nhan");
		System.out.println("ten:");
		String tenCn = sc.next();
		System.out.println("dia chi:");
		String dc = sc.next();
		System.out.println("so dien thoai:");
		long sdt = sc.nextLong();
		System.out.println("he so luong:");
		float hsl = sc.nextFloat();
		System.out.println(" Thong tin mot chiec xe car");
		System.out.println("ten:");
		String tenXe = sc.next();
		System.out.println("hang:");
		String hangXe = sc.next();
		System.out.println("gia:");
		long giaXe = sc.nextLong();
		System.out.println("mau son:");
		String mauXe = sc.next();
	}
}