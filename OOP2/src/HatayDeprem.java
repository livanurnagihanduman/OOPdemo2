public class HatayDeprem extends AfetBölgeleri{
    private int cadirSayisi;
    public HatayDeprem(int yikilanBinaSayisi, String name, int agirHasarliBinaSayisi, int azHasarliBinaSayisi,int cadirSayisi) {
        super(yikilanBinaSayisi, name, agirHasarliBinaSayisi, azHasarliBinaSayisi);
        this.cadirSayisi = cadirSayisi;
    }
    public int getCadirSayisi(){
        return cadirSayisi;
    }
    public void setCadirSayisi(){
        this.cadirSayisi = cadirSayisi;
    }
    public void inp(int bina){
        System.out.println(this.getName() + " bölgesinde " + bina + " bina ağır hasarlı olarak tespit edilmiştir.");
    }
    public void cadir(int cad){
        System.out.println(this.getName() + " bölgesine " + cad + " çadır yardım gitmiştir." );
    }
}
