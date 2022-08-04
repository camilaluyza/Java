
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if(idade >= 18) { // Pode simplificar fazendo dessa forma assim reduz o codigo  if(idade >= 18 || quantidadePessoas >=2) ou $$ condição, exemplo : você não pode entrar sozinho
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		}
		
		else {
			if(quantidadePessoas >+ 2) {
				System.out.println("Você não tem 18, mas pode entrar" + "pois está acompanhado");
			}else {
				System.out.println("Infelizmente você não pode entrar");
			}
			
		}
		
	}

}
