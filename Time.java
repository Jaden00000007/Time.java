public class Time{
  private int hour;
  private int min;
  private int second;

  public Time(int hour, int min, int second){
    this.hour = hour;
    this.min = min;
    this.second = second;
  }

  public void tick(){
    second++;
    if(second >= 60){
      second = 0;
      min++;     
      if (min >= 60){
        min = 0;
        hour++;
        if (hour >= 24){
          hour = 0;
        }
      }
    }
  }

  public String info(){
    String hour2 = "" + hour;
    String min2 = "" + min;
    String second2 = "" + second;
    if(hour2.length() == 1){ 
      hour2 = "0" + hour2;
    }
    if(min2.length() == 1){ 
      min2 = "0" + min2;
    }
    if(second2.length() == 1){ 
      second2 = "0" + second2;
    }
    return hour2 + ":" + min2 + ":" + second2;
  }

  public void add(String time){
    int hour2 = Integer.parseInt(time.substring(0,2));
    int min2 = Integer.parseInt(time.substring(3,5));
    int second2 = Integer.parseInt(time.substring(6,8));
    second += second2;
    if(second >= 60){
      second = second - 60;
      min++;
    }
    min += min2;
    if(min >= 60){
      min = min - 60;
      hour++;
    }
    hour += hour2;
    if(hour > 24){
      hour = hour - 24;
    }
  }
}
