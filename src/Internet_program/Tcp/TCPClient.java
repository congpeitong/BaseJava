package Internet_program.Tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*

 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好服务器".getBytes());
        socket.close();


    }
}
