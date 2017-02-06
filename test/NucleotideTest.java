import org.junit.Test;

import static org.junit.Assert.*;

public class NucleotideTest {
    @Test
    public void shouldReturnEqualsIfNucleotidesAreSame() {
        Nucleotide nucleotide = new Nucleotide('C');
        assertEquals(new Nucleotide('C'), new Nucleotide('C'));
    }

    @Test
    public void shouldReturnNotEqualsIfNucleotidesAreNotSame() {
        Nucleotide nucleotide = new Nucleotide('C');
        assertNotEquals(new Nucleotide('A'), new Nucleotide('C'));
    }
}