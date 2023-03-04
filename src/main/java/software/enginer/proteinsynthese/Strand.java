package software.enginer.proteinsynthese;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Strand {
     private final SugarType sugar;
     private final List<NitrogenousBase> bases;
     private final Direction direction;

     public Strand(SugarType sugar, Direction direction, List<NitrogenousBase> bases) {
          this.sugar = sugar;
          this.bases = bases;
          this.direction = direction;
     }
     public Strand(SugarType sugar, Direction direction, NitrogenousBase... bases) {
          this.sugar = sugar;
          this.bases = List.copyOf(List.of(bases));
          this.direction = direction;
     }
     public List<NitrogenousBase> bases() {
          return Collections.unmodifiableList(bases);
     }

     public Strand replaceBase(int index, NitrogenousBase base) {
          bases.set(index, base);
          return this;
     }

     public Strand deleteBase(int index) {
          bases.remove(index);
          return this;
     }

     public Strand insertBase(int index, NitrogenousBase base) {
          bases.add(index, base);
          return this;
     }

     public Strand appendBase(NitrogenousBase base) {
          bases.add(base);
          return this;
     }

     public List<Codon> codons() {
          return IntStream.range(2, bases.size())
                  .filter(i -> (i - 2) % 3 == 0)
                  .mapToObj(i -> Codon.of(bases.get(i - 2), bases.get(i - 1), bases.get(i)))
                  .collect(Collectors.toList());
     }

     @Override
     public String toString() {
          return "Strand {" +
                  "sugar=" + sugar +
                  ", bases=" + bases.toString().replaceAll(", ","-") +
                  ", direction=" + direction +
                  '}';
     }

     public SugarType getSugar() {
          return sugar;
     }

     public List<NitrogenousBase> getBases() {
          return bases;
     }

     public Direction getDirection() {
          return direction;
     }
    
}
