
public class JarTester
{
    public static void main(String[] args)
    {
        CookieJar one = new CookieJar("Chocolate Chip",12);
    
        one.printinfo();
        one.addCookies(10);
        one.openJar();
        System.out.println("");
        one.printinfo();
    }
}
