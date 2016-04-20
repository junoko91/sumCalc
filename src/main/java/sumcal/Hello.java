package sumcal;

public class Hello {
	private int s=0;
	public void sum(int n) {
		for (int i=1; i<=n; i++) {
			s+=i;
		}
	}
	
	public int getResult() {
		return s;
	}
}
