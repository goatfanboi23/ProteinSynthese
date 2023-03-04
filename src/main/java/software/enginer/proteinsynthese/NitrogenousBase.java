package software.enginer.proteinsynthese;

import java.util.*;
import java.util.stream.Collectors;

public enum NitrogenousBase {
     THYMINE('T'),
     ADENINE('A'),
     CYTOSINE('C'),
     GUANINE('G'),
     URACIL('U');

     private final char abbreviation;
     private static Map<Character,NitrogenousBase> abbreviationMap = new HashMap<>();
     static {Arrays.stream(values()).forEach(b -> abbreviationMap.put(b.getAbbreviation(),b));}

     NitrogenousBase(char abbreviation) {
          this.abbreviation = abbreviation;
     }

     public static List<NitrogenousBase> fromSequence(String sequence) {
          
          return Arrays.stream(sequence.toUpperCase().chars()
                          .mapToObj(c -> (char)c)
                          .toArray(Character[]::new))
                  .map(NitrogenousBase::fromAbbreviation).collect(Collectors.toList());

     }
     public static NitrogenousBase fromAbbreviation(char c){
          return abbreviationMap.get(c);
     }

     public char getAbbreviation() {
          return abbreviation;
     }

     @Override
     public String toString() {
          return String.valueOf(getAbbreviation());
     }
}
