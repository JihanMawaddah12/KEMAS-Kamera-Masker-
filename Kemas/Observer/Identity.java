package Observer;

import java.util.Date;

public class Identity implements Display, Observer {
    private String nama;
    private String jenis_kelamin;
    private Date tanggal;

    public Identity(Kemas kemas) {
        kemas.registerObserver(this);
    }

    public void update(String nama, String jenis_kelamin, Date tanggal) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tanggal = tanggal;
        display();
    }

    public void display() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Jenis Kelamin : " + this.jenis_kelamin);
        System.out.println("tanggal : " + this.tanggal);
    }

}