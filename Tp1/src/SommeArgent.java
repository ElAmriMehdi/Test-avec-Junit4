
public class SommeArgent {
	
	private int quantite;
	private String unite;
	
	public SommeArgent(int amount, String currency){
		quantite = amount;
		unite = currency;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public String getUnite() {
		return unite;
	}
	
	public SommeArgent add(SommeArgent m) throws UniteDistincteException{
		if (!m.getUnite().equals(this.getUnite())) {
			throw new UniteDistincteException(this, m);
		}
		else 
			return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return super.equals(obj);
		}
		else {
			SommeArgent S = (SommeArgent) obj;
			if (this.getQuantite()==S.getQuantite() && this.getUnite().equals(S.getUnite()))
				return true;
			else 
				return false;
		}
		
	}

}
