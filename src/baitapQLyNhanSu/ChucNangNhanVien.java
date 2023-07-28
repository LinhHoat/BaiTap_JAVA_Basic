package baitapQLyNhanSu;

import java.util.Scanner;

public class ChucNangNhanVien {

//	nhập số lượng khách hàng
	NhanVien[] danhSachNV;
	int soLuongNV;

	Scanner scan = new Scanner(System.in);

//	nhập thông tin nhân viên vào danh sách khách hàng.
	public void nhapDanhSachNV() {
		System.out.println("NHẬP SỐ LƯỢNG NHÂN VIÊN :");
		soLuongNV = scan.nextInt();

		danhSachNV = new NhanVien[soLuongNV];
		NhanVien nhapNV;
		for (int i = 0; i < danhSachNV.length; i++) {
			nhapNV = new NhanVien("", 0, "", "", "", 0, "");
			nhapNV.nhapThongTinNV();
			danhSachNV[i] = nhapNV;
		}
	}

//	hiển thị danh sách nhân viên 
	public void hienThiDanhSachNV() {
		System.out.println("--- THÔNG TIN DANH SÁCH NHÂN VIÊN ---");
		for (int i = 0; i < danhSachNV.length; i++) {
			System.out.println("MÃ NHÂN VIÊN : " + danhSachNV[i].getMaNV() + "CCCD NHÂN VIÊN : "
					+ danhSachNV[i].getCccd() + " - " + "TÊN NHÂN VIÊN : " + danhSachNV[i].getTenNV()
					+ "NGÀY THÁNG NĂM : " + danhSachNV[i].getNamSinh() + "GIỚI TÍNH NHÂN VIÊN : "
					+ danhSachNV[i].getGioiTinh() + " - " + " SỐ ĐIỆN THOẠI NHÂN VIÊN : " + danhSachNV[i].getSoDT()
					+ " - " + "CHỨC VỤ NHÂN VIÊN : " + danhSachNV[i].getChucVu());
		}
	}
}
