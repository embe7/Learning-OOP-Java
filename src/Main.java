


//Membuat kelas (kode 01)
class Mahasiswa{
    //data :
    String nama;
    int NPM;
    String jurusan;
}

// 01-2 memvuat class dengan construktor
    /*construktor adalah sebuah method atau fungsi
      yang pertama kali dipanggil saat objek dibuat
    */


class Mahasiswi{
    //data class mahasiswi
    String nama;
    int NPM;
    String jurusan;
    
    Mahasiswi(String inputNama,int inputNPM,String inputJurusan){
        nama = inputNama;
        NPM = inputNPM;
        jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(NPM);
        System.out.println(jurusan);
    }
}

public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        //01-02
        
        Mahasiswi dataMahasiswi1 = new Mahasiswi("putri", 18119080, "Teknik Informatika");
        
        
        //menginstansiasi atau membuat objek dari class Mahaasiswa (kode 01)
        Mahasiswa mahasiswa1 = new Mahasiswa();
                //mahasiswa1 adalah nama objek
                
        mahasiswa1.nama = "suhendri";
        mahasiswa1.NPM = 18110460;
        mahasiswa1.jurusan = "Teknik Informatika";
        
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NPM);
        System.out.println(mahasiswa1.jurusan);
        
        
        //menginstansiasi atau membuat objek dari class Mahaasiswa (kode 01)
        Mahasiswa mahasiswa2 = new Mahasiswa();
                //mahasiswa2 adalah nama objek
                
        mahasiswa2.nama = "putri";
        mahasiswa2.NPM = 19110460;
        mahasiswa2.jurusan = "Matematika";
        
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NPM);
        System.out.println(mahasiswa2.jurusan);
    }
    
}
