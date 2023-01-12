
public class Quadratic {
    public static void quad(int a, int b, int c){
        double ad = a + 0.0;
        double bd = b + 0.0; 
        double cd = c + 0.0; 
        double disc = bd * bd - 4 * ad * cd;
  // if the discriminate is less that 0 
      if (disc < 0 ){
        System.out.println("No real roots");
  // if the discriminate == 0 then there is one real root
      } else if (disc == 0){
        double result1 = (-bd + Math.sqrt(disc)) / (2 * ad);
        double result2 = (-bd - Math.sqrt(disc)) / (2 * ad);
        System.out.println(result1);
        System.out.println(result2);
      }else if (a == 0){
        double result = -cd / bd;
        System.out.println(result);
      } else {
  // 2 real roots
        double root1 = (-bd + Math.sqrt(disc)) / (2 * ad);
        double root2 = (-bd - Math.sqrt(disc)) / (2 * ad);
        System.out.println(root1);
        System.out.println(root2);

      }
    }
  
  
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        Quadratic.quad(a, b, c);
    }
  }