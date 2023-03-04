package software.enginer.proteinsynthese;

import java.util.Map;

import static software.enginer.proteinsynthese.NitrogenousBase.*;

public class CodonChart {
     
     private static final Map<Codon,AminoAcid> codonLookup = Map.<Codon, AminoAcid>ofEntries(
             Map.entry(Codon.of(URACIL, URACIL, URACIL), AminoAcid.PHENYLALANINE),
             Map.entry(Codon.of(URACIL, URACIL, CYTOSINE), AminoAcid.PHENYLALANINE),
             Map.entry(Codon.of(URACIL, URACIL, ADENINE), AminoAcid.LEUCINE),
             Map.entry(Codon.of(URACIL, URACIL, GUANINE), AminoAcid.LEUCINE),

             Map.entry(Codon.of(CYTOSINE, URACIL, URACIL), AminoAcid.LEUCINE),
             Map.entry(Codon.of(CYTOSINE, URACIL, CYTOSINE), AminoAcid.LEUCINE),
             Map.entry(Codon.of(CYTOSINE, URACIL, ADENINE), AminoAcid.LEUCINE),
             Map.entry(Codon.of(CYTOSINE, URACIL, GUANINE), AminoAcid.LEUCINE),

             Map.entry(Codon.of(ADENINE, URACIL, URACIL), AminoAcid.ISOLEUCINE),
             Map.entry(Codon.of(ADENINE, URACIL, CYTOSINE), AminoAcid.ISOLEUCINE),
             Map.entry(Codon.of(ADENINE, URACIL, ADENINE), AminoAcid.ISOLEUCINE),
             Map.entry(Codon.of(ADENINE, URACIL, GUANINE), AminoAcid.METHIONINE),

             Map.entry(Codon.of(GUANINE, URACIL, URACIL), AminoAcid.VALINE),
             Map.entry(Codon.of(GUANINE, URACIL, CYTOSINE), AminoAcid.VALINE),
             Map.entry(Codon.of(GUANINE, URACIL, ADENINE), AminoAcid.VALINE),
             Map.entry(Codon.of(GUANINE, URACIL, GUANINE), AminoAcid.VALINE),

             Map.entry(Codon.of(URACIL, CYTOSINE, URACIL), AminoAcid.SERINE),
             Map.entry(Codon.of(URACIL, CYTOSINE, CYTOSINE), AminoAcid.SERINE),
             Map.entry(Codon.of(URACIL, CYTOSINE, ADENINE), AminoAcid.SERINE),
             Map.entry(Codon.of(URACIL, CYTOSINE, GUANINE), AminoAcid.SERINE),

             Map.entry(Codon.of(CYTOSINE, CYTOSINE, URACIL), AminoAcid.PROLINE),
             Map.entry(Codon.of(CYTOSINE, CYTOSINE, CYTOSINE), AminoAcid.PROLINE),
             Map.entry(Codon.of(CYTOSINE, CYTOSINE, ADENINE), AminoAcid.PROLINE),
             Map.entry(Codon.of(CYTOSINE, CYTOSINE, GUANINE), AminoAcid.PROLINE),

             Map.entry(Codon.of(ADENINE, CYTOSINE, URACIL), AminoAcid.THREONINE),
             Map.entry(Codon.of(ADENINE, CYTOSINE, CYTOSINE), AminoAcid.THREONINE),
             Map.entry(Codon.of(ADENINE, CYTOSINE, ADENINE), AminoAcid.THREONINE),
             Map.entry(Codon.of(ADENINE, CYTOSINE, GUANINE), AminoAcid.THREONINE),

             Map.entry(Codon.of(GUANINE, CYTOSINE, URACIL), AminoAcid.ALANINE),
             Map.entry(Codon.of(GUANINE, CYTOSINE, CYTOSINE), AminoAcid.ALANINE),
             Map.entry(Codon.of(GUANINE, CYTOSINE, ADENINE), AminoAcid.ALANINE),
             Map.entry(Codon.of(GUANINE, CYTOSINE, GUANINE), AminoAcid.ALANINE),

             Map.entry(Codon.of(URACIL, ADENINE, URACIL), AminoAcid.SERINE),
             Map.entry(Codon.of(URACIL, ADENINE, CYTOSINE), AminoAcid.SERINE),
             Map.entry(Codon.of(URACIL, ADENINE, ADENINE), AminoAcid.STOP),
             Map.entry(Codon.of(URACIL, ADENINE, GUANINE), AminoAcid.STOP),

             Map.entry(Codon.of(CYTOSINE, ADENINE, URACIL), AminoAcid.HISTIDINE),
             Map.entry(Codon.of(CYTOSINE, ADENINE, CYTOSINE), AminoAcid.HISTIDINE),
             Map.entry(Codon.of(CYTOSINE, ADENINE, ADENINE), AminoAcid.GLUTAMINE),
             Map.entry(Codon.of(CYTOSINE, ADENINE, GUANINE), AminoAcid.GLUTAMINE),

             Map.entry(Codon.of(ADENINE, ADENINE, URACIL), AminoAcid.ASPARAGINE),
             Map.entry(Codon.of(ADENINE, ADENINE, CYTOSINE), AminoAcid.ASPARAGINE),
             Map.entry(Codon.of(ADENINE, ADENINE, ADENINE), AminoAcid.LYSINE),
             Map.entry(Codon.of(ADENINE, ADENINE, GUANINE), AminoAcid.LYSINE),

             Map.entry(Codon.of(GUANINE, ADENINE, URACIL), AminoAcid.ASPARTIC_ACID),
             Map.entry(Codon.of(GUANINE, ADENINE, CYTOSINE), AminoAcid.ASPARTIC_ACID),
             Map.entry(Codon.of(GUANINE, ADENINE, ADENINE), AminoAcid.GLUTAMIC_ACID),
             Map.entry(Codon.of(GUANINE, ADENINE, GUANINE), AminoAcid.GLUTAMIC_ACID),

             Map.entry(Codon.of(URACIL, GUANINE, URACIL), AminoAcid.CYSTEINE),
             Map.entry(Codon.of(URACIL, GUANINE, CYTOSINE), AminoAcid.CYSTEINE),
             Map.entry(Codon.of(URACIL, GUANINE, ADENINE), AminoAcid.STOP),
             Map.entry(Codon.of(URACIL, GUANINE, GUANINE), AminoAcid.TRYPTOPHAN),

             Map.entry(Codon.of(CYTOSINE, GUANINE, URACIL), AminoAcid.ARGININE),
             Map.entry(Codon.of(CYTOSINE, GUANINE, CYTOSINE), AminoAcid.ARGININE),
             Map.entry(Codon.of(CYTOSINE, GUANINE, ADENINE), AminoAcid.ARGININE),
             Map.entry(Codon.of(CYTOSINE, GUANINE, GUANINE), AminoAcid.ARGININE),

             Map.entry(Codon.of(ADENINE, GUANINE, URACIL), AminoAcid.SERINE),
             Map.entry(Codon.of(ADENINE, GUANINE, CYTOSINE), AminoAcid.SERINE),
             Map.entry(Codon.of(ADENINE, GUANINE, ADENINE), AminoAcid.ARGININE),
             Map.entry(Codon.of(ADENINE, GUANINE, GUANINE), AminoAcid.ARGININE),

             Map.entry(Codon.of(GUANINE, GUANINE, URACIL), AminoAcid.GLYCINE),
             Map.entry(Codon.of(GUANINE, GUANINE, CYTOSINE), AminoAcid.GLYCINE),
             Map.entry(Codon.of(GUANINE, GUANINE, ADENINE), AminoAcid.GLYCINE),
             Map.entry(Codon.of(GUANINE, GUANINE, GUANINE), AminoAcid.GLYCINE)
     );
     public static AminoAcid getCodedAminoAcid(Codon codon){
          return codonLookup.get(codon);
     }
     
     

}
