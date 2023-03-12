package gunler.gun59_cuma13;

public class Rectangle {

    private int lenght;
    private int breit;

    public Rectangle(int lenght, int breit) {
        this.lenght = lenght;
        this.breit = breit;
    }


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBreit() {
        return breit;
    }

    public void setBreit(int breit) {
        this.breit = breit;
    }


    public int alan(int lenght,int bereit){

        return lenght*bereit;



    }
}
