import java.util.Scanner;

public class BUKUtes {
    public static void main(String[] args) {
        
        //Construstor
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Judul Buku:");
        String judul = input.nextLine();
        System.out.println("Masukan Nama Pengarang Buku:");
        String pengarang = input.nextLine();
        System.out.println("Masukan Id Buku:");
        int id = input.nextInt();
        System.out.println("Masukan Tahun terbit buku:");
        int tahunterbit = input.nextInt();
        //object
        BUKU nendra = new BUKU(id, judul, pengarang, tahunterbit);
        System.out.println("_________________________________________");
        System.out.println("Judul Buku: "+nendra.judul);
        System.out.println("Pengarang Buku: "+nendra.pengarang);
        System.out.println("Id Buku: "+nendra.id);
        System.out.println("Tahun terbit buku: "+nendra.tahunterbit);
        
        /*BUKU nendra = new BUKU(99876,"Buku Solusi Kehidupan", "Danendra", 1945);
        System.out.println(nendra.id);
        System.out.println(nendra.judul);
        System.out.println(nendra.pengarang);
        System.out.println(nendra.tahunterbit);
        System.out.println("=================");

        BUKU nendr = new BUKU(76871,"Buku Memasak", "Vania", 2015);
        System.out.println(nendr.id);
        System.out.println(nendr.judul);
        System.out.println(nendr.pengarang);
        System.out.println(nendr.tahunterbit);
        System.out.println("=================");

        BUKU nend = new BUKU(12345,"Buku Sejarah Proklamasi", "Ir.Soekarno", 1947);
        System.out.println(nend.id);
        System.out.println(nend.judul);
        System.out.println(nend.pengarang);
        System.out.println(nend.tahunterbit);
        System.out.println("=================");

        BUKU nen = new BUKU(8976,"Buku Servis Laptop", "Patol", 2010);
        System.out.println(nen.id);
        System.out.println(nen.judul);
        System.out.println(nen.pengarang);
        System.out.println(nen.tahunterbit);
        System.out.println("=================");

        BUKU ne = new BUKU(67894,"Buku Gerakan Pramuka", "Jamal Bismillah", 1999);
        System.out.println(ne.id);
        System.out.println(ne.judul);
        System.out.println(ne.pengarang);
        System.out.println(ne.tahunterbit);
        System.out.println("=================");*/





    }
}
