package java4.Waveside;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class MedievalGame implements Serializable {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {


    }
    public void save(){
        String filePath = "aaa.txt";
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
