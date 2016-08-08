package encrypt_system;

import org.apache.commons.codec.digest.Crypt;

public class EncryptTest {
    public static void main(String[] args) {

        System.out.println(Crypt.crypt(args[0]));
    }
}
