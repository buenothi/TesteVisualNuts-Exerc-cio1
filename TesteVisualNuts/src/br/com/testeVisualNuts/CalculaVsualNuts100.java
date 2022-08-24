package br.com.testeVisualNuts;


public class CalculaVsualNuts100 implements CalculaVisualNuts {
	
	private int quantidadeLaços = 100;

	@Override
	public void calcular() {
		
		for (int i = 1; i <= quantidadeLaços; i++) {

			if (((i % 3) == 0) & (i % 5) == 0) {
				System.out.println("Visual Nuts");
			} else if ((i % 3) == 0) {
				System.out.println("Visual");
			} else if ((i % 5) == 0) {
				System.out.println("Nuts");
			} else {
				System.out.println(i);
			}
		}

	}

}