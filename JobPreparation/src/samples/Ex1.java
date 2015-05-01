package samples;
// Implement an algorithm to determine if a string has all unique characters. What if you
// can not use additional data structures?
import java.util.HashSet;

public class Ex1 {

     public static void main(String []args){
       if (args.length > 0) {
           String input = args[0];
           HashSet<Character> hs = new HashSet <Character> ();
           for (int i = 0; i < input.length(); ++i) {
               if (hs.contains (input.charAt(i))) {
                   System.out.println ("Characters are not unique");
                   return;
               } else {
                   hs.add (input.charAt(i));
               }
           }
           
           System.out.println ("Characters are all unique in String " + input);
           
       } else {
           System.out.println ("You must provide an argument");
       }
     }
}
