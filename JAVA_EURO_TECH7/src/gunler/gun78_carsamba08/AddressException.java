package gunler.gun78_carsamba08;



public class AddressException extends RuntimeException{//Unchecked exception
    //UnChecked exception olduğundan bu exception ı throw eden metodları çağıranlar handling mekanızması kurmak zorunda değildir.
    AddressException(String mesaj){
        super(mesaj);
    }
}