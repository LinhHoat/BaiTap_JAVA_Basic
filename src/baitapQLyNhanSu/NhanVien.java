package baitapQLyNhanSu;
import java.util.Scanner;

public class NhanVien {
	
	public String maNV;
	public int cccd;
	public String tenNV;
	public String namSinh;
	public String gioiTinh;
	public int soDT;
	public String chucVu;

	public NhanVien(String maNV, int cccd, String tenNV, String namSinh, String gioiTinh, int soDT, String chucVu) {
		this.maNV = maNV;
		this.cccd = cccd;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDT = soDT;
		this.chucVu = chucVu;

	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public int getCccd() {
		return cccd;
	}

	public void setCccd(int cccd) {
		this.cccd = cccd;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getSoDT() {
		return soDT;
	}

	public void setSoDT(int soDT) {
		this.soDT = soDT;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	Scanner scan = new Scanner(System.in);
	public void nhapThongTinNV() {
		System.out.println("--- NHẬP THÔNG TIN NHÂN VIÊN ---");
		System.out.println("NHẬP MÃ NHÂN VIÊN : ");
		this.maNV = scan.nextLine();
		System.out.println("NHẬP CCCD NHÂN VIÊN : ");
		this.cccd = scan.nextInt();
		System.out.println("NHẬP TÊN NHÂN VIÊN : ");
		this.tenNV = scan.nextLine();
		System.out.println("NHẬP NĂM SINH NHÂN VIÊN : ");
		this.namSinh = scan.nextLine();
		System.out.println("NHẬP GIỚI TÍNH NHÂN VIÊN : ");
		this.gioiTinh = scan.nextLine();
		System.out.println("NHẬP SỐ ĐIỆN THOẠI NHÂN VIÊN : ");
		this.soDT = scan.nextInt();
		System.out.println("NHẬP CHỨC VỤ NHÂN VIÊN : ");
		this.chucVu = scan.nextLine();
	}
	
	public void hienThiThongTinNV() {
		System.out.println("--- THÔNG TIN NHÂN VIÊN ---");
		System.out.println(" + " + maNV + " - " + cccd +" - " + tenNV + " - " + namSinh + " - " + gioiTinh + " - " + soDT + " - "+ chucVu);
	}
	
	public static void main(String[] args) {
		NhanVien nhanvien1 = new NhanVien("",0,"","","",0,"");
		nhanvien1.nhapThongTinNV();
		nhanvien1.hienThiThongTinNV();
	}
}
