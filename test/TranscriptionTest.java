import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TranscriptionTest {
    @Test
    public void shouldReturnUracilInRNAStrandForAdenine() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('A'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('U'), expectedRNAStrand.getNucleotide(0));
    }

    @Test
    public void shouldReturnAdenineInRNAStrandForThiamine() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('T'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('A'), expectedRNAStrand.getNucleotide(0));
    }

    @Test
    public void shouldReturnCytosineInRNAStrandForGuanine() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('G'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('C'), expectedRNAStrand.getNucleotide(0));
    }

    @Test
    public void shouldReturnGuanineInRNAStrandForCytosine() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('C'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        RNAStrand expectedRNAStrand = transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
        assertEquals(new Nucleotide('G'), expectedRNAStrand.getNucleotide(0));
    }

    @Test
    public void shouldReturnExceptionIfUracilGivenForTranscription() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('U'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
        transcription.getRNAComplement(dnaStrand, dnaStrand.getLength());
    }

    @Test
    public void shouldNotReturnRNAStrandWhichContainsThiamineAtIndex0ForGivenDNA() {
        Map<Nucleotide, Nucleotide> nucleotideMap = getNucleotideMap();
        Transcription transcription = new Transcription(nucleotideMap);
        List<Nucleotide> Nucleotides = new ArrayList<>();
        Nucleotides.add(new Nucleotide('A'));
        Nucleotides.add(new Nucleotide('C'));
        DNAStrand dnaStrand = new DNAStrand(Nucleotides);
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