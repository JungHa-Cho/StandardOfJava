import java.io.*;

public class BufferedFileCopy
{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.out.println("Use : Java FileCopy FileName1, FileName2");
            System.exit(0);
        }

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            fr = new FileReader(args[0]);
            br = new BufferedReader(fr);
            fw = new FileWirter(args[1]);
            bw = new BufferedWriter(fw);

            char[] buffer = new char[512];
            int readCount = 0;
            while( ( readCount = br.read(buffer) ) != -1 )
            {
                bw.write(buffer, 0, readCount);
            }
            System.out.println("File Copy Complete...");
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                br.close();
                bw.close();
            } catch (Exception e) { }
        }
    }
}