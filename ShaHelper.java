/*ShaHelper class
 * Uses SHA-256 to generate hash
 * for new Block object
 * Created: 5/10/2024 
*/
//!! indiciate a line I could use further understanding
import java.io.*;
import java.security.MessageDigest; //!! not thread safe


public class ShaHelper {
    /*Sha256 method
     *method that takes takes String (Block.data)
     * and encrypts it with Secure Hash Algorithm - 256
    */
    public static String Sha256(String blockData){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(blockData.getBytes("UTF-8"));
            return byteToHex(encodedHash);//calling our byteToHex method
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "INVALID BLOCK DATA";
    }//end Sha256

    /*byteToHex
     * method that converts our hashed out bytes
     * into hexadecimal
     */
    private static String byteToHex(byte[] encodedHash){
        StringBuffer hexString = new StringBuffer();
        for(int i = 0; i < encodedHash.length; i++){
            String hex = Integer.toHexString(0xff & encodedHash[i]); //!!
            if(hex.length() == 1){
                hexString.append("0");
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }//end byteToHex
}