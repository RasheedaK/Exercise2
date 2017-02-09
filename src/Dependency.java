import java.util.HashMap;
import java.util.Map;

class Dependency {
    static Map<Nucleotide, Nucleotide> getNucleotideMapping() {
        Map<Nucleotide, Nucleotide> nucleotideMap = new HashMap<>();
        nucleotideMap.put(new Nucleotide('A'), new Nucleotide('U'));
        nucleotideMap.put(new Nucleotide('T'), new Nucleotide('A'));
        nucleotideMap.put(new Nucleotide('G'), new Nucleotide('C'));
        nucleotideMap.put(new Nucleotide('C'), new Nucleotide('G'));
        return nucleotideMap;
    }
}


