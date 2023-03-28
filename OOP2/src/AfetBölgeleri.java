public class AfetBölgeleri {
    private int yikilanBinaSayisi;
    private String name;
    private int agirHasarliBinaSayisi;
    private int azHasarliBinaSayisi;

    public AfetBölgeleri(int yikilanBinaSayisi, String name, int agirHasarliBinaSayisi, int azHasarliBinaSayisi) {
        this.agirHasarliBinaSayisi = agirHasarliBinaSayisi;
        this.yikilanBinaSayisi = yikilanBinaSayisi;
        this.azHasarliBinaSayisi = azHasarliBinaSayisi;
        this.name = name;
    }

    public int getYikilanBinaSayisi() {
        return yikilanBinaSayisi;
    }

    public void setYikilanBinaSayisi() {
        this.yikilanBinaSayisi = yikilanBinaSayisi;
    }

    public int getAgirHasarliBinaSayisi() {
        return agirHasarliBinaSayisi;
    }

    public void setAgirHasarliBinaSayisi() {
        this.agirHasarliBinaSayisi = agirHasarliBinaSayisi;
    }

    public int getAzHasarliBinaSayisi() {
        return azHasarliBinaSayisi;
    }

    public void setAzHasarliBinaSayisi() {
        this.azHasarliBinaSayisi = azHasarliBinaSayisi;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void soyle() {
        System.out.println(this.name + " bölgesinde " + " yüzyılın  depremi meydana gelmiştir.Hasar çok fazla olup ölü sayısı çoktur.Geçmiş olsun Türkiyem.");

    }

    public void inp() {
        System.out.println(this.name + " bölgesinde ağır hasarlı binalar mevcuttur.");

    }
}
