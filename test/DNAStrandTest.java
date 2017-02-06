import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DNAStrandTest {
    @Test
    public void ShouldReturnThiamineIfForIndex3() {
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('C'));
        nucleotides.add(new Nucleotide('G'));
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('T'));
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('T');
        assertEquals(expectedNucleotide, dnaStrand.getNucleotide(3));
    }
}