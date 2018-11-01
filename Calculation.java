
/**
 * Write a description of class Calculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculation
{
    private double x;
    private double y;
    public void runMethods(){
        System.out.println("outputs of getX---->"+getX());
        System.out.println("outputs of getY---->"+getY());
        System.out.println("outputs of noHoursInAWeek---->"+noHoursInAWeek());
        System.out.println("outputs of noSecondsInAYear---->"+noSecondsInAYear());
        System.out.println("outputs of getAvg---->"+getAvg());
        System.out.println("outputs of getMax---->"+getMax());
        System.out.println("before swap---->"+getY()+","+getX());
        swap();
        System.out.println("after swap---->"+getY()+","+getX());
        setTemp();
        System.out.println("after set Temp---->"+getY()+","+getX());
        getRoots(1,2,1);
        System.out.println("roots---->"+getY()+","+getX());
        System.out.println("inputs for check odd---->5");
        System.out.println(checkOdd(5));
        System.out.println("input for returnDate--->01022002");
        System.out.println("output--->"+returnDate("01022002"));
         System.out.println("input for getCoins--->97");
        System.out.println("output--->"+getCoins(97));
         System.out.println("input for getDay--->01022002");
        System.out.println("output--->"+getDay(01,02,2002));
    }
    public Calculation(double x,double y){
         this.x=x;
        this.y=y;
    }
    public double getX(){
        
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        System.out.println("inputs---->"+x);
        this.x=x;
    }
    public void setY(double y){
        System.out.println("inputs---->"+y);
        this.y=y;
    }
    public double noHoursInAWeek()
    {
        return 7*24;
    }
    public double noSecondsInAYear(){
        return 52*noHoursInAWeek()*60*60;
    }
    public double getAvg(){
      return (x+y)/2;
    }
    public double getMax(){
        System.out.println("outputs---->"+x+" or "+y);
        if(x>y){
            return x;
        }else{
            return y;
        }
        
    }
    public void swap(){
        double temp=x;
        x=y;
        y=temp;
    }
    public void setTemp(){
        y=x*1.8+32;
    }
    public void getRoots(int a, int b, int c){
        System.out.println("inputs of getRoots---->"+a+","+b+","+c);
        x=(-b+Math.sqrt((b^2)-4*a*c))/2*a;
        y=(-b-Math.sqrt(b^2-4*a*c))/2*a;
        System.out.println("roots= "+x+","+y);
    }
    public boolean checkOdd(int z){
        System.out.println("outputs----> true or false");
        if(z%2==1){
            return true;
        }else{
            return false;
        }
        
    }
    public String returnDate(String z){
        String dd=z.substring(0,2);
        String yyyy;
        if(z.length()>8){
           yyyy=z.substring(6,10);
        }else{
            int yy=Integer.parseInt(z.substring(6,8));
            if (yy>17){
                yyyy=19 + Integer.toString(yy);
            }else{
                yyyy=20+Integer.toString(yy);
            }
        }
        return dd+yyyy;
    }
    public int getCoins(int money){
        int minCoins=0;
        System.out.println("inputs---->"+money);
        if(money>=50){
            money=money-50;
            minCoins++;
        }
        if (money>=20){
            minCoins=minCoins+money/20;
            money=money%20;
        }
        if (money>=10){
            money=money-10;
            minCoins++;
        }
        if (money>=5){
            money=money-5;
            minCoins++;
        }
        if(money>=2){
            minCoins=minCoins+money/2;
            minCoins++;
        }
        minCoins=minCoins+money;
        
        System.out.println("outputs---->"+minCoins);
        return minCoins;
    }
    public String getDay(int day, int month, int year){
        System.out.println("inputs---->"+day+","+month+","+year);
        double days=0;
        days= (year-2000)*365.25;
        switch(month){
            case 1:break;
            case 2: days+=31;
                break;
            case 3: days+=59;
                break;
            case 4:days+=90;
                break;
            case 5:days+=120;
                break;
            case 6:days+=151;
                break;
            case 7:days+=181;
                break;
            case 8:days+=212;
                break;
            case 9:days+=243;
                break;
            case 10:days+=273;
                break;
            case 11:days+=304;
                break;
            case 12:days+=334;
                break;
        }
        days+=day;
        String dayStr=null;
        days=days%7;
        days-=2;
        int dayInt=(int) days;
        switch(dayInt){
            case 0:dayStr="Monday";
                break;
            case 1:dayStr="Tuesday";
                break;
            case 2:dayStr="Wednesday";
                break;
            case 3:dayStr="Thursday";
                break;
            case 4:dayStr="Friday";
                break;
            case 5:dayStr="Saturday";
                break;
            case 6:dayStr="Sunday";
                break;
            
        }
        System.out.println("outputs---->"+dayStr);
        return dayStr;
    }
}
