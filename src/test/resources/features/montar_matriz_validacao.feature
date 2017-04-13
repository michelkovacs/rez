# language: pt
Funcionalidade: Montar matriz de valida��o
  Fazer o parse de um texto de combina��es e gerar uma matriz para ser usada pelo algoritmo de valida��o
  das solu��es

  Contexto: 
    Dado que o m�ximo de zonas em uma fus�o � 3 (M=3)
    E que temos 10 zonas em uma regi�o: (1,2,3,4,5,6,7,8,9,10)
    E que temos a seguinte lista de vizinhan�as: 1-2,1-3,1-5,1-9,1-10,2-6,2-7,3-4,3-5,3-6,5-6,5-8,7-8
    E que desejamos fazer 4 fus�es
    E que desejamos criar a matriz de valida��o

  Cen�rio: (1) Simples - combina��es onde teremos 2 elementos em cada linha da matriz
    E temos as combina��es:	"|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|"
    Quando gerarmos a matriz de valida��o
    Ent�o temos o seguinte resultado:
      | 1 | 2 | - |
      | 3 | 4 | - |
      | 5 | 6 | - |
      | 7 | 8 | - |

  Cen�rio: (2) Combina��es onde teremos 3 elementos em ao menos uma linha da matriz
    E temos as combina��es: "|(1)-(2)|,|(2)-(4)|,|(5)-(6)|,|(7)-(8)|"
    Quando gerarmos a matriz de valida��o
    Ent�o temos o seguinte resultado:
      | 1 | 2 | 4 |
      | 5 | 6 | - |
      | 7 | 8 | - |
      | - | - | - |

  Cen�rio: (3) Combina��es onde teremos 1 zona se repetindo em mais de uma linha da matriz
    E temos as combina��es: "|(1)-(2)|,|(2)-(4)|,|(2)-(5)|,|(5)-(6)|"
    Quando gerarmos a matriz de valida��o
    Ent�o temos o seguinte resultado:
      | 1 | 2 | 4 |
      | 2 | 5 | 6 |
      | - | - | - |
      | - | - | - |
      
  Cen�rio: (4) Combina��es onde que geram mais colunas que o m�ximo permitido M
    E temos as combina��es: "|(1)-(2)|,|(2)-(4)|,|(4)-(5)|,|(7)-(8)|"
    Quando gerarmos a matriz de valida��o
    Ent�o temos o seguinte resultado:
      | 1 | 2 | 4 | 5 |
      | 7 | 8 | - | - | 
      | - | - | - | - |
      | - | - | - | - |
