import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variaveis
		Scanner teclado = new Scanner(System.in);
		String direcao;
		int distancia;
		
//passso1
		System.out.println("O primeiro passo é para a direita");
		System.out.println("Informe a distancia ");
		distancia=teclado.nextInt();
		
		if (distancia!=4) 
			System.out.println("Errou o caminho! Programa encerrado");
		
//passo 2
		
		else {	
			System.out.println("Prossiga para o proximo passo");
			System.out.println("Informe a direção");
			direcao=teclado.next();
			
			if (!direcao.equalsIgnoreCase("tras")) 
				System.out.println("Errou o caminho! Programa encerrado");
			
			else {
				System.out.println("Informe a distancia ");
				distancia=teclado.nextInt();
				
				if (distancia!=3) 
					System.out.println("Errou o caminho! Programa encerrado");
//passo 3				
				else {
					System.out.println("Prossiga para o proximo passo");
					System.out.println("Informe a direção ");
					direcao=teclado.next();
					
					if (!direcao.equalsIgnoreCase("direita")) 
						System.out.println("Errou o caminho! Programa encerrado");
					
					else {
						System.out.println("Informe a distancia ");
						distancia=teclado.nextInt();
						
						if (distancia!=2) 
							System.out.println("Errou o caminho! Programa encerrado");
//passo 4						
						else {
							System.out.println("Prossiga para o proximo passo");
							System.out.println("Informe a direção ");
							direcao=teclado.next();
							
							if (!direcao.equalsIgnoreCase("frente")) 
								System.out.println("Errou o caminho! Programa encerrado");
							
							else {
								System.out.println("Informe a distancia ");
								distancia=teclado.nextInt();
								
								if (distancia!=4) 
									System.out.println("Errou o caminho! Programa encerrado");
//passo 5								
								else {
									System.out.println("Prossiga para o proximo passo");
									System.out.println("Informe a direção ");
									direcao=teclado.next();
									
									if (!direcao.equalsIgnoreCase("direita")) 
										System.out.println("Errou o caminho! Programa encerrado");
									
									else {
										System.out.println("Informe a distancia ");
										distancia=teclado.nextInt();
										
										if (distancia!=5) 
											System.out.println("Errou o caminho! Programa encerrado");
//passo 6									
										else {
											System.out.println("Prossiga para o proximo passo");
											System.out.println("Informe a direção ");
											direcao=teclado.next();
											
											if (!direcao.equalsIgnoreCase("tras")) 
												System.out.println("Errou o caminho! Programa encerrado");
											
											else {
												System.out.println("Informe a distancia ");
												distancia=teclado.nextInt();
												
												if (distancia!=6) 
													System.out.println("Errou o caminho! Programa encerrado");
												
												else {
													System.out.println("Parabens vc terminou o trajeto!!!");
													}
												}
											}
										}
									
									}
								
								}
							}
							
						}

					}
				
				}
			
			}
		
	}

}
