public class clock {

    public static void main(String[] args) {
        
      Time tell = new Time(1, 20, 33.5);
      getTime(tell);  
      
      Time say = new Time(100000665.8);
      getTime(say);
      }
  
   public static void getTime(Time time) {
    System.out.println(time.hour + ":" + time.minute + ":" + time.second);
   } 
       
    }
    
 class Time {
    int hour, minute;
    double second;
    
   public Time(int hour, int minute, double second) {
    while (second > 60) {
     minute++;
     second -= 60;
     }
     
      this.second = second;
      //this.minute = minute;
     
    
    while (minute > 60) {
     hour++;
     minute -= 60;
    }
    
     this.minute = minute;
     this.hour = hour;
    
          
}   

   public Time(double secs) {
    this.hour = (int) secs/3600;
    secs -= this.hour * 3600;
    this.minute = (int) secs/60;
    secs -= this.minute * 60;
    this.second = secs;
   }
       

}


