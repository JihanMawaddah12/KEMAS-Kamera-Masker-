package iterator;

public class PelanggarIterator implements Iterator {
    String[] nama;
    int position = 0;

    public PelanggarIterator(String[] nama) {
        this.nama = nama;
    }

    public String next() {
        String data = nama[position];
        position = position + 1;
        return data;
    }

    public boolean hasNext() {
        if (position >= nama.length || nama[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}