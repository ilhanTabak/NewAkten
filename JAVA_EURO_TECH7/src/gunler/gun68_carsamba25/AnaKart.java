package gunler.gun68_carsamba25;

public class AnaKart {


    private String model;
    private String ureticiFirma;
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public AnaKart(String model, String ureticiFirma, int ramSlot, int cardSlot, String bios) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }


    public void programYukle(String programAdi){

        System.out.println(programAdi+"eklendi");
    }


    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
