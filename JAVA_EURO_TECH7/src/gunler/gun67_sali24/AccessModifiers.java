package gunler.gun67_sali24;

public class AccessModifiers {

    private  int id;
    protected int Tcno;
    public String name;
    int okulNo;


    private void toplama(int sayiA,int sayiB){

        System.out.println("I am private method");
        System.out.println("Toplam"+(sayiA+sayiB));

    }

    void defaultMethod(){


        System.out.println("I am default method");
    }


    protected void protectedMethod(){

        System.out.println("I am a protected method");

    }

    public void publicMethod(){

        System.out.println(" i am public method");
    }

    public static void main(String[] args) {
        System.out.println("Accass modifieres in java");

        AccessModifiers accessModifiers=new AccessModifiers();

        accessModifiers.id=10;
        accessModifiers.name="EuroStudy";
        accessModifiers.okulNo=24;
        accessModifiers.Tcno=123456;
        accessModifiers.toplama(24,23);
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
        accessModifiers.publicMethod();

    }
}
