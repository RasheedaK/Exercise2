import java.util.List;

class RNAStrand {
    private final List<Nucleotide> Nucleotides;

    RNAStrand(List<Nucleotide> Nucleotides) {

        this.Nucleotides = Nucleotides;
    }

    Nucleotide getNucleotide(int index) {
        return Nucleotides.get(index);
    }

    int getLength() {
        return this.Nucleotides.size();
    }
}
