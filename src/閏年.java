public class 閏年 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入年份:");
        int year = sc.nextInt();
        if (year%400==0||((year%4==0)&&(year%100!=0)))
        {
            System .out .println(year+"是閏年");
}
else
    {System .out .println(year+"非閏年");}
    }
}