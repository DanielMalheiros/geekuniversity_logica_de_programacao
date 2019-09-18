"""Seção 07 - Exercício 01

Faça um algoritmo que determine o maior entre N números. A condição de parada é a entrada de um valor 0,
ou seja, o algoritmo deve continuar recebendo e calculando o maior valor até que a entrada seja 0 (zero)."""

# variáveis e entrada
n = int(input("Informe um número: "))
maior = -100000000000000

# processamento
while n != 0:
    if n > maior:
        maior = n
    n = int(input("Informe um número: "))

# saída
print("O maior valor informado foi {0}.".format(maior))
