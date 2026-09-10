package Structural_Patterns.ProxyPattern.ProxyPattern2;

public class Client {
    public static void main(String[] args) {
        RealUserService realUserService = new RealUserService(1, "Sahil Shetty");
        UserService userService = new ProxyUserService(realUserService);
        System.out.println(userService.getUserByID(1));
        System.out.println(userService.getUserByID(2));
        System.out.println(userService.getUserByID(1));
    }
}
