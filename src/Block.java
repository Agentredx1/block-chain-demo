package src;
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
    private int nonce; //I wanted to name this "attempts",
    //but it only represents a single node/miner,
    //and they could start with whatever nonce they wanted.
    
    //Block Constructor
    public Block(String data, String refHash){
        this.data = data;
        this.refHash = refHash;
        this.timeStamp = new Date().getTime();
        this.hash = newHash();
    }//end Block Constructor

    /*newHash()
    * newHash generated from all data we don't want changed/tampered with
    * returns hash generated from data
    */
    public String newHash(){
        //Adding block variables + data, applying SHA-256
        String newHash = refHash + Long.toString(timeStamp) + Integer.toString(nonce) + data;
        newHash = ShaHelper.Sha256(newHash);
        return newHash;
    }//end newHash

    /* mine()
     * makes new hashes till one has same number of leading 0's as difficulty.
     */
    public void mine(int difficulty){
        String target = new String(new char[difficulty]).replace("\0","0");
        while(!hash.substring(0, difficulty).equals(target)){
            nonce ++;
            hash = newHash();
        }
        System.out.println("BLOCK COMPLETE");
    }
}