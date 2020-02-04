import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Testador {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String originalInput = "test input";
        //String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        System.out.println(originalInput);
        //System.out.println(encodedString);

        //byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String encodedString = Base64.getEncoder().encodeToString("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c".getBytes());
        byte[] decodedBytes = encodedString.getBytes();
        String decodedString = new String(decodedBytes);

        System.out.println(decodedString);
    }
}
