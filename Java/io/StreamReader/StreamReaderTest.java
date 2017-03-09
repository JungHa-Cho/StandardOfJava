import java.io.*;

public class StreamReaderTest
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("Use : Java StreamReaderTest FileName");
            System.exit(0);
        }

        FileInputStream fis = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try {
            fis = new FileInputStream(args[0]);
            isr = new InputStreamReader(fis);
            osw = new OutputStreamWriter(System.out);
            char[] buffer = new char[512];
            int readCount = 0;
            while ( ( readCount = isr.read(buffer) ) != -1 )
            {
                osw.writer(buffer, 0, readCount);
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                fis.close();
                isr.close();
                osw.close();
            } catch (Exception e) {
                
            }
        }
    }
}