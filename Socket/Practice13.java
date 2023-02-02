package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice13 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s1 = br.readLine();
        String s2 = "";
        /*while ((s = br.readLine()) != null){
            System.out.println(s);
        }*/
        if ("name".equals(s1)){
            s2 = "我是韩顺平";
        }else if ("hobby".equals(s1)){
            s2 = "编写java程序";
        }else {
            s2 = "你说的啥子";
        }

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(os));
        bw.write(s2);
        bw.newLine();
        bw.flush();

        br.close();
        socket.close();
        serverSocket.close();


    }
}
