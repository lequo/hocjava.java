public class connguoi {
    public int tay;
    public int chieucao;
    public int cannang;

    public connguoi(int t, int cc, int cn)
    {
        this.cannang = cn;
        this.chieucao = cc;
        this.tay = t;
    }
    public void cannang(){
        System.out.println("can nang la: " + this.cannang);
    }

    public void chieucao(){
        System.out.println("chieu cao la: " + this.chieucao);
    }

    public void tay(){
        System.out.println("chieu dai canh tay la: " + this.tay);
    }

    public void tonghop(){
        System.out.println("can nang la: " + this.cannang + "chieu dai canh tay la: " + this.tay + "chieu dai canh tay la: " + this.tay);
    }
}
