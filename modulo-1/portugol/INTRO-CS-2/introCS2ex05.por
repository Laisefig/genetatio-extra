programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3
		real mediaPonderada

		escreva("\nDigite a primeira nota da estudante: ")
		leia(nota1)
		escreva("\nDigite a segunda nota da estudante: ")
		leia(nota2)
		escreva("\nDigite a terceira nota da estudante: ")
		leia(nota3)

		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2+3+5)

		escreva("\nA média ponderada da estudante é: ", mediaPonderada)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */