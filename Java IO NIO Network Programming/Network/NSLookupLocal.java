import java.net.*;

public class NSLookupLocal
{
    public static void main(String[] args)
    {
        InetAddress inetaddr = null;
        try{
            inetaddr = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            e.printStackTrace();
        } 

        System.out.println(inetaddr.getHostName());
        System.out.println(inetaddr.getHostAddress());

        System.out.println("byte[] ip print");
        byte[] ip = inetaddr.getAddress();
        for(int i = 0; i < ip.length; i++)
        {
            System.out.print((int)ip[i]);
            if(i != ip.length -1)
                System.out.print(".");
        }
    }
}