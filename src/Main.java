import java.util.*;

public class Main {
    public static void main(String args[]) {
        Transcription transcription = new Transcription(Dependency.getNucleotideMapping());
        System.out.println("Enter DNA String");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        List<Nucleotide> inputStrand = new ArrayList<>();
        System.out.print("Resultant RNAComplement:: ");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            inputStrand.add(new Nucleotide(character));
        }
        DNAStrand dnaStrand = new DNAStrand(inputStrand);
        RNAStrand resultStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        for (int i = 0; i < resultStrand.getLength(); i++) {
            System.out.print(resultStrand.getNucleotide(i).toString());
        }
    }
}
