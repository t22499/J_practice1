package Socket;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * @avthor 刘添
 * @varsion 1.0
 * UDP接收端
 */
public class Practice11 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[]bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        //当有数据包发送到9999端口时，就会接收如果没有就会阻塞
        System.out.println("在等待");
        datagramSocket.receive(datagramPacket);//接收
        //拆包
        int length = datagramPacket.getLength();//接收到实际的长度
        byte[] data = datagramPacket.getData();//接收到的数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //判断收到信息是什么
        String str = "";
        if("四大名著有哪些".equals(s)){
            str = "四大名著： 西游记，水浒传，红楼梦，三国演义";

        }else {
            str = "what?";
        }

        //发送
        byte[] bytes2 = str.getBytes();
        DatagramPacket datagramPacket2 =
                new DatagramPacket(bytes2,bytes2.length, InetAddress.getByName("192.168.10.3"),9998);
        datagramSocket.send(datagramPacket2);




        //释放资源
        datagramSocket.close();


    }
}
