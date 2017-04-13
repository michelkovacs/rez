# language: pt
Funcionalidade: Validar uma solu��o
	
	* O tamho da matriz � igual ao n�mero de fus�es desejadas, chamaremos de F
	* A largura da matriz � igual ao n�mero m�ximo de zonas que podem se fundir entre si , chamaremos de M
	* As combina��es s�o feitas em pares dois a dois de poss�veis fus�es, ex:
		1-2, 2-3, 3-4 .... com tamanho F

	* Devemos alocar as combina��es em uma matriz F x M
	
	Solu��o v�lida:
		* O numero m�xio de colunas na matriz de solucao nao pode ultrapassar M
		* Um n�mero de zona s� pode aparecer em uma linha da matriz

	Contexto:
		Dado que temos 10 zonas: (1,2,3,4,5,6,7,8,9,10)
		E que temos a seguinte lista de vizinhan�as:
			1-2,1-3,1-5,1-9,1-10,2-6,2-7,3-4,3-5,3-6,5-6,5-8,7-8
	
	Cenario: Solu��o inv�lida por n�mero de zonas fundidas em uma �nica ser maior que M
		
		E que queremos fazer 4 fus�es com maximo de 3 zonas fundidas em uma nova
		E que temos a seguinte combina��o de fus�es:
			1-3, 1-5, 5-6, 7-8
		E ao gerarmos a matriz resultante, temos o seguinte resultado:
			| 1  | 3  | 5  | 6 |
			| 7  | 8  | -  |   |
			| -  | -  | -  |   |
		Quando validamos a matriz temos que � INV�LIDA, pelo n�mero de colunas ser maior que M



	Cenario: Solu��o inv�lida se uma zona aparecer em mais de uma linha da matriz
		E que queremos fazer 6 fus�es com maximo de 3 zonas fundidas em uma nova
		E que temos a seguinte combina��o de fus�es:
			1-9, 1-10, 2-6, 2-7, 3-5, 3-6
		E ao gerarmos a matriz resultante, temos o seguinte resultado:
			| 1  | 9  | 10 |
			| 2  | 6  | 7  |
			| 3  | 5  | 6  |
		Quando validamos a matriz temos que � INV�LIDA, pois a zona 6 aparece em 2 linhas da matriz