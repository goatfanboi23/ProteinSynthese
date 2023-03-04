package software.enginer.proteinsynthese;

public enum AminoAcid {
     ALANINE("ala"),
     ARGININE("arg"),
     ASPARAGINE("asn"),
     ASPARTIC_ACID("asp"),
     CYSTEINE("cys"),
     GLUTAMINE("gln"),
     GLUTAMIC_ACID("glu"),
     GLYCINE("gly"),
     HISTIDINE("his"),
     ISOLEUCINE("ile"),
     LEUCINE("leu"),
     LYSINE("lys"),
     METHIONINE("met"),
     PHENYLALANINE("phe"),
     PROLINE("pro"),
     SERINE("ser"),
     THREONINE("thr"),
     TRYPTOPHAN("trp"),
     TYROSINE("tyr"),
     VALINE("val"),
     STOP("stop");

     private final String abbreviation;

     AminoAcid(String abbreviation) {
          this.abbreviation = abbreviation;
     }

     public String getAbbreviation() {
          return abbreviation;
     }

     @Override
     public String toString() {
          return getAbbreviation();
     }
}
