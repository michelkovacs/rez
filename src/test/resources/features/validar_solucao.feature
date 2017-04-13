# language: pt
Funcionalidade: Validar uma solução
	
	* O tamho da matriz é igual ao número de fusões desejadas, chamaremos de F
	* A largura da matriz é igual ao número máximo de zonas que podem se fundir entre si , chamaremos de M
	* As combinações são feitas em pares dois a dois de possíveis fusões, ex:
		1-2, 2-3, 3-4 .... com tamanho F

	* Devemos alocar as combinações em uma matriz F x M
	
	Solução válida:
		* O numero máxio de colunas na matriz de solucao nao pode ultrapassar M
		* Um número de zona só pode aparecer em uma linha da matriz

	Contexto:
		Dado que temos 10 zonas: (1,2,3,4,5,6,7,8,9,10)
		E que temos a seguinte lista de vizinhanças:
			1-2,1-3,1-5,1-9,1-10,2-6,2-7,3-4,3-5,3-6,5-6,5-8,7-8
	
	Cenario: Solução inválida por número de zonas fundidas em uma única ser maior que M
		
		E que queremos fazer 4 fusões com maximo de 3 zonas fundidas em uma nova
		E que temos a seguinte combinação de fusões:
			1-3, 1-5, 5-6, 7-8
		E ao gerarmos a matriz resultante, temos o seguinte resultado:
			| 1  | 3  | 5  | 6 |
			| 7  | 8  | -  |   |
			| -  | -  | -  |   |
		Quando validamos a matriz temos que é INVÁLIDA, pelo número de colunas ser maior que M



	Cenario: Solução inválida se uma zona aparecer em mais de uma linha da matriz
		E que queremos fazer 6 fusões com maximo de 3 zonas fundidas em uma nova
		E que temos a seguinte combinação de fusões:
			1-9, 1-10, 2-6, 2-7, 3-5, 3-6
		E ao gerarmos a matriz resultante, temos o seguinte resultado:
			| 1  | 9  | 10 |
			| 2  | 6  | 7  |
			| 3  | 5  | 6  |
		Quando validamos a matriz temos que é INVÁLIDA, pois a zona 6 aparece em 2 linhas da matriz