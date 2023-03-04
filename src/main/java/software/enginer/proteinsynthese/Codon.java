package software.enginer.proteinsynthese;

import java.util.Objects;

public class Codon {
     private final NitrogenousBase b1;
     private final NitrogenousBase b2;
     private final NitrogenousBase b3;

     public Codon(NitrogenousBase b1, NitrogenousBase b2, NitrogenousBase b3) {
          this.b1 = b1;
          this.b2 = b2;
          this.b3 = b3;
     }

     public NitrogenousBase getB1() {
          return b1;
     }

     public NitrogenousBase getB2() {
          return b2;
     }

     public NitrogenousBase getB3() {
          return b3;
     }
     public static Codon of(NitrogenousBase b1, NitrogenousBase b2, NitrogenousBase b3) {
          return new Codon(b1,b2,b3);
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Codon codon = (Codon) o;
          return b1 == codon.b1 && b2 == codon.b2 && b3 == codon.b3;
     }

     @Override
     public int hashCode() {
          return Objects.hash(b1, b2, b3);
     }
}
