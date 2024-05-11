package src;
import java.util.ArrayList;
import com.google.gson.*;
/*Chain class for Block-Chain-Demo
 * Creates instances of Block class!
 * Created: 5/10/2024
 * */

public class Chain {

    public static ArrayList<Block> blockChain = new ArrayList<Block>();
    public static int difficulty = 6; // would translate to hashrate, or even energy required for new block
    /* Validate Chain
     * Checks chain is valid by comparing Block's to self and previous Blocks
     * Returns Boolean, true if chain is valid
     * 
     */
    public static Boolean validateChain(){
        Block currentBlock;
        Block previousBlock;

        /* Placing these before loop would reduce cacheing? I think?
         * int i = 1;
         * currentBlock = blockChain.get(i);
         */
        for(int i=1; i < blockChain.size(); i++){
            currentBlock = blockChain.get(i);
            previousBlock = blockChain.get(i-1);
            /*comparing current hash to expected current hash from newHash()
             * recall newHash uses previous hash and data to generate hash for current block*/
            if(!currentBlock.hash.equals(currentBlock.newHash())){
                System.out.println("INCORRECT HASH");
                return false;
            }
            /*comparing previous block's hash to current blocks reference*/
            if(!previousBlock.hash.equals(currentBlock.refHash)){
                System.out.println("INCORRECT REFERENCE HASH");
                return false;
            }
        }
        return true;
    }//end validateChain
    public static void main(String[] args){
        blockChain.add(new Block("Message1", "0"));
        System.out.println("Mining...");
        blockChain.get(0).mine(difficulty);
        blockChain.add(new Block("Message2", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Mining...");        
        blockChain.get(1).mine(difficulty);
        blockChain.add(new Block("Message3", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Mining...");        
        blockChain.get(2).mine(difficulty);
        blockChain.add(new Block("Message4", blockChain.get(blockChain.size() - 1).hash));
        System.out.println("Mining...");        
        blockChain.get(3).mine(difficulty);

        System.out.println("/n BlockChain:");
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println(blockchainJson);
    }
}