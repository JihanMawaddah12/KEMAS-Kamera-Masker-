import iterator.*;
import Observer.*;
import Singleton.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Belum ada user yang login");
        System.out.println("Masukkan username: ");
        String username = input.nextLine();
        System.out.println("Masukkan password: ");
        String password = input.nextLine();
        CurrentUser.login(username, password);

        Kemas kemas = new Kemas();
        new Identity(kemas);
        System.out.println("\n ---Data Pelanggar Penggunaan Masker Hari Ini---\n ");
        kemas.setSensor("Diah", "Perempuan", new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-29"));
        kemas.setSensor("Bayu", "Laki-laki", new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-29"));
        kemas.setSensor("Nia", "Perempuan", new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-29"));
        kemas.setSensor("Sultan", "Laki-laki", new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-29"));
        kemas = new NoMasker(kemas);
        System.out.println(kemas);

        JenisKelamin jeniskelamin = new JenisKelamin();
        Pelanggar pelanggar = new Pelanggar();

        // with iterators
        Iterator jenisKelaminIterator = jeniskelamin.createIterator();
        Iterator pelanggarIterator = pelanggar.createIterator();

        System.out.println("\n---Jenis Kelamin---\n");
        printMenu(jenisKelaminIterator);
        System.out.println("\n---Pelanggar---\n");
        printMenu(pelanggarIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String data = (String) iterator.next();
            System.out.println(data);

        }
    }
}
