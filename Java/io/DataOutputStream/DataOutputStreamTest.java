public class DataOutputStreamTest
{
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try
        {
            fos = new FileOutputStream("data.bin");
            dos = new DataOutputStream(fos);
            dos.writeBoolean(true);
            dos.wirteByte((byte)5);
            dos.wirteInt(100);
            dos.wirteDouble(200.5);
            dos.wirteUTF("Hello World");
            System.out.println("Saved");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            try
            {
                fos.close();
            }catch(IOException e){}
            try
            {
                dos.close();
            }catch(IOException e){}
        }
    }
}