package software.enginer.proteinsynthese;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtils {
     public static String reverseString(String s){
          return new StringBuilder(s).reverse().toString();
     }
}
