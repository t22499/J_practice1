package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host = InetAddress.getByName("LAPTOP-J7AOPQOU");
        System.out.println(host);

        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        String hostName = host2.getHostName();
        System.out.println(hostName);


    }
}
