import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Transcription {
    private final Map<Nucleotide, Nucleotide> nucleotideMap;

    Transcription(Map<Nucleotide, Nucleotide> nucleotideMap) {
        this.nucleotideMap = nucleotideMap;
    }

    RNAStrand getRNAComplement(DNAStrand dnaStrand,int strandLength) {
        List<Nucleotide> nucleotides=new ArrayList<>();
        for(int i=0;i<strandLength;i++){
            nucleotides.add(nucleotideMap.get(dnaStrand.getNucleotide(i)));
        }
        return new RNAStrand(nucleotides);
    }
}
