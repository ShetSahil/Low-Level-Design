package Behavioral_Patterns.IteratorPattern;

public class Collection {
    public String[] name = {"Sahil","Karan","Lavu","Sairaj"};

    public MyIterator getIterator(){
        return new NameIterator();
    }

    public class NameIterator implements MyIterator{
        int index=0;
        
        public boolean hasNext(){
            return index<name.length;
        }
        public String next(){
            return name[index++];
        }
    }
}
