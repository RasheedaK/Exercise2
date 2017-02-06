import java.util.List;

class RNAStrand {
    private final List<Nucleotide> nucleotides;

    RNAStrand(List<Nucleotide> nucleotides) {

        this.nucleotides = nucleotides;
    }

    Nucleotide getNucleotide(int index) {
        return nucleotides.get(index);
    }

    int getLength() {
        return this.nucleotides.size();
    }
}
