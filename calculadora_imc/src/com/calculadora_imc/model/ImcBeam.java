package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBeam {
	private float peso;
	private float altura;
	public ImcBeam() {}
	public ImcBeam (String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+") == false ? 0f: Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = (altura.matches("[0-9.]+") == false ? 0f: Float.parseFloat(altura));
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String getResult() {
		Float imc = peso/(altura*altura);
		if (imc.isNaN())
			return "";
		
		StringBuilder result = new StringBuilder("Seu IMC é de: "+ new DecimalFormat("#.#").format(imc));
		
		if(imc < 18.5 ) {
			result.append("\n"+"Classificação: MAGREZA");
		}
		else if (imc >=18.5 && imc <= 24.9 ) {
			result.append("\n"+"Classificação: NORMAL");	
		}
		else if (imc >=25.0 && imc <= 29.9 ) {
			result.append("\n"+"Classificação: SOBREPESO");	
		}
		else if (imc >=30.0 && imc <= 39.9 ) {
			result.append("\n"+"Classificação: OBESIDADE");	
		}
		else if (imc >=40.0) {
			result.append("\n"+"Classificação: OBESIDADE GRAVE");	
		}
		
		return result.toString();
	}

	@Override
	public String toString() {
		return "Peso: " + peso + "\n"+ "Altura: " + altura+ "\n" + getResult();
	}	
}
