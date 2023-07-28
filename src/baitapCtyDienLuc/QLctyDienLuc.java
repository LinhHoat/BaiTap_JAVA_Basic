package baitapCtyDienLuc;

public class QLctyDienLuc {

	public static void main(String[] args) {
		
//		KhachHang khachhang1 = new KhachHang("", "", "", "", 0, 0);
//		khachhang1.nhapThongTin();
//		khachhang1.hienThiThongTin();
		
		QLchucnang khachhang = new QLchucnang();
		khachhang.nhapDanhSachKH();
		khachhang.hienThiDanhSachKH();
		khachhang.tinhTienDien();
	}

}
