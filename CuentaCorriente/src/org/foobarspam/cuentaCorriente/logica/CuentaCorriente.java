package org.foobarspam.cuentaCorriente.logica;

public class CuentaCorriente {
	
	//---------------PROPIEDADES---------------
	private String nombre = null;
	private String apellidos = null;
	private String dni = null; //pendiente de hacer clase dni
	private String direccion = null;
	private String telefono = null;
	private double saldo = 0.0d;
	
	//---------------CONSTRUCTORES---------------
	public CuentaCorriente(){
	}
	public CuentaCorriente(String nombre, String apellidos,String dni, String direccion, String telefono, double saldo){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.saldo = saldo;
	}
	
	//---------------SETTERS AND GETTERS---------------
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellidos(){
		return this.apellidos;
	}
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public String getDni(){
		return this.dni;
	}
	public void setDni(String dni){
		this.dni = dni;
	}
	public String getDireccion(){
		return this.direccion;
	}
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	public String getTelefono(){
		return this.telefono;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	//---------------METODOS---------------
	public void retirarDinero(int saldoRetirado) {
		setSaldo(this.saldo - saldoRetirado);
	}
	public void ingresarDinero(int saldoIngresado) {
		setSaldo(this.saldo + saldoIngresado);
	}
	public void consultarCuenta() {
		System.out.println("Nombre:" +getNombre()+ "\nApellidos: " + getApellidos() +"\nDNI: " + getDni() + "\nDireccion: " + getDireccion() + "\nTelefono: " + getTelefono() + "\nSaldo: " + getSaldo());
	}
	public boolean saldoNegativo() {
		boolean saldoNegativo = false;
		if (getSaldo() < 0){
			saldoNegativo = true;
			return saldoNegativo;
		}
		return saldoNegativo;
	}
	
}
