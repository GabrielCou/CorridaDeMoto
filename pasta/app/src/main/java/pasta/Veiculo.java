package pasta;

public class Veiculo {
	String cor;
	IMotor motor;

	public Veiculo(IMotor m) {
		this.motor = m;
	}

	public String acelerar(int intensidade) {
		return this.motor.acelerar(intensidade);
		
	}
	
}
