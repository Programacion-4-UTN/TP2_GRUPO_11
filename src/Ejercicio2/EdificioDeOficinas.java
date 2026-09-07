package Ejercicio2;

public class EdificioDeOficinas implements Edificio{
	private double superficie;
	private int oficinas;
	
	public EdificioDeOficinas(double superficie, int numeroOficinas) {
        this.superficie = superficie;
        this.oficinas = numeroOficinas;
    }
	
	public int getOficinas() {return oficinas;}
	public double getSuperficieEdificio() {return superficie;}
	
	public void setOficinas(int oficinas) {this.oficinas = oficinas;}
	public void setSuperficieEdificio(double superficie) {this.superficie = superficie;}
}
