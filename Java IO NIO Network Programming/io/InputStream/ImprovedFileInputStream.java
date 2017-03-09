import java.io.*;

public class ImprovedFileInputStream 
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("Use : Java File Name");
            System.exit(0);
        }

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(args[0]);
            int readCount = 0;
            byte[] buffer = new byte[512];
            while( ( readCount = fis.read(buffer) ) != -1)
            {
                System.out.write(buffer, 0, readCount);
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch(IOException e){}
        }
    }
}