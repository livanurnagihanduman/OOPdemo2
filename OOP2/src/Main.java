public class Main {
    public static void main(String[] args) {

        AfetBölgeleri a = new AfetBölgeleri(1000,"K.Maraş Deprem " , 3000,5000);
        a.soyle();

        MaraşDeprem b = new MaraşDeprem("500",1000,"K.Maraş Deprem ",2000,3000);
        b.soyle(7.7);
        b.yardim(500);

        HatayDeprem c = new HatayDeprem(2000,"Hatay Deprem " , 3000,5000,10000);
        c.cadir(10000);
        c.inp(3000);
        c.soyle();

        AntepDeprem d = new AntepDeprem(500,"Antep Deprem ",900,1500,500000);
        d.su(500000);
        d.soyle();

        MalatyaDeprem e = new MalatyaDeprem(1500,"Malatya Deprem ", 5000,3500,300000);
        e.bat(300000);
        e.soyle();

        UrfaAfet f = new UrfaAfet(850,"Urfa Sel ",550,755,13);
        f.sel(13);
        f.soyle();
    }
}