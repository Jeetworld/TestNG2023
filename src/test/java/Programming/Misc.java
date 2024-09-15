package Programming;

public class Misc {

    static int finalAmount;

    public static void main(String[] args) {
        System.out.println("Hi This is Kamal");

        int i = 10;
        int ii= 10;

        int finalOutput = add(i,ii);

        int finalOutput01 = add(6,1);

        int finalOutput00 = add(5,5);




    }

    public static int add(int x, int y){
        finalAmount = x/y;
        return finalAmount;

    }

}
