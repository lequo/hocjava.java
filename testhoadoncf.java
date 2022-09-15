public class testhoadoncf {
    public static void main(String[] args){
        hoadoncaphe hd = new hoadoncaphe("trung nguyen",100, 5.5);
        System.out.println("tong tien: " + hd.tinhtongtien());
        System.out.println("khoi luong: " + hd.kiemTraKhoiLuong(3));
        System.out.println("don giam gia: "+ hd.giamgia(5));
        System.out.println("tong so tien can tra la: "+ hd.sotienphaitra());
    }
}
