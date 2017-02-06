import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TranscriptionTest {
    @Test
    public void shouldReturnRNAStrandWhichContainsUracilAtIndex0ForGivenDNA() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('G'));
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('U'), expectedRNAStrand.getNucleotide(0));
    }

    @Test
    public void shouldReturnRNAStrandWhichContainsGuanineAtIndex1ForGivenDNA() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('C'));
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('G'), expectedRNAStrand.getNucleotide(1));
    }

    @Test
    public void shouldNotReturnRNAStrandWhichContainsThiamineAtIndex0ForGivenDNA() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> nucleotides = new ArrayList<>();
        nucleotides.add(new Nucleotide('A'));
        nucleotides.add(new Nucleotide('C'));
        DNAStrand dnaStrand = new DNAStrand(nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertNotEquals(new Nucleotide('T'), expectedRNAStrand.getNucleotide(0));
    }

    private Map<Nucleotide, Nucleotide> getNucleotideMap() {
        Map<Nucleotide, Nucleotide> nucleotideMap = new HashMap<>();
        nucleotideMap.put(new Nucleotide('A'), new Nucleotide('U'));
        nucleotideMap.put(new Nucleotide('T'), new Nucleotide('A'));
        nucleotideMap.put(new Nucleotide('G'), new Nucleotide('C'));
        nucleotideMap.put(new Nucleotide('C'), new Nucleotide('G'));
        return nucleotideMap;
    }
}