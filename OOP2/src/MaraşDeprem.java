public class MaraşDeprem extends AfetBölgeleri{

    private String yardim;

    public MaraşDeprem(String yardim,int yikilanBinaSayisi,String name ,int agirHasarliBinaSayisi,int azHasarliBinaSayisi){
        super(yikilanBinaSayisi,name,agirHasarliBinaSayisi,azHasarliBinaSayisi);
        this.yardim = yardim;


    }

    public String getYardim(){
        return yardim;
    }
    public void setYardim(){
        this.yardim = yardim;
    }
    public void soyle(double şiddet){
        System.out.println(this.getName() + " bölgesinde" + şiddet +  "şiddetinde asrın felaketi denilen deprem meydana  gelmiştir.");
    }
    public void yardim(int tır){
        System.out.println("Maraş merkez üssü " + this.getAgirHasarliBinaSayisi() + " ağır hasarlı binaya sahip deprem bölgesine " + tır + " tır yardım gitmiştir.") ;

    }
}
