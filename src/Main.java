import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Map<Nucleotide, Nucleotide> nucleotideMap = new HashMap<>();
        nucleotideMap.put(new Nucleotide('A'), new Nucleotide('U'));
        nucleotideMap.put(new Nucleotide('T'), new Nucleotide('A'));
        nucleotideMap.put(new Nucleotide('G'), new Nucleotide('C'));
        nucleotideMap.put(new Nucleotide('C'), new Nucleotide('G'));
        Transcription transcription=new Transcription(nucleotideMap);
        System.out.println("Enter DNA String");
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        List<Nucleotide> inputStrand=new ArrayList<>();
        for(int i=0;i<inputString.length();i++){
            inputStrand.add(new Nucleotide(inputString.charAt(i)));
        }
        DNAStrand dnaStrand=new DNAStrand(inputStrand);
        RNAStrand resultStrand=transcription.getRNAComplement(dnaStrand,dnaStrand.getLength());
        for(int i=0;i<resultStrand.getLength();i++){
            System.out.println(resultStrand.getNucleotide(i));
        }
    }
}
