"""Seção 06 - Exercício 02

Elabore um aloritmo que leia um número. Se positivo, armazene-o em "a", se negativo, em "b".
No final, mostre o resultado."""

# entrada
n = int(input("Defina um valor para a variável N: "))

# processamento e saída

if n > 0:
    a = n
    print("Valor positivo")
    print(a)
else:
    b = n
    print("Valor negativo")
    print(b)
