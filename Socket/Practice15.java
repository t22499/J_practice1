package Socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 * 服务器
 */
public class Practice15 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9100);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
//        System.out.println(s);
        String filePath = "高山流水.mp3";
        String filePath2 = "无名.mp3";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream(filePath2));

        byte[] bytes = StreamUtils.streamToByteArray(bis);
        byte[] bytes2 = StreamUtils.streamToByteArray(bis2);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());


        if ("高山流水".equals(s)){
            bos.write(bytes);
        } else  {
            bos.write(bytes2);
        }
        socket.shutdownOutput();
        bos.flush();

        //释放
        bos.close();
        bis.close();
        bis2.close();



    }
}
