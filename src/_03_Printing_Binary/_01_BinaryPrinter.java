package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	System.out.print(b&1);
        // Shift b seven bits to the right
    	b = (byte) (b >> 7);
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	
        // Print the result using System.out.print (NOT System.out.println)
    	
        //Use this method to print the remaining 7 bits of b
    	for(int i = 0; i < 7; i++) {
    	System.out.print(b & 1);
    	b = (byte) (b >> 1);
    	}
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	byte a = 0;
    	byte b = 0;
    	//00000000
    	
    	//00001000
    	//00000001
    	System.out.println();
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	for(int i = 0; i < 8; i++) {
    		a = (byte) (a | (s & 1)); // comparing 0 to 00000001
    		if(i != 7) {
    			a = (byte) (a << 1);
    		}
    		s = (short) (s >> 1);
    	}
    	for(int i = 0; i < 8; i++) {
    		b = (byte) (b | (s & 1)); // comparing 0 to 00000001
    		if(i != 7) {
    			b = (byte) (b << 1);
    		}
    		s = (short) (s >> 1);
    	}
    	printByteBinary(a);
    	printByteBinary(b);
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short a = 0;
    	short b = 0;
    	System.out.println();
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	for(int j = 0; j < 16; j++) {
    		a = (short) (a | (i & 1));
    		if(j != 15) {
    			a = (short) (a << 1);
    		}
    		i = (i >> 1);
    		}
    	
    	for(int j = 0; j < 16; j++) {
    		b = (short) (b | (i & 1));
    		if(j != 15) {
    			b = (short) (b<<1);
    		}
    		i = i >> 1;
    	}
    	
    	
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	printShortBinary(a);
    	printShortBinary(b);
    	
    }
    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	//System.out.print(l);
    	System.out.println();
        // Shift b seven bits to the right
    	l = (byte) (l >> 7);
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	l = (byte) (l & 1);
        // Print the result using System.out.print (NOT System.out.println)
    	//System.out.print(l);
        //Use this method to print the remaining 7 bits of b
    	for(int i = 0; i < 32; i++) {
    	//System.out.println(l & 1);
    	l = (long) (l >> 1);
    	}
    }

    public static void main(String[] args) {
    	byte b = 3;
    	short s = 5;
    	int i = 9;
    	long l = 8;
        printByteBinary(b);
        printShortBinary(s);
        printIntBinary(i);
        printLongBinary(l);
        
    	// Test your methods here
    }
}
