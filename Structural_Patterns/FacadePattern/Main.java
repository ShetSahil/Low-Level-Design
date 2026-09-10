package Structural_Patterns.FacadePattern;

public class Main {
    public static void main(String[] args){
        TV tv = new TV();
        HomeTheatre homeTheatre = new HomeTheatre();
        Ott ott = new Ott();
        Facade facade = new Facade(tv, homeTheatre, ott);
        facade.startWatchingMovie();
    }
}
