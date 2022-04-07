package prison;
public class Prisoner {
    public String name, kota;
    public double height;
    public int sentence;
    
    public void setname (String name){
        this.name = name;
    }
    
    public String getname (){
        return name;
    }
    
    public void tambah (int bil1, int bil2){
        System.out.println("Hasil : "+(bil1+bil2));
    }
    
    public void tambah (int bil1, int bil2, int bil3){
        System.out.println("Hasil : "+(bil1+bil2+bil3));
    }
    
    public Prisoner(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    public Prisoner(String name, double height, int sentence, String kota){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.kota = kota;
    }
    public void setfield (String n, double h, int s){
        name = n;
        height = h;
        sentence = s;
    }
    public void think(){
        System.out.println("I'll have my revenge.");
    }//end method think
}// end class prisoner
