

public class getset 
{
     private int day;
     private int month;
     private int year;
     public getset(int day, int month, int year){
         if(day>=1 && day<=31){
            this.day=day;
         }
        else{
            this.day=1;
        }

        if(month>=1 && month <=12){
            this.month= month;
        }
        
        if(year>=0){
            this.year=year;
        }
     }
     public int getDay(){
         return this.day;
     }

     public void setDay(Integer d){
         if(d>=1 && d<=31){
            this.day = d;
         }
     }
     public int getMonth() {
         return month;
     }
     public void setMonth(Integer m){
         if(m<=12 && m>=1){
            this.month = m;
         }
     }

     public int getYear(){
         return year;
     }

     public void setYear(Integer a){
        if(a>=1){
            this.year = a;
        }
     }

     public String toString(){
         return this.day + "/"  + this.month + "/" + this.year;
     }
}
