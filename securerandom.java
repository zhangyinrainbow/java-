import java.util.Arrays;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
public class securerandom{
	public static void main(String[] args){
	SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); 
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); 
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); 
        System.out.println(Arrays.toString(buffer));	
		
	}
}