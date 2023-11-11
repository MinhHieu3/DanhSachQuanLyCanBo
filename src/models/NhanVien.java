package models;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "menu :"
                +"Họ Và Tên :" + NhanVien.this.getHoVaTen()
                +"Tuổi :" + NhanVien.this.getTuoi()
                +"Giới Tính :" +NhanVien.this.getGioiTinh()
                +"Địa Chỉ :" +NhanVien.this.getDiaChi()
                +"Công Việc'" + congViec ;
    }
}
