import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Transcription {
    private final Map<Nucleotide, Nucleotide> nucleotideMap;

    Transcription(Map<Nucleotide, Nucleotide> nucleotideMap) {
        this.nucleotideMap = nucleotideMap;
    }

    RNAStrand getRNAComplement(String dnaStrand) {
        List<Nucleotide> nucleotides=new ArrayList<>();
        for(int i=0;i<dnaStrand.length();i++){
            nucleotides.add(nucleotideMap.get(new Nucleotide(dnaStrand.charAt(i))));
        }
        return new RNAStrand(nucleotides);
    }
}
