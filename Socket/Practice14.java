package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice14 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9000);
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(os));
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String next = scanner.next();

        bw.write(next);
        bw.newLine();
        bw.flush();




        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = "";
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();
        bw.close();
        socket.close();

    }
}
