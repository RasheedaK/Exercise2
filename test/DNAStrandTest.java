import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DNAStrandTest {
    @Test
    public void ShouldReturnThiamineIfIndex3() {
        List<Nucleotide> Nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('T');
        assertEquals(expectedNucleotide, dnaStrand.getNucleotide(3));
    }

    @Test
    public void ShouldNotReturnThiamineIfIndex2() {
        List<Nucleotide> Nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('T');
        assertNotEquals(expectedNucleotide, dnaStrand.getNucleotide(2));
    }

    @Test
    public void ShouldReturnLengthAs4IfNucleotidesLengthIs4() {
        List<Nucleotide> Nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        assertTrue(4 == dnaStrand.getLength());
    }

    @Test
    public void ShouldNotReturnLengthAs2IfNucleotidesLengthIs4() {
        List<Nucleotide> Nucleotides = getNucleotides();
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        assertFalse(2 == dnaStrand.getLength());
    }

    private List<Nucleotide> getNucleotides() {
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('C'));
        Nucleotides.add(new Nucleotide('G'));
        Nucleotides.add(new Nucleotide('A'));
        Nucleotides.add(new Nucleotide('T'));
        return Nucleotides;
    }
}