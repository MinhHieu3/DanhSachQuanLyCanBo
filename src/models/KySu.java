package models;

public class KySu extends CanBo{
    private String nganhDaoTao;


    public KySu(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "menu :"
                +"Họ Và Tên :" + KySu.this.getHoVaTen()
                + "Tuổi :" + KySu.this.getTuoi()
                +"Giới Tính :" +KySu.this.getGioiTinh()
                +"Địa Chỉ :" +KySu.this.getDiaChi()
                +"Ngành Đào Tạo" + nganhDaoTao ;
    }
}
