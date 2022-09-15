class bangcuuchuong {
    public static void main(String[] args){
        for(int i=2;i<=9;i++){
            int tich=0;
            System.out.println("bang cuu chuong "+ i);
            for(int j=1;j<9;j++){
                tich = i*j;
                
                System.out.println(i  + " x " + j +" = "+ tich);
            }
        }
    }
}