package baitapCtyDienLuc;

import java.util.Scanner;

public class QLchucnang {

//	nhập mảng số lượng khách hàng

	KhachHang[] danhSachKH;
	int soLuongKH;

	Scanner scan = new Scanner(System.in);

//	nhập thông tin vào danh sách khách hàng
	public void nhapDanhSachKH() {
		System.out.println("NHẬP SỐ LƯỢNG KHÁCH HÀNG :");
		this.soLuongKH = scan.nextInt();

		this.danhSachKH = new KhachHang[soLuongKH];
		KhachHang nhapKH;
		for (int i = 0; i < danhSachKH.length; i++) {
			nhapKH = new KhachHang("", "", "", "", 0, 0);
			nhapKH.nhapThongTin();
			danhSachKH[i] = nhapKH;
		}
	}

//	hiển thị khách hàng đã nhập vào danh sách 
	public void hienThiDanhSachKH() {
		System.out.println("--- THÔNG TIN KHÁCH HÀNG ---");
		for (int i = 0; i < danhSachKH.length; i++) {
			System.out.println("MÃ KHÁCH HÀNG : " + danhSachKH[i].getMaKH() + " - " + "TÊN KHÁCH HÀNG : "
					+ danhSachKH[i].getTenKH() + " - " + " ĐỊA CHỈ KHÁCH HÀNG : " + danhSachKH[i].getDiaChi() + " - "
					+ "NGÀY THÁNG NĂM : " + danhSachKH[i].getNgayThangNam() + " - " + "SỐ ĐIỆN CŨ : "
					+ danhSachKH[i].getSoCu() + " - " + "SỐ ĐIỆN MỚI : " + danhSachKH[i].getSoMoi());

		}
	}

//	tính tiền điện của khách hàng
	public Integer tinhTienDien() {
		int tongTienDien = 0;
		
		
		for (int i = 0; i < danhSachKH.length; i++) {
			int	tinhTru = danhSachKH[i].getSoMoi() - danhSachKH[i].getSoCu();
		
			if (tinhTru  >= 0 && tinhTru <= 50) {
				tongTienDien = (int) (tinhTru * 1484 + (tinhTru * 1484 * 0.1));
			} else if (tinhTru >= 51 && tinhTru <= 100) {
				tongTienDien = (int) (50 * 1484 + (tinhTru - 50) * 1533 + ((50 * 1484 + (tinhTru - 50) * 1533) * 0.1));
			} else if (tinhTru >= 101 && tinhTru <= 200) {
				tongTienDien = (int) (50 * 1484 + 50 * 1533 + (tinhTru - 100) * 1786
						+ ((50 * 1484 + 50 * 1533 + (tinhTru - 100) * 1786) * 0.1));
			} else if (tinhTru >= 201 && tinhTru <= 300) {
				tongTienDien = (int) (50 * 1484 + 50 * 1533 + 100 * 1786 + (tinhTru - 200) * 2242
						+ ((50 * 1484 + 50 * 1533 + 100 * 1786 + (tinhTru) * 2242) * 0.1));

			} else if (tinhTru >= 301 && tinhTru <= 400) {
				tongTienDien = (int) (50 * 1484 + 50 * 1533 + 100 * 1786 + 100 * 2242 + (tinhTru - 300) * 2503
						+ ((50 * 1484 + 50 * 1533 + 100 * 1786 + 100 * 2242 + (tinhTru - 300) * 2503) * 0.1));

			} else{
				tongTienDien = (int) (50 * 1484 + 50 * 1533 + 100 * 1786 + 100 * 2242 + 100 * 2503 + (tinhTru - 400) * 2587
						+ ((50 * 1484 + 50 * 1533 + 100 * 1786 + 100 * 2242 + 100 * 2503 + (tinhTru - 400) * 2587) * 0.1));
			}
		}
		for(int j = 0; j< danhSachKH.length; j++) {
			System.out.println("TONG SO TIEN CUA KHACH HANG "+ danhSachKH[j].getTenKH() +" : "+ tongTienDien+"VND");
		}
		
		
		return tongTienDien;
	}

}
