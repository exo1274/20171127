public class 排列 {
    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
        int i,max,min,num;
                max=-2147483648;
                min=2147483647;
                for(i=1;i<=10;i++){num=sc.nextInt();
                if(num>max){max=num;}
                if(num<min){min=num;}
                }
        System.out.println(max+"是最大的數") ;
        System.out.println(min+"是最小的數") ;
}
}
