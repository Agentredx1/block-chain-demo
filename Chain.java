/*Chain class for Block-Chain-Demo
 * Creates instances of Block class!
 * Created: 5/10/2024
*/

public class Chain {
    public static void main(String[] args){
        //creating Genesis Block (first)
        Block blockGenesis = new Block("Message1", "0");
        System.out.println("Block 1 hash: " + blockGenesis.hash);
        Block blockTwo = new Block("Message2", blockGenesis.refHash);
        System.out.println("Block 2 hash: " + blockTwo.hash);
        Block blockThree = new Block("Message2", blockTwo.refHash);
        System.out.println("Block 2 hash: " + blockThree.hash);
    }
}