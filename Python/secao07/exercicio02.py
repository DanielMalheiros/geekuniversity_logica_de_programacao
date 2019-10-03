"""Seção 07 - Exercício 02

Faça um algoritmo que conte de 1 até 100 e a cada múltiplo de 10 emita uma mensagem: "Múltiplo de 10". """

# processamento e saída
for n in range(1,101):
    print(n)
    if n % 10 == 0:
        print("Múltiplo de 10")
