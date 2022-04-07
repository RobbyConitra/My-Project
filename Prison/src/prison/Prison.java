package prison;
import java.util.Scanner;
public class Prison {
    public static void main(String[] args) {
        String name;
        double height;
        int sentence;

        Scanner data = new Scanner (System.in);
        Prisoner buba = new Prisoner("Jordan", 1.5, 10, "batam");
        System.out.println(buba.name);
        buba.tambah (10, 10);
        buba.tambah (10, 10, 10);

        System.out.println("Name : ");
        name = data.nextLine();
        System.out.println("Height : ");
        height = data.nextDouble();
        System.out.println ("Sentence : ");
        sentence = data.nextInt();

        System.out.println("Prisoner Data");
        System.out.println("Name : "+name);
        System.out.println("Height : "+height);
        System.out.println("Sentence :"+sentence);
    }
}
