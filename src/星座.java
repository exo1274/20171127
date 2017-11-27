public class 星座 {
    public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
        System .out.println("請輸入您的出生月:");
    int month = sc.nextInt();
        System .out.println("請輸入您的出生日:");
    int day = sc.nextInt();
    if(month ==1){
        if(day<=20 && day>=1){System .out .println("摩羯座");}
        if(day<=31 && day>=21){System .out .println("水瓶座");}
    }
        if(month ==2){
            if(day<=19 && day>=1){System .out .println("水瓶座");}
            if(day<=31 && day>=20){System .out .println("雙魚座");}
        }
        if(month ==3){
            if(day<=20 && day>=1){System .out .println("雙魚座");}
            if(day<=31 && day>=21){System .out .println("牡羊座");}
        }
        if(month ==4){
            if(day<=19 && day>=1){System .out .println("牡羊座");}
            if(day<=31 && day>=20){System .out .println("金牛座");}
        }
        if(month ==5){
            if(day<=20 && day>=1){System .out .println("金牛座");}
            if(day<=31 && day>=21){System .out .println("雙子座");}
        }
        if(month ==6){
            if(day<=21 && day>=1){System .out .println("雙子座");}
            if(day<=31 && day>=22){System .out .println("巨蟹座");}
        }
        if(month ==7){
            if(day<=22 && day>=1){System .out .println("巨蟹座");}
            if(day<=31 && day>=23){System .out .println("獅子座");}
        }
        if(month ==8){
            if(day<=22 && day>=1){System .out .println("獅子座");}
            if(day<=31 && day>=23){System .out .println("處女座");}
        }
        if(month ==9){
            if(day<=22 && day>=1){System .out .println("處女座");}
            if(day<=31 && day>=23){System .out .println("天枰座");}
        }
        if(month ==10){
            if(day<=23 && day>=1){System .out .println("摩羯座");}
            if(day<=31 && day>=24){System .out .println("天蠍座");}
        }
        if(month ==11){
            if(day<=21 && day>=1){System .out .println("天蠍座");}
            if(day<=31 && day>=22){System .out .println("射手座");}
        }
        if(month ==12){
            if(day<=20 && day>=1){System .out .println("射手座");}
            if(day<=31 && day>=21){System .out .println("摩羯座");}
        }


}
}
