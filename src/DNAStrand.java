import java.util.List;

class DNAStrand {
    private final List<Nucleotide> Nucleotides;

    DNAStrand(List<Nucleotide> Nucleotides) {

        this.Nucleotides = Nucleotides;
    }

    Nucleotide getNucleotide(int index) {
        return Nucleotides.get(index);
    }

    int getLength() {
        return this.Nucleotides.size();
    }
}
