package software.enginer.proteinsynthese;

public class Main {
     public static void main(String[] args) {
          Strand strand = new Strand(SugarType.DEOXYRIBOSE,Direction.FIVE_PRIME_TO_THREE_PRIME,NitrogenousBase.fromSequence(
                  "atcgagctttaccattttggaccgat"
          ));
          DNA dna = new DNA(strand);
          System.out.println(dna);
          RNA rna = dna.transcribe();
          System.out.println(rna);
          System.out.println(rna.translate());
     }
}
