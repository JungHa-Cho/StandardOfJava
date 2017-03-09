import java.net.*;

public class NSLookup
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("IP address or Host name is input args");
            System.exit(0);
        }

        InetAddress inetaddr[] = null;
        
        try{
            inetaddr = InetAddress.getAllByName(args[0]);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        for(int i = 0 ; i < inetaddr.length ; i ++)
        {
            System.out.println(inetaddr[i].getHostName());
            System.out.println(inetaddr[i].getHostAddress());
            System.out.println(inetaddr[i].toString());
            System.out.println("--------------------------");
        }
    }
}