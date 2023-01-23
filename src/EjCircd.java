
public class EjCircd{
	public double r;
	
	public EjCircd(){
		this(160808);
	}
	public EjCircd(double rcir) {
		r=rcir;
	}
	
	public double calcCirc()
	{
		return 3.1416*2*r;
	}
	public double calcAreac()
	{
		return 3.1416*(Math.pow(r, 2));
	}
	public void radioDife(double o) {
		r=o;
	}
}
