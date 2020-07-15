public class pdq {
    public static void main(String[] args){
	double d = 3.14;
	int pi = 3;
	d = pi + pi + d;
	boolean b;
	System.out.println(pi);
	int D = 14;
	b = true;
	pi = D + 21;
	D = pi - 21;
	b = false;
	String q;
	System.out.println("What's D again? " + d);
	System.out.println("What about p? " + D);
	System.out.println("Wait does p even exist?");
	int p = 0;
	q = "What's D again? " + b;
	String P = "I don't know what's going on.";
	P = P + " Wait... " + q;
	String B = "Wait I think p does exist: " + p;
	System.out.println(q);
	p = 53;
	System.out.println(P + P);
	System.out.println(P + d);
	B = B + p;
	System.out.println(B);
    }
}