public class ThreeEqual {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("you only provided " + args.length + " arguments out of 3");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == c && a == b){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}