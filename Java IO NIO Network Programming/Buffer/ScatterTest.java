import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;

public class ScatterTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("C:/news.txt");
        ScatteringByteChannel channel = fin.getChannel();

        ByteBuffer header = ByteBuffer.allocate(100);
        ByteBuffer body = ByteBuffer.allocate(200);
        ByteBuffer[] buffers = { header, body };

        int readCount = (int) channel.read(buffers);
        channel.close();
        System.out.println("Read Count : " + readCount);
        System.out.println("\n//-----------------------------//\n");

        header.flip();
        body.flip();
        
        byte[] b = new byte[100];

        heade.get(b);
        System.out.println("Header : " + new String(b));

        System.out.println("\n//------------------------------//\n");

        byte[] bb = new byte[200];
        body.get(bb);
        System.out.println("Body : " + new String(bb));
    }
}