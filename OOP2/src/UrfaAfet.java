public class UrfaAfet extends AfetBölgeleri{
    private int selCanKaybi;
    public UrfaAfet(int yikilanBinaSayisi, String name, int agirHasarliBinaSayisi, int azHasarliBinaSayisi, int selCanKaybi) {
        super(yikilanBinaSayisi, name, agirHasarliBinaSayisi, azHasarliBinaSayisi);
        this.selCanKaybi = selCanKaybi;
    }

    public int getSelCanKaybi() {
        return selCanKaybi;
    }

    public void setSelCanKaybi(int selCanKaybi) {
        this.selCanKaybi = selCanKaybi;
    }
    public void sel(int canKaybi){
        System.out.println("Urfa'da asrın felaketi sonrası görülen selde " + canKaybi + " kişi hayatını kaybetmiştir.");
    }
}
