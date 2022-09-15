public class hoadoncaphe{
    private String tenLoaiCaPhe;
    private double giaTien1kg;
    private double khoiLuong;
    public hoadoncaphe(String ten, double gt, double kl){
        this.tenLoaiCaPhe = ten;
        this.giaTien1kg = gt;
        this.khoiLuong = kl;
    }
    public double tinhtongtien(){
        return this.giaTien1kg * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuong(double kl){
        if(this.khoiLuong > kl){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean kiemtratien(){
        return this.tinhtongtien() > 500;
    }

    public double giamgia(double x){
        if(this.tinhtongtien() > 500){
            return (x/100)*tinhtongtien();
        }
        else{
            return 0;
        }
    }
    public double sotienphaitra(){
        return this.tinhtongtien() - this.giamgia(10);
        
    }
}

