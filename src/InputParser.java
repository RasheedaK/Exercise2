import java.util.ArrayList;
import java.util.List;

class InputParser {
    DNAStrand getParsedInput(String inputString){
        if(!(inputString.matches("[AGTC]+"))) {
            System.out.println("Invalid Input");
            quit();
        }
        List<Nucleotide> inputStrand = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            inputStrand.add(new Nucleotide(character));
        }
        return new DNAStrand(inputStrand);
    }

    private void quit() {
        System.exit(1);
    }
}
