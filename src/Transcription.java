import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Transcription {
    private final Map<Nucleotide, Nucleotide> nucleotideMap;

    Transcription(Map<Nucleotide, Nucleotide> nucleotideMap) {
        this.nucleotideMap = nucleotideMap;
    }

    RNAStrand getRNAComplement(DNAStrand dnaStrand, int strandLength) {
        List<Nucleotide> Nucleotides = new ArrayList<>();
        for (int i = 0; i < strandLength; i++) {
            Nucleotide Nucleotide = nucleotideMap.get(dnaStrand.getNucleotide(i));
            Nucleotides.add(Nucleotide);
        }
        return new RNAStrand(Nucleotides);
    }
}

