package videoclubwebservice;

public class Cuenta implements java.io.Serializable {
    private String numCuenta;
    private Usuario usuario;
    private int balance;
    
    public void setNumCuenta(String numero) {
    	this.numCuenta=numero;
    }
    public void setUsuario(Usuario usuario) {
    	this.usuario=usuario;
    }
    public void setBalance(int balance) {
    	this.balance=balance;
    }
    public String getNumCuenta() {
    	return this.numCuenta;
    }
    public Titular getUsuario() {
    	return this.usuario;
    }
    public int getBalance() {
    	return this.balance;
    }
    public void ingresar(int cantidad) {
    		this.balance+=cantidad;
    }
    public void retirar(int cantidad)throws Exception {
    	if(cantidad>this.balance)
    		throw new Exception("Balance insuficiente!");
    		
    	else 
    		this.balance=this.balance-cantidad;
    	
    }
}
