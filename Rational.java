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
	    System.out.println("you idiot, you can divide by 0!");
	    numerator = 0;
	    denominator=1;
	}else {
	    denominator = q;
	}
    }
    public String toString(){
	return "" + (1.0 * numerator/denominator);}

    public double floatValue(){
	return (((double) numerator)/denominator);}

    public void multiply(Rational r){
	this.numerator = r.numerator * this.numerator;
	this.denominator = r.denominator * this.denominator;}

    public void divide(Rational r){
	this.numerator = r.denominator * this.numerator;
	this.denominator = r.numerator * this.denominator;}


}
