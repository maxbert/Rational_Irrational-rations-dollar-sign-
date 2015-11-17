public class Rational(){
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
	    this();
	}else {
	    denominator = q;
	}
    }


}
