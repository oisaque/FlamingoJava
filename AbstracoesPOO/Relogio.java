package orientacaoAObjetos;

public class Relogio {
	String marca = "Apple", linha = "Series 3", modelo = "Watch", telaTatil = "Sim", materialCaixa = "Alumínio", 
	corCaixa= "Cinza-Espacial", wifi = "Sim", bluetooth = "Sim", tipoPulseira = "Esportiva", corPulseira = " Preto",
	memoria = "8 gb", duracaoBateria = "8 Horas";
	float preco = 1300.00f;
	
	public static void main(String[] args) {
		Relogio cadastroRelogio = new Relogio();
		System.out.println("Marca: "+cadastroRelogio.marca);
		System.out.println("Linha: "+cadastroRelogio.linha);
		System.out.println("Modelo: "+cadastroRelogio.modelo);
		System.out.println("Tela Tátil? "+cadastroRelogio.telaTatil);
		System.out.println("Material da Caixa: "+cadastroRelogio.materialCaixa);
		System.out.println("Cor da Caixa: "+cadastroRelogio.corCaixa);
		System.out.println("Wifi? "+cadastroRelogio.wifi);
		System.out.println("Bluetooth? "+cadastroRelogio.bluetooth);
		System.out.println("Tipo da Pulseira: "+cadastroRelogio.tipoPulseira);
		System.out.println("Cor da Pulseira: "+cadastroRelogio.corPulseira);
		System.out.println("Memória: "+cadastroRelogio.memoria);
		System.out.println("Duração da Bateria: "+cadastroRelogio.duracaoBateria);
		System.out.println("Preço: "+cadastroRelogio.preco);
	}
}
