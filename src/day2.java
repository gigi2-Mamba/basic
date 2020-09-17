import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
      //获取一个四位的年
        int year =getYear();
        System.out.println("显示日历的年份是："+year);
        //打印一年的日历
        printCalendar(year);
    }

    /**
     * 打印该年
     * @param year
     */
    private static void printCalendar(int year) {
        for (int month = 1; month <=12 ; month++) {
            System.out.println("当前是几月： "+month+"月");
            System.out.println("一\t二\t三\t四\t五\t六\t日");
            PrintMonthofDay(year,month);
            System.out.println();
        }
    }

    private static void PrintMonthofDay(int year, int month) {
        int weekday = getWeekDay(year, month);
        for (int day = 1; day <=getMonthDays(year,month) ; day++) {

            //每次打印1号好需要先打印空格
           if(day ==1){
               for (int t = 1; t <=weekday ; t++) {
                   System.out.print("\t");

               }
           }
            System.out.print(day+"\t");
            if((day + weekday) %7==0){
                System.out.println();
            }
        }
    }

    /**
     *
     * @param year
     * @param month
     * @return给定月份具体天数
     */
    private static int getMonthDays(int year, int month) {
        int days = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;

        } else if (month == 2) {
            return isLeaf(year) ? 29:28;

        }
     return days;
    }

    private static boolean isLeaf(int year) {
        if( year % 4==0 &&year%100!=0){
            return  true;
        }else if(year % 400==0){
            return  true;
        }
        return false;
    }

    /**
     * 计算每个月的一号是周几
     * @param year
     * @param month
     * @return
     */
    private static  int getWeekDay(int year, int month) {
        int weekDay=0;
           int totals=0;
        for (int y = 1900; y <year ; y++) {
            totals = totals+(isLeaf(y)? 366:365);
        }
        //月的总天数
        for (int m = 1; m <month ; m++) {
            totals=totals+getMonthDays(year,m);

        }
        return totals % 7;
}
    private static int getYear() {
       int year =1900;
       boolean flag =true;
       do{
           try {
               System.out.println("输入一个年份");
               //需要键盘输入
               Scanner input = new Scanner(System.in);
               year = input.nextInt();
               //如何判断是一个四位的数字
               if(year<=1900 || year >=9999){
                   //不符合程序需求的数据
                   System.out.println("输入不符合要求");
                   continue;
               }
               //输入正确跳出循环
               flag=false;
               //break

           } catch (Exception e) {
               e.printStackTrace();
               System.out.println("输入格式错误，请输入四位的数字年份");
           }
       }while (flag);
            return year;
        }
    }





