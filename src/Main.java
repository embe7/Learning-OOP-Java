


//Membuat kelas (kode 01)
class Mahasiswa{
    //data :
    String nama;
    int NPM;
    String jurusan;
}

// 02-01 memvuat class dengan construktor
    /*construktor adalah sebuah method atau fungsi
      yang pertama kali dipanggil saat objek dibuat
    */


class Mahasiswi{
    //data class Mahasiswi
    String nama;
    int NPM;
    String jurusan;
    
    //construktor
    Mahasiswi(String inputNama,int inputNPM,String inputJurusan){
        nama = inputNama;
        NPM = inputNPM;
        jurusan = inputJurusan;
        
        System.out.println(nama);
        System.out.println(NPM);
        System.out.println(jurusan);
    }
}

//02-02 Latihan construktor

class latihanMahasiswi{
    //data
    String makes = "Gado-Gado";
    String mikes = "Bandrek";
    
    //construktor
    latihanMahasiswi(String inputMakes,String inputMikes){
        //this artinya milik si Objek
        this.makes = inputMakes;
        this.mikes = inputMikes;
        
        System.out.println(makes);
        System.out.println(mikes);
    }
    
//03 Membuat Method
    //method memiliki 4 buah tipe :

    
    // 1. 03-01 (method tanpa return dan tanpa parameter)
    void show(){
        System.out.println("Makanan kesukaan : " + this.makes);
        System.out.println("Minuman Kesukaan : " + this.mikes);
    }
    
    // 2. 03-04 method tanpa return dengan parameter
    void ubahMakesAndMikes(String inputMakes,String inputMikes){
        this.makes = inputMakes;
        this.mikes = inputMikes;
    }
    
    //3. 03-06 method dengan return tapi tidak dengan parameternya
        //contoh mengambil Makes
    String getMakes(){
        return this.makes;
    }
    
    String getMikes(){
        return this.mikes;
    }
    
    // 4. 03-08 method dengan return dan dengan parameter
    String sayHi(String massage){
        return massage + " juga, makanan kesukaan saya adalah " + this.makes;
    }
}



public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        //02-01-01
        
        Mahasiswi dataMahasiswi1 = new Mahasiswi("putri", 18119080, "Teknik Informatika");
        
        //02-02-01
        latihanMahasiswi latihanmahasiswi = new latihanMahasiswi("Ayam Bakar", "Jus Terong Belanda");
        
        latihanMahasiswi latihanmahasiswi2 = new latihanMahasiswi("Martabak", "Es Jagung");
        
        //03-02 memanggil method show             
        latihanmahasiswi.show();
        latihanmahasiswi2.show();
        //03-05 menanggil method ubahMakesAndMikes
        latihanmahasiswi.ubahMakesAndMikes("Jagung Bakar", "Cendol");
        latihanmahasiswi.show();
        
        latihanmahasiswi2.ubahMakesAndMikes("Nasi Gurih", "Tehmanis");
        latihanmahasiswi2.show();
        
        
        //03-07 memanggil method getMakes and getMikes (Mengambil nilai saja)
        System.out.println(latihanmahasiswi.getMakes());
        System.out.println(latihanmahasiswi.getMikes());
        
        System.out.println(latihanmahasiswi2.getMakes());
        
        System.out.println(latihanmahasiswi2.getMikes());
        
        //03-09
        String data = latihanmahasiswi.sayHi("cantik");
        System.out.println(data);
        
        
        
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
