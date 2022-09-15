
public class phuongthuc {
    public int day;
    public int month;
    public int year;
    public int date;
    public phuongthuc(int d, int m, int y){
        this.day = d;
        this.month= m;
        this.year = y;

    }
    // in ra ngay
    public void printday(){
        System.out.println("day: "+ this.day);
    }

    public void printmonth(){
        System.out.println("month: "+ this.month);
    }

    public void printyear(){
        System.out.println("year: "+ this.year);
    }

    public void printdate(){
        System.out.println("day: "+ this.day + "year: "+ this.year);
    }
} 
