# Simple Block Chain created with Java
## Goal:
further understanding of how a simple block chain functions
and get better idea of it's possible applications.

I'll be following a tutorial, and will include links to those below.
I'll try and deviate and personalize it a bit, but the base will be very close to tutorial.
(Not going to overcomplicate things reinventing the basics/renaming variables)

## Idea:
Multiple Block objects will be in array, they'll each contain a unique hash as well as the previous block's hash.
These hashes will link together the blocks. This would make it difficult for people to tamper with new blocks, and impossible (I think?) to mess with old ones.

## Steps:
1. Create a Block object, it will only contain a few variables
    - String hash (sort of like that blocks ID. Like a fingerprint for a person, unique, and influenced by previous hash)
    - String lastHash (hash of previous block, plays a big part in validating everything)
    - String data
    - long timeStamp
2. 


## Credits and Resources
### main tutorial: Thanks Kass from Medium.com / CoderKass on X for this great tutorial!
https://medium.com/programmers-blockchain/create-simple-blockchain-java-tutorial-from-scratch-6eeed3cb03fa

Other links to documentation I used to create/understand the code:
### Java Security Overview: 
https://docs.oracle.com/en/java/javase/11/security/java-security-overview1.html#GUID-74E1EFEA-F1DD-466C-B61A-CB5E89FA50DE
### Secure Hash Algorithms (SHA): 
https://brilliant.org/wiki/secure-hashing-algorithms/#:~:text=Secure%20Hash%20Algorithms%2C%20also%20known,modular%20additions%2C%20and%20compression%20functions.