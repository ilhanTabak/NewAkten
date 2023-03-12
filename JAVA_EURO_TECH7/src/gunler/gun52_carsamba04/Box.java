package gunler.gun52_carsamba04;

public class Box {

    int width;
    int length;

    Box() {

        System.out.println("Defoult constracter called");

    }


    Box(int width, int length) {

        this.width = width;
        this.length = length;


    }

    Box(Box box){


        this.width=box.width;
        this.length=box.length;


    }

    public int areaCalculate() {

        return this.width * this.length;


    }

    public void showInfo() {


        System.out.println("kutunun en degeri=" + this.width);
        System.out.println("kutunun boy degeri=" + this.length);
        System.out.println("kutunun alani=" + areaCalculate());


    }


    public String strShowInfo() {


        String str = "";

        str += "kutunun en degeri=" + this.width;
        str += "kutunun boy degeri=" + this.length;
        str += "kutunun alani=" + areaCalculate();


        return str;


    }

    public String toString() {


        String str = "";

        str += "kutunun en degeri=" + this.width;
        str += "kutunun boy degeri=" + this.length;
        str += "kutunun alani=" + areaCalculate();


        return str;


    }


    public boolean esitMi(Box box){

        if(this.width==box.width&&this.length==box.length){

            return true;



        }else{

            return false;
        }


    }


}

