public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = ".05";
        String gibberish = "887ds7nds87dsfs";

        //Parse shirtPrice and taxRate, and print the total tax
        int intshirtPrice = Integer.parseInt("15");
        double doubletaxRate = Double.parseDouble(".05");
        System.out.println(intshirtPrice * doubletaxRate);
        
        //Try to parse taxRate as an int
        int inttaxRate = Integer.parseInt(".05");
        //Try to parse gibberish as an int
        int intgibberish1 = Integer.parseInt("887ds7nds87dsfs");
    }
    
}
