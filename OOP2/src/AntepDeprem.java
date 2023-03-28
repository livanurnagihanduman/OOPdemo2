public class AntepDeprem extends AfetBölgeleri{
    private int su;
    public AntepDeprem(int yikilanBinaSayisi, String name, int agirHasarliBinaSayisi, int azHasarliBinaSayisi,int su) {
        super(yikilanBinaSayisi, name, agirHasarliBinaSayisi, azHasarliBinaSayisi);
        this.su = su;
    }

    public int getSu() {
        return su;
    }

    public void setSu(int su) {
        this.su = su;
    }
    public void su(int su){
        System.out.println(this.getName() + " bölgesine " + su + " tane su yardımı bulunmuştur.");
    }
}
