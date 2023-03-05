package software.enginer.proteinsynthese;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
     public static void main(String[] args) throws IOException, URISyntaxException {
          Strand strand = new Strand(SugarType.DEOXYRIBOSE,Direction.FIVE_PRIME_TO_THREE_PRIME,NitrogenousBase.fromSequence(
                  "atcgagctttaccattttggaccgat"
          ));
          DNA dna = new DNA(strand);
          System.out.println(dna);
          RNA rna = dna.transcribe();
          System.out.println(rna);
          System.out.println(rna.translate());
          ObjectMapper objMapper = new ObjectMapper();
          File file = new File(Strand.class.getClassLoader().getResource("test.json").toURI());
          if (!file.exists())file.createNewFile();
          
          objMapper.writeValue(new File(Main.class.getResource("/test.json").toURI()),dna);
          String jsonInString = objMapper.writeValueAsString(dna);
          System.out.println(jsonInString);
     }
}
