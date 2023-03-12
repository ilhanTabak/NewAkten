package gunler.gun53_persembe05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fatura {
    static int id=1000;
    static int faturaNo;
    static  String firmaAdi;
    static String FirmaAdresi;
    static String firmaTelNo;

    Date faturaTarihi;
    Sepet sepet;

    static {

        firmaAdi="ABC market Ticaret Sirketi";
        FirmaAdresi="ABC Plaza";
        firmaTelNo="901254785655";


    }

    public Fatura(Date faturaTarihi,Sepet sepet){


        this.faturaTarihi=faturaTarihi;
        this.sepet=sepet;
        id++;
        faturaNo=id;

    }

    public String toString(){

        SimpleDateFormat tarihFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");

        String str=firmaAdi+"\n";
        str+=FirmaAdresi+"\n";
        str +="             "+firmaTelNo+"\n\n";
        str+="Fatura no:"+faturaNo+"      Tarih\saat:"+tarihFormat.format(faturaTarihi)+"\n";
        str+="-------------------------------------------------------------------";
        str+=sepet;
        return str;


    }
}
