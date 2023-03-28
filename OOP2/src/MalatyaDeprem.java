public class MalatyaDeprem extends AfetBölgeleri{
    private int battaniye;
    public MalatyaDeprem(int yikilanBinaSayisi, String name, int agirHasarliBinaSayisi, int azHasarliBinaSayisi,int battaniye) {
        super(yikilanBinaSayisi, name, agirHasarliBinaSayisi, azHasarliBinaSayisi);
        this.battaniye = battaniye;
    }

    public int getBattaniye() {
        return battaniye;
    }

    public void setBattaniye(int battaniye) {
        this.battaniye = battaniye;
    }
    public void bat(int battaniye){
        System.out.println("Malatya da " + this.getYikilanBinaSayisi() + " 'e yakın bina  yıkılan bölgeye " + battaniye + " battaniye yardım gitmiştir." );
    }
}
