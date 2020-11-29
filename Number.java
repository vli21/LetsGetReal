public abstract class Number{
  public abstract double getValue();

  /*return 0 when this Number equals the other Number
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    int compare=0;
    double a=this.getValue();
    double b=other.getValue();
    if (a==b){
      compare=0;
    }
    if (a-b>0){
      compare=1;
    }
    if (a-b<0){
      compare=-1;
    }
    return compare;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    double a=this.getValue();
    double b=other.getValue();
    if ((a !=0 ||b !=0)&&
    ((Math.abs((a-b))/b)*100.0)<=0.001){
      return true;
    }
    if (a==0 && b==0){
      return true;
    }
    else{
      return false;
    }
  }

}
