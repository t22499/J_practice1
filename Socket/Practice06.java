package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String readLine = br.readLine();
        System.out.println(readLine);

        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,client,字符流");
        bw.newLine();//换行表示回复内容的结束
        bw.flush();


        bw.close();
        br.close();
        accept.close();
        serverSocket.close();



    }

}
