package Socket;

import com.sun.jmx.snmp.InetAddressAcl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        int read = 0;
        byte[]bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));
        }
        inputStream.close();
        socket.close();
        outputStream.close();
    }
}
