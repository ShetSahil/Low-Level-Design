package Structural_Patterns.ProxyPattern.ProxyPattern2;

public class RealUserService implements UserService {
    public String name;
    public int id;
    
    public RealUserService(int id , String name){
        this.id=id;
        this.name=name;
    }

    public String getUserByID(int nid){
        if(id==nid){
            // System.out.println("Retrieving User data from Database.."+ "User ID: "+id+" User Name: "+name);
            return "Retrieving User data from Database.." + "User ID: "+id+" User Name: "+name;
        }
        return "User not found";
    }
}
