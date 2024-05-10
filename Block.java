/*Block Class for Block-Chain-Demo
 * Created using previous hash (refHash) 
 * to generate new hash
 * Created: 5/10/2024
 */
import java.util.Date;

public class Block {
    public String hash;
    public String refHash; //reference-hash
    private long timeStamp;
    private String data;
    
    //Block Constructor
    public Block(String data, String refHash){
        this.data = data;
        this.refHash = refHash;
        this.timeStamp = new Date().getTime();
        this.hash = newHash();
    }//end Block Constructor

    /*newHash method
    * newHash generated from all data we don't want changed/tampered with
    */
    public String newHash(){
        String newHash = refHash + Long.toString(timeStamp) + data;//split this line and below apart, 
        newHash = ShaHelper.Sha256(newHash);
        return newHash;
    }//end newHash
}