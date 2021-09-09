package generic;

public class PrintMeterial<T extends MeterialWrap> {
	private T meterial;
	
	public PrintMeterial(T meterial) {
		setMeterial(meterial);
	}
	
	@Override
	public String toString() {
		return meterial.toString();
	}
	
	public void print() {
		meterial.doPrinting();
	}
	
	// getter, setter
	public T getMeterial() {
		return meterial;
	}

	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
}
