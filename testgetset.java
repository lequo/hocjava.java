public class testgetset {
    public static void main(String[] args){
        getset gs= new getset(32,11, 3200);
        System.out.println("ngay = "+ gs.getDay());
        System.out.println("thang = "+ gs.getMonth());
        System.out.println("nam = "+ gs.getYear());
        System.out.print(gs);
    }
}
