public  class tester{
  public static void main(String[] args) {
      RealNumber a= new RealNumber(0.00);
      RealNumber b= new RealNumber(0.00);
      RealNumber c= new RealNumber(0.0001);
      RealNumber d= new RealNumber(5.00);
      RealNumber e= new RealNumber(5.01);
      RealNumber f= new RealNumber(5.00);
      RealNumber g= new RealNumber(-5.00);
      RealNumber h= new RealNumber(-5.00);
 /* ----------------
 Testing equals
 -----------------*/
      System.out.println (a.equals(b));
      System.out.println (a.equals(c));
      System.out.println (a.equals(d));
      System.out.println (d.equals(e));
      System.out.println (f.equals(d));
      System.out.println (g.equals(h));

   }
}
