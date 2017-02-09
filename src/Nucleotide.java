class Nucleotide {
    private final char base;

    Nucleotide(char base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nucleotide that = (Nucleotide) o;

        return base == that.base;
    }

    @Override
    public int hashCode() {
        return (int) base;
    }

    @Override
    public String toString() {
        return "" + base;
    }
}
