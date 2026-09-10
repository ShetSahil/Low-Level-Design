package Structural_Patterns.CompositePattern;
import java.util.*;

public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> folders = new ArrayList<FileSystem>();
    
    public Folder(String name){
        this.name=name;
    }

    public void addFileSystem(FileSystem fileSystem){
        folders.add(fileSystem);
    }
    public void remove(FileSystem fileSystem){
        folders.remove(fileSystem);
    }


    public void display(){
        System.out.println("Folder:" + name);
        for(FileSystem fileSystem : folders){
            fileSystem.display();
        }
    }


}
