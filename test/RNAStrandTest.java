import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RNAStrandTest {
    @Test
    public void ShouldReturnUracilIfIndex3() {
        List<Nucleotide> Nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(Nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('U');
        assertEquals(expectedNucleotide, rnaStrand.getNucleotide(3));
    }

    @Test
    public void ShouldNotReturnGuanineIfIndex2() {
        List<Nucleotide> Nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(Nucleotides);
        Nucleotide expectedNucleotide = new Nucleotide('G');
        assertNotEquals(expectedNucleotide, rnaStrand.getNucleotide(2));
    }

    @Test
    public void ShouldReturnLengthAs4IfNucleotidesLengthIs4() {
        List<Nucleotide> Nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(Nucleotides);
        assertTrue(4 == rnaStrand.getLength());
    }

    @Test
    public void ShouldNotReturnLengthAs2IfNucleotidesLengthIs4() {
        List<Nucleotide> Nucleotides = getNucleotides();
        RNAStrand rnaStrand = new RNAStrand(Nucleotides);
        assertFalse(2 == rnaStrand.getLength());
    }

    private List<Nucleotide> getNucleotides() {
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('C'));
        Nucleotides.add(new Nucleotide('G'));
        Nucleotides.add(new Nucleotide('A'));
        Nucleotides.add(new Nucleotide('U'));
        return Nucleotides;
    }
}