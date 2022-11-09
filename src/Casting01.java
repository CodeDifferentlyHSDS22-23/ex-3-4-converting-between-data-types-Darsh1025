public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        int value1 = 128;
        //The byte value is being read in as an int when set at 128

        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        short value2 = 128;
        System.out.println((byte)(value2));
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        byte value3 = 127;
        System.out.println(value3 + 1);
        System.out.println(value3 + 1);
    }    
}
