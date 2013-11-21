public class Rational {

    private int num;
    private int den;
    
    public Rational() {
	num = 0;
	den = 1;
    }

    public Rational(int x, int y) {
	if (y == 0) {
	    System.out.println("The denominator of a rational number cannot be 0. Setting rational number to 0/1");
	    num = 0;
	    den = 1;
	}
	else {
	    num = x;
	    den = y;
	}
    }

    public String toString() {
	String rtnstn = Integer.toString(num) + "/" + Integer.toString(den);
	return rtnstn;
    }

    public double floatValue() {
	double x = num;
	double y = den;
	return x/y;
    }

    public void multiply(Rational x) {
	num = num * x.num;
	den = den * x.den;
    }

    public void divide(Rational x) { //this doesn't quite work if I put the same Rational in, does it?
	num = num * x.den;
	den = den * x.num;
    }

    public static int gcd (int a, int b) {

	int base = 0;
	int r = 0;
	int r2 = 0;

	if (Stats.max(a,b) == a) {

	    base = a;
	    r = b;

	}
	else {

	    base = b;
	    r = a;

	}
	while (base%r != 0) {
	    System.out.print(base + ", " + r + ", ");
	    r2 = r;
	    r = base % r;
	    System.out.print(r + "\n");
	    base = r2;
	}
	return r;
    }

    public int compareTo(Rational x) {

	int result = 0;
	if (this.floatValue() > x.floatValue()){
	    result = -1;
	}
	if (this.floatValue() < x.floatValue()){
	    result = 1;
	}
	return result;
    }

	    

    public static void main (String[] args) {

	Rational case1 = new Rational();
	Rational case2 = new Rational(2,3);
	Rational case3 = new Rational(1,3);

	System.out.println(case1);
	System.out.println(case2);
	System.out.println(case3);

	System.out.println(case2.floatValue());

	case2.multiply(case2);
	System.out.println(case2);
	case2.divide(case3);
	System.out.println(case2);

    }

}
