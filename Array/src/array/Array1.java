package array;
public class Array1 {
    public static void main(String[] args) {
        String nama[] = new String[10];
        int umur[] = new int[4];
        umur[0] = 25;
        umur[2] = 10;
        
        nama[0] = "Robby";
        nama[1] = "Delvin";
        nama[2] = "Erwin";
        
        int age[]={12,16,23,40};
        
        System.out.println("age 2 : "+age[2]);
        System.out.println("umur 0 : "+umur[0]);
        System.out.println("umur 2 : "+umur[2]);
        System.out.println("umur 3 : "+umur[3]);
        
        System.out.println("nama 0 : "+nama[0]);
        System.out.println("nama 1 : "+nama[1]);
        System.out.println("nama 2 : "+nama[2]);
        
        System.out.println("Panjang Array Age : "+age.length);
        
        for(int a=0; a<age.length; a++){
            System.out.println("isi data : "+age[a]);
        }
        
        for(int a=0; a<nama.length; a++){
            System.out.println("nama : "+nama[a]);
        }
        
        for(int u:age){
            System.out.println("umur : "+u);
        }
    }
}
