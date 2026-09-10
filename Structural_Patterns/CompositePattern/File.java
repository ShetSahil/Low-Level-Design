package Structural_Patterns.CompositePattern;

public class File implements FileSystem {
    private String name;
    public File(String name){
        this.name=name;
    }

    public void display(){
        System.out.println("File :"+ name);
    }
}
