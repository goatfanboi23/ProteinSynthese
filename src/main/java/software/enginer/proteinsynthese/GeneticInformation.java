package software.enginer.proteinsynthese;

import java.util.List;

public abstract class GeneticInformation {
     private final List<Strand> strands;

     protected GeneticInformation(List<Strand> strands) {
          this.strands = strands;
     }

     abstract NitrogenousBase getPairedNitrogenousBase(NitrogenousBase base);
     abstract GeneticInformation copy();

     public List<Strand> getStrands() {
          return strands;
     }

     @Override
     public String toString() {
          return "GeneticInformation{" +
                  "strands=" + strands +
                  '}';
     }
}
