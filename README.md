# Simple Block Chain created with Java

## Goal:
further understanding of how a simple block chain functions
and get better idea of it's possible applications.

I'll be following a tutorial pretty closely, and will include links to those below.
I'll try and deviate and personalize it a bit, but it's really not doing much ¯\_(ツ)_/¯

## Where I'm at:
5/10/2024 - added all class files and Json output for three blocks, can mine, validate chain, pretty good!
## To do:
Add transactions?

## Idea: Follows proof of work
Multiple Block objects will be in array, they'll each contain a unique hash as well as the previous block's hash.
These hashes will link together the blocks. This would make it difficult for people to tamper with new blocks, and impossible to mess with old ones.
Each hash is calcuted using a secure hashing algorithm (SHA-256) and all of the data from the previous block.
The computer randomly hashes^ out numbers till the hash is less than or equal to a secret target hexadecimal number.
Once this happens, a block is completed. The difficulty determines how many leading 0's the target number will have. 
Higher difficulty = more 0's = smaller number = more crunching numbers for the right one.
The more nodes/miners a blockchain has, the stronger it is.

## Steps:
1. Create a Block class, it will only contain a few variables
    - String hash (sort of like that blocks ID. Like a fingerprint for a person, unique, and influenced by previous hash)
    - String lastHash (hash of previous block, plays a big part in validating everything)
    - String data
    - long timeStamp
    + constructor()
    + void mine()
    + String newHash()
2. Create main class for entire chain
    - ArrayList blockChain
    - integer difficulty
    + constructor()
    + boolean validateChain()
3. Helper/utility class to encode data with SHA256
    + String Sha256()
    + String byteToHex();



## Credits and Resources
### main tutorial: Thanks Kass from Medium.com / CoderKass on X for this great tutorial!
https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa

Other links to documentation I used to create/understand the code:
### Java Security Overview: 
https://docs.oracle.com/en/java/javase/11/security/java-security-overview1.html#GUID-74E1EFEA-F1DD-466C-B61A-CB5E89FA50DE
### Secure Hash Algorithms (SHA): 
https://brilliant.org/wiki/secure-hashing-algorithms/#:~:text=Secure%20Hash%20Algorithms%2C%20also%20known,modular%20additions%2C%20and%20compression%20functions.
### SHA-256 and using .messageDigest
https://www.baeldung.com/sha-256-hashing-java