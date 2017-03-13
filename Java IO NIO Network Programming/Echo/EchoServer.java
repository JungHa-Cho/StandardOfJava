import java.net.*;
import java.io.*;

public class EchoServer{
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(10001);
            System.out.println("접속을 기다립니다....");

            Socket sock = serverSocket.accept();
            InetAddress inetAddr = sock.getInetAddress();
            System.out.println(inetAddr.getHostAddress() + " 로 부터 접속했습니다.");
            
            OutputStream out = sock.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
            
            InputStream in = sock.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String line = null;
            while((line = br.readLine()) != null){
                System.out.println("클라이언트로 부터 전송받은 문자열 : "+line);
                pw.println(line);
                pw.flush();
            }
            pw.close();
            br.close();
            sock.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}