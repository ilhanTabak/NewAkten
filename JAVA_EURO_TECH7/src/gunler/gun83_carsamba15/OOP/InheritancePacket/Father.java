package gunler.gun83_carsamba15.OOP.InheritancePacket;

public class Father extends GrandFather{

    int gewicht;
    int tall;




    public Father(int gewicht,int tall,String name,int age){
        super(name,age);
        this.gewicht=gewicht;
        this.tall=tall;
    }

    public void altRechner(){

        super.istAgeGross(45);



    }

}
