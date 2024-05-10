Chain.class: Chain.java Block.class ShaHelper.class
	javac -g Chain.class

Block.class: Block.java ShaHelper.class
	javac -g Blockchain.java

ShaHelper.class: ShaHelper.java
	javac -g ShaHelper.java

run: Chain.class
	java Chain

clean:
	rm *.class
