package Structural_Patterns.CompositePattern;

public class Main {
    public static void main(String[] args){
        Folder mainFolder = new Folder("MainFolder");
        Folder imageFolder = new Folder("ImageFolder");
        Folder documentFolder = new Folder("DocumentFolder");

        File image1 = new File("Image1");
        File certificate = new File("Certificate");

        documentFolder.addFileSystem(certificate);
        imageFolder.addFileSystem(image1);

        mainFolder.addFileSystem(imageFolder);
        mainFolder.addFileSystem(documentFolder);

        mainFolder.display();
    }
}
