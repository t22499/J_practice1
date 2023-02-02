package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) throws IOException {
        //监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        //当没有客户端连接的时候会阻塞，等待连接，如果有客户端连接程序继续执行
        Socket socket = serverSocket.accept();

        System.out.println(socket.getClass());
        //读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();

        //io读取
        byte[]bytes = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,readLen));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();




    }
}
