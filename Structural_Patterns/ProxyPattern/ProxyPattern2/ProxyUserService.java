package Structural_Patterns.ProxyPattern.ProxyPattern2;

import java.util.*;
public class ProxyUserService implements UserService {
    private RealUserService realUserService;
    HashMap<Integer,RealUserService> cache;
    public ProxyUserService(RealUserService realUserService){
        this.realUserService = realUserService;
        cache = new HashMap<Integer,RealUserService>();
    }
    



    public String getUserByID(int id){
        if(cache.containsKey(id)){
            return "Retrieving User data from Cache.." + "User ID: "+id+" User Name: "+cache.get(id).name;
        }
        else{
            String user = realUserService.getUserByID(id);
            cache.put(id, realUserService);
            return user;
        }
    }
}
