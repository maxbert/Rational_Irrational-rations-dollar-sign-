//hw #32 Rational
//max Bertifeld & Mathew So team Irrational-rations(dollar-sign)
//APCS pd 10
//11/17/15
public class Rational{
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator=1;
    }
    public Rational(int p, int q){
	numerator = p;
	if (q == 0){
	    System.out.println("you git, you can't divide by 0!");//I thought this was very clever, because mr brown told us git is british for idiot
	    numerator = 0;
	    denominator=1;
	}else {
	    denominator = q;
	}
    }
    //Print out the number as a string. 
    public String toString(){
	return "" + ((double)(1.0 * numerator/denominator));}
    //Convert the int/int into a single double
    public double floatValue(){
	return (((double) numerator)/denominator);}
    //change your fraction  into a new fraction while maintaing the multiplier
    public void multiply(Rational r){
	this.numerator = r.numerator * this.numerator;
	this.denominator = r.denominator * this.denominator;}
    //divide your fraction by a new one while maintaing the divisor
    public void divide(Rational r){
	this.numerator = r.denominator * this.numerator;
	this.denominator = r.numerator * this.denominator;}
    //add your fraction to a new one
    public void add(Rational r){
	this.numerator = this.numerator *  r.denominator + this.denominator * r.numerator;
	this.denominator *= r.denominator;
    }
    //subtract a new fraction from your old one
    public void subtract(Rational r){
        this.numerator = this.numerator *  r.denominator - this.denominator * r.numerator;
        this.denominator *= r.denominator;
    }
    //gcd - reused old code, uses Euclid's algorithm
    public static int gcd(Rational r){
        // switch inputs if b > a, because a must be >= b
        int a = r.numerator;
	int b = r.denominator;

	if (b > a){
            return gcd(b, a);
        } else {
            while((a % b) != 0){
                int holder = a; // hold the value of a before it is replaced with b
                a = b;
                b = (holder % b); // b is the original remainder
            }
	    return b;
	}
    }
    //reduce - uses gcd to reduce fraction
    public static void reduce(Rational r){
	int gcd = gcd(Rational r);
	r.denominator /= gcd;
	r.numerator /= gcd;
    }

}// end Rational
