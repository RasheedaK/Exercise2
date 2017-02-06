import java.util.List;

class DNAStrand {
    private final List<Nucleotide> nucleotides;

    DNAStrand(List<Nucleotide> nucleotides) {

        this.nucleotides = nucleotides;
    }

    Nucleotide getNucleotide(int index) {
        return nucleotides.get(index);
    }
}
