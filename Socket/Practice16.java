package Socket;



import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 * 客户端
 */
public class Practice16 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),9100);
        //输入音乐
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(outputStream));
        System.out.println("请输入音乐名字");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        bw.write(next);
        bw.newLine();//会话结束
        bw.flush();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String filePath = "接收到的一首歌.mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        socket.shutdownOutput();
        bos.flush();

        bis.close();
        bos.close();
        socket.close();
        bw.close();

    }
}
