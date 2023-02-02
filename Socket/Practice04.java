package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        int read = 0;
        byte[] bytes =  new byte[1024];

        while ((read = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,client".getBytes());
        accept.shutdownOutput();
        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();



    }

}
