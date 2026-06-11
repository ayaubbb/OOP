package lab1.task3;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public Temperature(double value) {
		this(value, 'C');
	}
	
	public Temperature(char scale) {
		this(0, scale);
	}
	
	public Temperature() {
		this(0, 'C');
	}
	
	public double getDegreesC(){
		if(this.scale == 'C') {
			return value;
		} else {
			return 5.0 * (value - 32.0) / 9.0;
		}
	}
	
	public double getDegreesF(){
		if(this.scale == 'F') {
			return value;
		} else {
			return 9.0 * (value / 5.0) + 32.0;
		}
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    
    public char getScale() {
        return scale; 
    }
}
