package Observer;

public class NoMasker extends Foul {
    private Kemas kemas;

    public NoMasker(Kemas kemas) {
        this.kemas = kemas;
    }

    public String toString() {
        if (kemas.toString().indexOf("masker") >= 0)
            return kemas.toString();
        else if (kemas.toString().indexOf("tidak ada") >= 0)
            return "Pelanggaran : tidak memakai masker";
        return kemas + ", penggunaan masker tidak tepat";
    }
}