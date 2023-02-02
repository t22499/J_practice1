package Socket;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice08 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
            //socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String filePath = "bbb.txt";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bis.close();
        bos.write(bytes);
        socket.shutdownOutput();//写入数据结束的标记
        bos.close();
        socket.close();
        serverSocket.close();


    }
}
