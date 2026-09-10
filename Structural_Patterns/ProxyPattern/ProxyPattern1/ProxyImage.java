package Structural_Patterns.ProxyPattern.ProxyPattern1;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String proxyName;
    public ProxyImage(String proxyName){
        this.proxyName=proxyName;
    }
    public void display(){
        if(realImage==null){
            realImage= new RealImage(proxyName);
            realImage.display();
        }
        else{
            loadImage();
            System.out.println("Displaying  Imagge  from cache"+proxyName);
        }
        
    }
    public void loadImage(){
        System.out.println("Loading Image from cache");
    }
}
