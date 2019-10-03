"""Seção 06 - Exercício 07

Desenvolva um algoritmo que:
a) Leia 4 (quatro) números;
b) Calcule o quadrado de cada um;
c) Se o valor resultante do quadrado do terceiro número for >= 1000, imprima-o e finalize;
d) Caso contrario, imprima os valores lidos e seus respectivos quadrados.
"""

num1 = int(input("Defina o primeiro número: "))
num2 = int(input("Defina o segundo número: "))
num3 = int(input("Defina o terceiro número: "))
num4 = int(input("Defina o quarto número número: "))

q1 = num1 * num1
q2 = num2 * num2
q3 = num3 * num3
q4 = num4 * num4

if q3 >= 1000:
    print("O quadrado do terceiro número é maior ou igual a 1000: {0}".format(q3))
else:
    print("Número 1: {0}. Ao quadrado: {1}.".format(num1, q1))
    print("Número 2: {0}. Ao quadrado: {1}.".format(num2, q2))
    print("Número 3: {0}. Ao quadrado: {1}.".format(num3, q3))
    print("Número 4: {0}. Ao quadrado: {1}.".format(num4, q4))