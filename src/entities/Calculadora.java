package entities;

public class Calculadora {
	
	private double n1;
	private double n2;
	private char op;
	
	public Calculadora() {
		
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	public String operacao(char op) {
		double resultado;
		if(op == '-') {
			resultado = this.n1 - this.n2;
			return String.format("%.2f", resultado);
		}else if(op == '+') {
			resultado = this.n1 + this.n2;
			return String.format("%.2f", resultado);
		}else if(op == '*') {
			resultado = this.n1 * this.n2;
			return String.format("%.2f", resultado);
		}else if(op == '/') {
			if(this.n2 == 0) {
				return "Divisão por 0! ERRO!"; 
			}
			resultado = this.n1 / this.n2;
			return String.format("%.2f", resultado);
		}
		return "SIMBOLO INVALIDO!";
	}
	
}
