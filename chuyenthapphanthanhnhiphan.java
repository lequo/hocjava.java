import java.util.Scanner;
public class chuyenthapphanthanhnhiphan{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen: ");
        n = sc.nextInt();

        String nhiphan = "";

        while(n>0){
            nhiphan = (n%2)+ nhiphan;
            n= n/2;
        }
        System.out.println("he nhi phan la "+nhiphan);
        /* 
        chia lien tuc cho 2 va lay phan du
        dao nguoc chuoi => ket qua
        vd 10:2 =5 du 0
        5:2 = 2 du 1
        2: 2 =1 du 0
        1:2= 0 du 1
        ket qua là 1010
        */
    }
}