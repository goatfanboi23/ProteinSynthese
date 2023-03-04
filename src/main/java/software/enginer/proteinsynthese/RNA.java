package software.enginer.proteinsynthese;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RNA extends GeneticInformation {
     private static final Map<NitrogenousBase,NitrogenousBase> basePairings = Map.of(
             NitrogenousBase.ADENINE,NitrogenousBase.URACIL,
             NitrogenousBase.URACIL,NitrogenousBase.ADENINE,
             NitrogenousBase.CYTOSINE,NitrogenousBase.GUANINE,
             NitrogenousBase.GUANINE,NitrogenousBase.CYTOSINE
     );

     protected RNA(Strand strand) {
          super(List.of(strand));
          if(strand.getDirection().equals(Direction.THREE_PRIME_TO_FIVE_PRIME))
               throw new IllegalArgumentException( "RNA strand must be the direction "+Direction.FIVE_PRIME_TO_THREE_PRIME);
     }

     @Override
     NitrogenousBase getPairedNitrogenousBase(NitrogenousBase base) {
          return basePairings.get(base);
     }

     @Override
     GeneticInformation copy() {
          return null;
     }
     
     public List<AminoAcid> translate(){
          return getStrands().get(0).codons().stream()
                  .map(CodonChart::getCodedAminoAcid)
                  .collect(Collectors.toList());
     }

     @Override
     public String toString() {
          return "RNA{"+super.toString()+"}";
     }
}
