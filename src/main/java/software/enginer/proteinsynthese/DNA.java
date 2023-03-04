package software.enginer.proteinsynthese;

import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class DNA extends GeneticInformation {
     private static final Map<NitrogenousBase,NitrogenousBase> basePairings = Map.of(
             NitrogenousBase.ADENINE,NitrogenousBase.THYMINE,
             NitrogenousBase.THYMINE,NitrogenousBase.ADENINE,
             NitrogenousBase.CYTOSINE,NitrogenousBase.GUANINE,
             NitrogenousBase.GUANINE,NitrogenousBase.CYTOSINE
     );

     public DNA(Strand strand) {
          super(List.of(strand,createAntiParallelStrand(strand)));
     }
     
     @Override
     NitrogenousBase getPairedNitrogenousBase(NitrogenousBase base) {
          return basePairings.get(base);
     }

     @Override
     GeneticInformation copy() {
          return null;
     }
     
     public RNA transcribe(){
          Strand parentStrand = getStrands().stream()
                  .filter(s -> s.getDirection().equals(Direction.THREE_PRIME_TO_FIVE_PRIME))
                  .findFirst().orElseThrow();
          
          IntStream.range(0,parentStrand.bases().size())
                  .filter(i -> parentStrand.bases().get(i).equals(NitrogenousBase.THYMINE))
                  .forEach(b -> parentStrand.replaceBase(b,NitrogenousBase.URACIL));
     
          Strand daughterStrand = new Strand(SugarType.RIBOSE,Direction.FIVE_PRIME_TO_THREE_PRIME,parentStrand.bases());
          return new RNA(daughterStrand);
     }
     private static Strand createAntiParallelStrand(Strand strand){
          Direction newDirection = strand.getDirection().equals(Direction.FIVE_PRIME_TO_THREE_PRIME) 
                  ? Direction.THREE_PRIME_TO_FIVE_PRIME
                  : Direction.FIVE_PRIME_TO_THREE_PRIME;
          List<NitrogenousBase> newBases = NitrogenousBase.fromSequence(StringUtils.reverseString(strand.bases().toString().replaceAll("[\\[\\], ]", "")));
          return new Strand(SugarType.DEOXYRIBOSE,newDirection,newBases);
     }
     @Override
     public String toString() {
          return "DNA{"+super.toString()+"}";
     }
     
}
