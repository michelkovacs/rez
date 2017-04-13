# language: pt
Funcionalidade: Montar matriz de validação
  Fazer o parse de um texto de combinações e gerar uma matriz para ser usada pelo algoritmo de validação
  das soluções

  Contexto: 
    Dado que o máximo de zonas em uma fusão é 3 (M=3)
    E que temos 10 zonas em uma região: (1,2,3,4,5,6,7,8,9,10)
    E que temos a seguinte lista de vizinhanças: 1-2,1-3,1-5,1-9,1-10,2-6,2-7,3-4,3-5,3-6,5-6,5-8,7-8
    E que desejamos fazer 4 fusões
    E que desejamos criar a matriz de validação

  Cenário: (1) Simples - combinações onde teremos 2 elementos em cada linha da matriz
    E temos as combinações:	"|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|"
    Quando gerarmos a matriz de validação
    Então temos o seguinte resultado:
      | 1 | 2 | - |
      | 3 | 4 | - |
      | 5 | 6 | - |
      | 7 | 8 | - |

  Cenário: (2) Combinações onde teremos 3 elementos em ao menos uma linha da matriz
    E temos as combinações: "|(1)-(2)|,|(2)-(4)|,|(5)-(6)|,|(7)-(8)|"
    Quando gerarmos a matriz de validação
    Então temos o seguinte resultado:
      | 1 | 2 | 4 |
      | 5 | 6 | - |
      | 7 | 8 | - |
      | - | - | - |

  Cenário: (3) Combinações onde teremos 1 zona se repetindo em mais de uma linha da matriz
    E temos as combinações: "|(1)-(2)|,|(2)-(4)|,|(2)-(5)|,|(5)-(6)|"
    Quando gerarmos a matriz de validação
    Então temos o seguinte resultado:
      | 1 | 2 | 4 |
      | 2 | 5 | 6 |
      | - | - | - |
      | - | - | - |
      
  Cenário: (4) Combinações onde que geram mais colunas que o máximo permitido M
    E temos as combinações: "|(1)-(2)|,|(2)-(4)|,|(4)-(5)|,|(7)-(8)|"
    Quando gerarmos a matriz de validação
    Então temos o seguinte resultado:
      | 1 | 2 | 4 | 5 |
      | 7 | 8 | - | - | 
      | - | - | - | - |
      | - | - | - | - |
