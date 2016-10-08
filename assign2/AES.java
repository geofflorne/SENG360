public class AES{

  private static byte[] subBytes(byte[] in){
    // for each byte in the array, use its value as an index into a fixed 256-element
    // lookup table, and replace its value in the state by the byte value stored at that location in
    // the table. You can find the table and the inverse table on the web.
  }

  private static byte[][] shiftRows(byte[][] state){
    // Let Ri denote the ith row in state. Shift R0 in the state left 0 bytes (i.e., no
    // change); shift R1 left 1 byte; shift R2 left 2 bytes; shift R3 left 3 bytes. These are circular
    // shifts. They do not affect the individual byte values themselves.
  }

  private static byte[][] mixColumns(byte[][] state){
    // for each column of the state, replace the column by its value multiplied by
    // a fixed 4 x 4 matrix of integers (in a particular Galois Field). This is the most complex
    // step. The posted video lectures explain that step in detail. You can also find details at
    // many websites, e.g., Wikipedia. Note that the inverse operation multiplies by a different
    // matrix.
  }

  private static byte[][] addRoundKey(byte[][] state, byte[][] key){
    // XOR the state with a 128-bit round key derived from the original key K by
    // a recursive process.
  }


  public static void main(String[] args){

  }
}
