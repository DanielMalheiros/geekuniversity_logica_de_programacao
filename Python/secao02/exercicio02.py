"""Seção 02 - Exercício 02

Faça um algoritmo para somar dois números e multiplicar o resultado
pelo primeiro número
"""

# entradas
num1 = int(input("Informe o primeiro número: "))
num2 = int(input("Informe o segundo número: "))

# processamento
soma = num1 + num2
multiplicacao = soma * num1

# saída
print("O resultado da multiplicação é {0}.".format(multiplicacao))
