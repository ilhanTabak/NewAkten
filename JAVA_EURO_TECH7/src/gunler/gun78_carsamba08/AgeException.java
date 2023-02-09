package gunler.gun78_carsamba08;

public class AgeException extends Exception{
//Checked exception
        //Checked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorundadır.
        AgeException(String mesaj){
            super(mesaj);
        }
    }