package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));
        bw.write("hello,server字符流");
        bw.newLine();//插入一个换行，表示写入的内容结束，注意，要求对方使用readLine()!!!
        bw.flush();//如果使用字符流


        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);

        bw.close();
        br.close();
        socket.close();
    }
}
