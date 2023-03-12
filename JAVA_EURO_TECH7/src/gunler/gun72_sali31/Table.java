package gunler.gun72_sali31;

public class Table {


    private int number;
    private int seats;


    public int getNumber() {
        return number;
    }

    public Table(int number, int seats) {
        this.number = number;
        this.seats = seats;




    }


    public void reserve(int guest){

        if(guest<=seats){


            System.out.println("Table number"+number+"reservd for "+guest+"guests");
        }else{


            System.out.println("Table number"+number+"can only seat"+seats+"guests");


        }





    }



}
