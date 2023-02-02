package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 * UDP发送端
 */
public class Practice12 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String next = scanner.next();
        byte[] data = next.getBytes();

        DatagramPacket datagramPacket
                = new DatagramPacket(data,data.length, InetAddress.getByName("192.168.10.3"),8888);
        //发送
        datagramSocket.send(datagramPacket);


        //接收
        byte[]bytes = new byte[1024];
        DatagramPacket datagramPacket2 = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket2);
        //拆包
        int length = datagramPacket2.getLength();
        byte[] data2 = datagramPacket2.getData();
        String s = new String(data2, 0,length);
        System.out.println(s);



        datagramSocket.close();
    }
}
