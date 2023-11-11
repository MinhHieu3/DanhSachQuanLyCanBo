package models;

public class CongNhan extends CanBo{
    private int bacLuong;

    public CongNhan(String hoVaTen, int tuoi, String gioiTinh, String diaChi,int bacLuong) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.bacLuong = bacLuong;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    @Override
    public String toString() {
        return "Menu"
                +"Họ và Tên "+CongNhan.this.getHoVaTen()
                +"Tuổi"+CongNhan.this.getTuoi()
                +"Giới Tính"+CongNhan.this.getGioiTinh()
                +"Địa Chỉ"+CongNhan.this.getDiaChi()
                +"Bậc Lương" + bacLuong ;
    }
}
