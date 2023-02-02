package Socket;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;


/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice09 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);

        //创建读取磁盘文件的输入流
        String filePath = "aaa.txt";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流，将byets数据发送给服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();

        socket.shutdownOutput();

        bos.close();
        socket.close();



    }
}
