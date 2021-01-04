package iterator;

public class Pelanggar implements Data {
    static final int MAX_DATAS = 100;
    int numberOfDatas = 0;
    String[] data;

    public Pelanggar() {
        data = new String[MAX_DATAS];

        addNama("Diah");
        addNama("Bayu");
        addNama("Nia");
        addNama("Sultan");
    }

    public void addNama(String Nama) {
        if (numberOfDatas >= MAX_DATAS) {
            System.err.println("Data Sudah Penuh!");
        } else {
            data[numberOfDatas] = Nama;
            numberOfDatas = numberOfDatas + 1;
        }
    }

    public String[] getdata() {
        return data;
    }

    public Iterator createIterator() {
        return new PelanggarIterator(data);
    }

}
