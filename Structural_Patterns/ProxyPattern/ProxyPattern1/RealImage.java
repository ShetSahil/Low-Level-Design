package Structural_Patterns.ProxyPattern.ProxyPattern1;

public class RealImage implements Image{
    private String imageName;
    
    public RealImage(String imageName){
        this.imageName= imageName;
        loadImage();
    }

    public void loadImage(){
        System.out.println("Loading Real Image");
    }

    public void display(){
        System.out.println("Displaying Real Image :"+imageName);
    }
}
