import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	
	private String numero;
	private double saldo;
	private String titular;
    private List<Movimiento> movs;
	
	public Cuenta(double saldoInicial) {
		this.saldo=saldoInicial;
		this.movs = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(double i){
		this.saldo+=i;
		this.movs.add(new Movimiento(i, Movimiento.Signo.H, "Ingreso en cuenta"));
			
	}
	public void reintegro(double i) {
		if (this.saldo - i >= -500.0) {
            this.saldo -= i;
            this.movs.add(new Movimiento(i, Movimiento.Signo.D, "Reintegro en cuenta"));
        } else {
            System.out.println("Fondos insuficientes (saldo " + this.saldo + "€) para el reintegro de " + i + "€");
        }	
	}
	
	public String getNumero() {
        return numero;
    }
	
	public void setNumero(String numero) {
        this.numero = numero;
    }
	
	public String getTitular() {
        return titular;
    }
	
	public void setTitular(String titular) {
        this.titular = titular;
    }
	
	public List<Movimiento> getMovimientos() {
        return movs;
    }

}
