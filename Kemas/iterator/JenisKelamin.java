package iterator;

import java.util.ArrayList;

public class JenisKelamin implements Data {
    ArrayList<String> data;

    public JenisKelamin() {
        data = new ArrayList<String>();

        addData("Perempuan");
        addData("Laki-Laki");
        addData("Perempuan");
        addData("Laki-Laki");
    }

    public void addData(String jeniskelamin) {
        data.add(jeniskelamin);
    }

    public ArrayList<String> getdata() {
        return data;
    }

    public Iterator createIterator() {
        return new JenisKelaminIterator(data);
    }

    public String toString() {
        return "Jenis Kelamin";
    }

}