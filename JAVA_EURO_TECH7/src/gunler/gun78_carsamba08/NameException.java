package gunler.gun78_carsamba08;




    public class NameException extends Exception{//Checked exception
        //Checked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorundadır.
        NameException(String mesaj){
            super(mesaj);
        }
    }

