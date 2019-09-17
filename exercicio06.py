"""Seção 08 - Exercício 06

Faça um programa que receba um código númerico inteiro e um vetor de cinco posições
de números reais. Se o código for zero, termine o programa. Se o código for 1, mostre
o vetor na ordem direta. Se o código for 2, mostre o vetor na ordem inversa."""

# variável
vetor = []

# entrada
codigo = int(input("Informe o código: "))


# processamento e saída
if codigo != 0:
    if codigo != 1 and codigo != 2:
        print("Codigo inválido.")
        codigo = int(input("Informe o código: "))
    for n in range(0, 5):
        num = float(input("Informe um valor real para o vetor:"))
        vetor.append(num)
    if codigo == 1:
        for n in vetor:
            print(n)
    elif codigo == 2:
        vetor.reverse()
        for n in vetor:
            print(n)
