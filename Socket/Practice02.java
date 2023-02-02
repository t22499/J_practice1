package Socket;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) throws IOException {
        //连接服务器(ip,端口号)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println(socket.getClass());
        //得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //通过输出流写入数据
        outputStream.write("hello".getBytes());

        //关闭流对象和socket
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");


    }
}
