import java.util.*;

public class Main {
    public static void main(String args[]) {
        Transcription transcription = new Transcription(Dependency.getNucleotideMapping());
        System.out.println("Enter DNA String");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        InputParser inputParser=new InputParser();
        DNAStrand dnaStrand=inputParser.getParsedInput(inputString);
        System.out.print("Resultant RNAComplement:: ");
        RNAStrand resultStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        for (int i = 0; i < resultStrand.getLength(); i++) {
            System.out.print(resultStrand.getNucleotide(i).toString());
        }
    }
}
