"""Seção 03 - Exercício 06

Faça um algoritmo que pergunte o quanto você ganha por hora e o número de horas trabalhadas por
mês. Calcule e mostre o total do seu salário no referido mês."""

# entradas
ganho_por_hora = float(input("Quanto você ganha por hora?"))
horas_por_mes = int(input("Quantas horas você trabalhou neste mês?"))

# processamento
salario = ganho_por_hora * horas_por_mes

# saída
print("Neste mês seu salário será de R$ {0:.2f}".format(salario))
