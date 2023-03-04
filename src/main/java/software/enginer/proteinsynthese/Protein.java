package software.enginer.proteinsynthese;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Protein {
     List<AminoAcid> aminoAcids = new ArrayList<>();
     Function<?,?> function;
     Stage stage;
     double idealTemp;
     double idealPh;
}
