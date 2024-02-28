package BTH1;
public class SumOf2Numbers {
       private int a,b;
       SumOf2Numbers(int a,int b)
       {
        this.a = a;this.b = b;
       }
       public int sum()
       {
        return this.a + this.b;
       }
       public int sum1()
       {
        return this.a + this.b;
       }
      public static void main(String[] args) {
        SumOfTwoNumbers a = new SumOf2Numbers(5, 6);
          System.out.println(a.sum());
      }
}