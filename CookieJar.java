
public class CookieJar
{
   private String type;
   private int maxCap;
   private int currentCookies;
   private String status;
   
   public CookieJar(String theType, int theMax)
   {
       type = theType;
       maxCap = theMax;
       currentCookies = 0;
       status = "closed";
   }
   
   public void dispenseCookies(int dispensed)
   {
       if (dispensed <= currentCookies)
       {
           currentCookies = currentCookies - dispensed;
       }
       else
       {
           currentCookies = 0;
       }
   }
   
   public void addCookies(int added)
   {
       if (added <= maxCap - currentCookies)
       {
           currentCookies = currentCookies + added;
       }
       else
       {
           currentCookies = maxCap;
       }
   }
   
   public void fillJar()
   {
       currentCookies = maxCap;
   }
   
   public void openJar()
   {
       status = "open";
   }
   
   public void closeJar()
   {
       status = "closed";
   }
   
   public String findType()
   {
       return type;
   }
   
   public int findMax()
   {
       return maxCap;
   }
   
   public int findCurrent()
   {
       return currentCookies;
   }
   
   public String findstatus()
   {
       return status;
   }
   
   public void printinfo()
   {
       System.out.println("---Cookie Jar Info---");
       System.out.println("Type of cookie: "+ type+ " cookies");
       System.out.println("Maximum capacity: "+ maxCap+ " cookies");
       System.out.println("Current amount: "+ currentCookies+ " cookies");
       System.out.println("Status: "+ status);
   }
}
