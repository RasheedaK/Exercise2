import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DNAStrandTest {
    @Test
    public void ShouldReturnThiamineIfIndex3() {
        List<Nucleotide> nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('T');
        assertEquals(expectedNucleotide, dnaStrand.getNucleotide(3));
    }
    @Test
    public void ShouldNotReturnThiamineIfIndex2() {
        List<Nucleotide> nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('T');
        assertNotEquals(expectedNucleotide, dnaStrand.getNucleotide(2));
    }

    private List<Nucleotide> getNucleotides() {
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('C'));
        nucleotides.add(new Nucleotide('G'));
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('T'));
        return nucleotides;
    }
}