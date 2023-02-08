package gunler.gun78_carsamba08;

import java.util.ArrayList;

public class Invoice {


    private String number;
    private String describtion;
    private int purchased;
    private double price;
    ArrayList<Invoice[]> artikels=new ArrayList<Invoice[]>();


    public Invoice(String number, String describtion, int purchased, int price) {
        this.number = number;
        this.describtion = describtion;
        this.purchased = purchased;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public int getPurchased() {
        return purchased;
    }

    public void setPurchased(int purchased) {
        this.purchased = purchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double invoiceMethod(double price, int purchased){

        this.price=price;
        this.purchased=purchased;

        return price*purchased;


    }

    public void addArtikel(Invoice... invoices){



            for(Invoice[] invoice1:artikels){

                this.artikels.add(invoices);




            }


    }

    public void printArtikel(){

        for(Invoice[] invoice:artikels){

            System.out.println(artikels.toString());

        }
    }






    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + '\'' +
                ", describtion='" + describtion + '\'' +
                ", purchased=" + purchased +
                ", price=" + price +
                '}';
    }
}
