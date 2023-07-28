package baitapCtyDienLuc;

import java.util.Scanner;

public class KhachHang {
	public String maKH;
	public String tenKH;
	public String diaChi;
	public String ngayThangNam;
	public int soMoi;
	public int soCu;

	public KhachHang(String maKH, String tenKH, String diaChi, String ngayThangNam, int soMoi, int soCu) {
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.ngayThangNam = ngayThangNam;
		this.soMoi = soMoi;
		this.soCu = soCu;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgayThangNam() {
		return ngayThangNam;
	}

	public void setNgayThangNam(String ngayThangNam) {
		this.ngayThangNam = ngayThangNam;
	}

	public int getSoMoi() {
		return soMoi;
	}

	public void setSoMoi(int soMoi) {
		this.soMoi = soMoi;
	}

	public int getSoCu() {
		return soCu;
	}

	public void setSoCu(int soCu) {
		this.soCu = soCu;
	}

	Scanner scan = new Scanner(System.in);

	public void nhapThongTin() {
		
//		System.out.println(" - CÔNG TY ĐIỆN LỰC HỐ NAI - ");
//		
//		System.out.println("              ^              ");
//		System.out.println("            < + >            ");
//		System.out.println("              v              ");
//		
		System.out.println("NHẬP THÔNG TIN KHÁCH HÀNG ");
		System.out.println(" ------------------------- ");
		System.out.println("NHẬP MÃ KHÁCH HÀNG : ");
		this.maKH = scan.nextLine();
		System.out.println("NHẬP TÊN KHÁCH HÀNG : ");
		this.tenKH = scan.nextLine();
		System.out.println("NHẬP ĐỊA CHỈ KHÁCH HÀNG : ");
		this.diaChi = scan.nextLine();
		System.out.println("NHẬP NGÀY THÁNG : ");
		this.ngayThangNam = scan.nextLine();
		System.out.println("NHẬP SỐ ĐIỆN CŨ : ");
		this.soCu = scan.nextInt();
		System.out.println("NHẬP SỐ ĐIỆN MỚI : ");
		this.soMoi = scan.nextInt();
	}

	public void hienThiThongTin() {
		
		System.out.println("--- THÔNG TIN KHÁCH HÀNG ---");
		System.out.println("MÃ KHÁCH HÀNG : " + maKH);
		System.out.println("TÊN KHÁCH HÀNG : " + tenKH);
		System.out.println("ĐỊA CHỈ KHÁCH HÀNG : " + diaChi);
		System.out.println("NGÀY THÁNG NĂM : " + ngayThangNam);
		System.out.println("SỐ ĐIỆN CŨ : " + soCu);
		System.out.println("SỐ ĐIỆN MỚI : " + soMoi);
	}


}
