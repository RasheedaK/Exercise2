import java.util.ArrayList;
import java.util.List;

class InputParser {
    DNAStrand getParsedInput(String inputString){
        List<Nucleotide> inputStrand = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            inputStrand.add(new Nucleotide(character));
        }
        return new DNAStrand(inputStrand);
    }
}
