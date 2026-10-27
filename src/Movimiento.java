
public class Movimiento {
		   
	   public enum Signo {D, H}
	   
	   private Double importe;
	   private Signo signo;
	   private String detalle;
	   
	   public Movimiento(Double Importe, Signo Signo, String Detalle) {
	      this.importe = Importe;
	      this.signo = Signo;
	      this.detalle = Detalle;
	   }
	   
	   	public Double getImporte() {
	   		return importe;
        }
	    
	    public Signo getSigno() {
	        return signo;
	    }
	    
	    public String getDetalle() {
	        return detalle;
	    }
}
