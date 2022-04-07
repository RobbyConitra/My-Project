package pkgstatic;

public class Static {

    public static void main(String[] args) {
        
        Static_Prisoner.umur = 20;
        Static_Prisoner.name("Jordan");

        Static_Prisoner buba = new Static_Prisoner();
        buba.tinggi = 180;
        buba.tampilkan();

    }
}