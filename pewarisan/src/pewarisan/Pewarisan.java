package pewarisan;

class manusia {
    String nama;
    public void halo(){
        System.out.println("Hallo");
    }
}

class dosen extends Halo{
    public void namasaya(){
        System.out.println("nama saya : "+nama);
    }
    
    dosen (String namados){
        nama = namados;
    }
    
    dosen (String namados, int umur){
        nama = namados;
        this.umur = umur;
    }
}

class mahasiswa extends manusia{
    public void bicara(){
        System.out.print("ini dari class mahasiswa : ");
    }
}

public class Pewarisan {
    public static void main(String[] args) {
        dosen d = new dosen("yodi", 18);
        mahasiswa m = new mahasiswa();
        d.nama = "yodi";
        d.halo();
        d.namasaya();
        m.bicara();
        m.halo();
    }
}
