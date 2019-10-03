"""Seção 08 - Exercício 05

Faça um programa que carregue um vetor de dez números inteiros. Calcule e mostre os números superiores a
50 e suas respectivas posições. Mostrar mensagem se não existir nenhum número nesta condição."""

# variáveis

vetor = []
tem_maior_50 = False

# entrada
for n in range(0,10):
    num = int(input("Informe {} valor para o vetor:".format(n+1)))
    vetor.append(num)
for n in vetor:
    if n > 50:
        print("O número {0} está na posição {1} do vetor.".format(n, vetor.index(n)))
        # .index(n) mostrará a posição de n no vetor
        tem_maior_50 = True
if tem_maior_50 == False:
    print("Não existe valor maior que 50.")
