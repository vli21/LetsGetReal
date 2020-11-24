public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(((double) nume) / deno);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (deno == 0){
         numerator = 0;
         denominator = 1;
      }
    else{
    if (deno< 0){
      numerator *= -1;
      denominator *= -1;
      }
    }
      reduce();
  }

  public double getValue(){
    return this.getValue();
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (this.numerator==other.numerator && this.denominator==other.denominator){
      return true;
    }
    else{
      return false;
    }
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    String fraction;
      if (numerator == 0){
         fraction = "0"+"/"+"1";
       }
      else{
         fraction = numerator + "/" + denominator;
       }
      return fraction;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    /*http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html*/
    /*int GCD=0;
    if (a<b){
      a=b;
      b=a;
    }
    int remainder =1;
    while(remainder>0){

      remainder = a%b;
      a=b;
      b=remainder;
      if(remainder==0){
        GCD=remainder;
      }
    }
    return GCD;*/
    int GCD=1;
    for (int i=1;i<=Math.min(a,b);i++){
      if (a%i==0&&b%i==0){
        GCD=i;
      }
    }
    return GCD;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    if (numerator != 0)
      {
         int GCD = gcd (Math.abs(numerator),denominator);

         numerator = numerator / GCD;
         denominator = denominator / GCD;
      }

  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber (numerator *other.getNumerator(), denominator * other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return multiply (other.reciprocal());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int deno = denominator * other.getDenominator();
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int numesum = nume1 + nume2;
    return new RationalNumber(numesum,deno);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int deno = denominator * other.getDenominator();
    int nume1 = numerator * other.getDenominator();
    int nume2 = other.getNumerator() * denominator;
    int numediff = nume1- nume2;
    return new RationalNumber(numediff,deno);
  }
}
