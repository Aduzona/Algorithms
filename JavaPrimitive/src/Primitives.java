import java.sql.SQLOutput;

public class Primitives {
    public static void main(String[] args) {

        //intType();
        longType();
    }

    public static void intType(){
        // occupies 32 bits
        int myValue =10000;
        //determine range of primitive type
        int myMinIntValue =Integer.MIN_VALUE; // minimum value  that can be stored in int is -2 billion (-2147483648)
        int myMaxIntValue = Integer.MAX_VALUE;// max number in int is +2 billion (2147483647)

        //Integer is a class,
        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted Max value =" + (myMaxIntValue + 1)); // Signifies overflow -2147483648
        System.out.println("Integer Min Value =" + (myMinIntValue -1)); // also 2147483647 signifies underflow

        //int myMaxIntTest = 2_147_483_647  + 1; //number overflow
    }

    public static void byteType(){
        //This is good for code documentation
        // Byte has 8 bits
        byte myMinByteValue = Byte.MIN_VALUE; // -128
        byte myMaxByteValue = Byte.MAX_VALUE; // 127
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

    }

    public static void shortType(){
        //A short occupies 16 bits
        short myMinShortValue = Short.MIN_VALUE;//-32768
        short myMaxShortValue = Short.MAX_VALUE;//32767
        System.out.println("Short Minimum Value ="+ myMinShortValue);
        System.out.println("Short Maximum Value ="+ myMaxShortValue);

    }

    public static void longType(){
        //Long has a width of 64 bits

        long myLongValue = 100L; //tells the computer that it is a long value, else it will treat as integer
        long myMinLongValue = Long.MIN_VALUE;//-9223372036854775808
        long myMaxLongValue = Long.MAX_VALUE;//9223372036854775807
        System.out.println("Long Minimum Value ="+ myMinLongValue);
        System.out.println("Long Maximum Value ="+ myMaxLongValue);
        //long bigLongLiteralValue = 2_147_483_647 + 1;// without the L, it is an integer and that's max of an integer.
        long bigLongLiteralValue = 2_147_483_647_123L;
    }

    public static void casting(){
        int myTotal = (-2_147_483_648/2);
        byte myMinByteValue= Byte.MIN_VALUE;

        //use casting to change from int to byte
        byte myNewByteValue = (byte) (myMinByteValue/2);

        short myMinShortValue=Short.MIN_VALUE;

        //Casting short changes from int to short
        short myNewShortValue = (short)  (myMinShortValue/2);

    }

}
