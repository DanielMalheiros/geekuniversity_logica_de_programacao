"""Seção 07 - Exercício 04

Construa um algoritmo que leia 10 valores inteiros e positivos e:
a) Encontre o maior valor
b) Encontre o menor valor
c) Calcule a média entre os valores
"""

# variáveis
maior = -999
menor = 999
soma = 0

# entrada e processamento
for n in range(1, 11):
    valor = int(input("Informe um valor: {0}/10".format(n)))
    if valor > 0:
        if valor > maior:
            maior = valor
        if valor < menor:
            menor = valor
        soma = soma + valor
    else:
        valor = int(input("Informe um valor positivo: "))
media = soma / 10

# saída
print("O maior número é {0}.".format(maior))
print("O menor número é {0}.".format(menor))
print("A média entre os números é {0}.".format(media))
