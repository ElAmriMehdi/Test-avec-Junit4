package ratio;

public class Rationnel {
	
	private int p; 
	private int q; 
	
	public Rationnel() {}
	
	public Rationnel(int p, int q){
		this.p = p; 
		this.q = q;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}
	
	
	public Rationnel addition(Rationnel r2){
		Rationnel result = new Rationnel();
		result.q = this.q * r2.q; 
		result.p = (this.p * r2.q) + (r2.p * this.q);
		return result;
	}
	
	public Rationnel soustraction(Rationnel r2){
		Rationnel result = new Rationnel();
		result.q = this.q * r2.q; 
		result.p = (this.p * r2.q) - (r2.p * this.q);
		return result;
	}
	
	private static int pgcd(int a, int b) {
		if (a < 0) a = -a;
		if (b < 0) b = -b;
		if (a == b) return a;
		else if (a > b) return pgcd (a-b, b);
		else if (b > a) return pgcd (a, b - a);
		return 1;
	}
	
	public Rationnel simplifier(){
		int pgcd = pgcd(this.p, this.q);
		this.p = p/pgcd;
		this.q = q/pgcd;
		return this;
	}
	
	public boolean equals(Object obj) {
		if(obj == null){
			return super.equals(obj);
		}
		else{
			Rationnel r1 = this.simplifier();
			Rationnel r2 = (Rationnel)obj;
			r2 = r2.simplifier();
			if(r1.p == r2.p && r1.q ==r2.q)return true; 
			else return false; 
		}
	}

	public String toString() {
		return this.p + "/" + this.q;
	}
	
}
