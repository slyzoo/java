public class main3 {
    public static void main(String[] args) {
        String x = "water";
        String y = "kool_aid";
        String temp;

        temp=x;
        x=y;
        y=temp;

// x=y; makes it where  it says:
//     water
//     water
//
// y=x makes it where it says
//     kool_aid
//     kool_aid

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

}
