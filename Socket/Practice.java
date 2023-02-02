package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
