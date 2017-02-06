import org.junit.Test;

import static org.junit.Assert.*;

public class NucleotideTest {
    @Test
    public void shouldReturnTrueIfNucleotidesAreSame() {
        Nucleotide nucleotide = new Nucleotide('C');
        assertEquals(new Nucleotide('C'), new Nucleotide('C'));
    }
}