import java.io.*;

public class FileInputStream {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("use :java fileview file name");
            System.exit(0);
        }

        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(args[0]);
            int i = 0;
            while((i = fis.read()) != -1)
            {
                System.out.write(i);
            }
        }
        catch(Exception ex)
        {
                System.out.println(ex);
        }
        finally
        {
                try
                {
                    fis.close();
                }catch(IOException e)
                {

                }
        }
    }
}