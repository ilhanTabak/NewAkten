package gunler.gun16_pazartesi7;

public class if_statement_odev {
    public static void main(String[] args) {




        int a=3;
        int b=4;
        int c=5;
        int d=6;

        int enBuyuk=0;

        if (a>b&&a>c&&a>d) {

            enBuyuk=a;

        }else if(b>a&&b>c&&b>d) {

            enBuyuk = b;

        }  else if(c>a&&c>b&&c>d) {

            enBuyuk = c;

        }else{

            enBuyuk=d;

        }

        System.out.println(enBuyuk);
    }















}
