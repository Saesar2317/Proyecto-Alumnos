package Alumnos;

public class Alumno extends Persona
{
	private String NumCntrl;
	private char CarreraS;
	private char CarreraT;
	private int Calf1;
	private int Calf2;
	private int Calf3;
	private int Calf4;
	private double Promedio;
	
	public Alumno() 
	{}
	public Alumno(String nombre, char genero, String NCtrl, char carreraS, char carreraT, int calf1, int calf2, int calf3, int calf4, double promedio) {
		super(nombre, genero);
		NumCntrl = NCtrl;
		CarreraS = carreraS;
		CarreraT = carreraT;
		Calf1 = calf1;
		Calf2 = calf2;
		Calf3 = calf3;
		Calf4 = calf4;
		Promedio = promedio; 
	}
	public String getNumCntrl() {
		return NumCntrl;
	}
	public void setNumCntrl(String numCntrl) {
		NumCntrl = numCntrl;
	}
	public char getCarreraS() {
		return CarreraS;
	}
	public void setCarreraS(char carreraS) {
		CarreraS = carreraS;
	}
	public char getCarreraT() {
		return CarreraT;
	}
	public void setCarreraT(char carreraT) {
		CarreraT = carreraT;
	}
	public int getCalf1() {
		return Calf1;
	}
	public void setCalf1(int calf1) {
		Calf1 = calf1;
	}
	public int getCalf2() {
		return Calf2;
	}
	public void setCalf2(int calf2) {
		Calf2 = calf2;
	}
	public int getCalf3() {
		return Calf3;
	}
	public void setCalf3(int calf3) {
		Calf3 = calf3;
	}
	public int getCalf4() {
		return Calf4;
	}
	public void setCalf4(int calf4) {
		Calf4 = calf4;
	}
	public double getPromedio() {
		return Promedio;
	}
	public void setPromedio(double promedio) {
		Promedio = promedio;
	}
	
	
	


}
