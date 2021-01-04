package Observer;

import java.util.Date;
import java.util.ArrayList;

public class Kemas implements Subject {
    private ArrayList<Observer> observers;
    private String nama;
    private String jenis_kelamin;
    private Date tanggal;

    public Kemas() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0)
            observers.remove(observers.indexOf(o));

    }

    public void notifyObservers() {
        for (Observer ob : observers)
            ob.update(nama, jenis_kelamin, tanggal);
    }

    public void sensorChanged() {
        notifyObservers();
    }

    public void setSensor(String nama, String jenis_kelamin, Date tanggal) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tanggal = tanggal;
        sensorChanged();
    }

    public String toString() {
        return "pelanggaran lainnya : tidak ada";
    }

}