package Structural_Patterns.FacadePattern;

public class Facade {
    private TV tv;
    private HomeTheatre homeTheatre;
    private Ott ott;
    public Facade(TV tv , HomeTheatre homeTheatre , Ott ott){
        this.tv=tv;
        this.homeTheatre = homeTheatre;
        this.ott=ott;
    }

    public void startWatchingMovie(){
        tv.onTv();
        homeTheatre.theatre();
        ott.netlix();
    }
}
