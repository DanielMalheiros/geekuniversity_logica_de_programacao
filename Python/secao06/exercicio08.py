"""Seção 06 - Exercicio 08

Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicando se este número
é par ou impar, e se é positivo ou negativo."""

# entrada
n = int(input("Informe um número inteiro:"))

# processamento e saída
if n > 0:
    if n % 2 == 0:
        print("O número {0} é par e positivo.".format(n))
    else:
        print("O número {0} é impar e positivo.".format(n))
elif n < 0:
    if n % 2 == 0:
        print("O número {0} é par e negativo.".format(n))
    else:
        print("O número {0} é impar e negativo.".format(n))
else:
    print("Número invalido.")
