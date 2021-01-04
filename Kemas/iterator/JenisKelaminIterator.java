package iterator;

import java.util.ArrayList;

public class JenisKelaminIterator implements Iterator {
    ArrayList<String> datas;
    int position = 0;

    public JenisKelaminIterator(ArrayList<String> datas) {
        this.datas = datas;
    }

    public String next() {
        String data = (String) datas.get(position);
        position = position + 1;
        return data;
    }

    public boolean hasNext() {
        if (position >= datas.size()) {
            return false;
        } else {
            return true;
        }
    }
}
