package samples;
// Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
// five characters, including the null character.)
public class Ex2{

     public static void main(String []args){
        if (args.length != 1) {
            System.out.println ("One and only one argument is needed");
            return;
        }
        
        // Going to assume that the string has an extra delimiter at the end
        
        if (args[0].length() < 2) {
            // String does not need extra work, so it is already "reversed"
            System.out.println (args[0]);
            return;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = args[0].length() - 2; i >= 0; --i) {
            result.append (args[0].charAt(i));
        }
        result.append (args[0].charAt(args[0].length() - 1));
        
        System.out.println (result);
    }
}