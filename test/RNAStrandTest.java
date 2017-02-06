import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RNAStrandTest {
    @Test
    public void ShouldReturnUracilIfIndex3() {
        List<Nucleotide> nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('U');
        assertEquals(expectedNucleotide, rnaStrand.getNucleotide(3));
    }

    @Test
    public void ShouldNotReturnGuanineIfIndex2() {
        List<Nucleotide> nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('G');
        assertNotEquals(expectedNucleotide, rnaStrand.getNucleotide(2));
    }

    @Test
    public void ShouldReturnLengthAs4IfNucleotidesLengthIs4() {
        List<Nucleotide> nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(nucleotides);
        assertTrue(4 == rnaStrand.getLength());
    }

    @Test
    public void ShouldNotReturnLengthAs2IfNucleotidesLengthIs4() {
        List<Nucleotide> nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(nucleotides);
        assertFalse(2 == rnaStrand.getLength());
    }

    private List<Nucleotide> getNucleotides() {
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('C'));
        nucleotides.add(new Nucleotide('G'));
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('U'));
        return nucleotides;
    }
}