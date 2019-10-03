"""Seção 06 - Exercício 06

Elabore um algoritmo que leia as varíaveis "c" e "n", respectivamente código e número de horas trabalhadas
de um operário. Calcule o salário sabendo-se que ele ganha R$10,00 por hora. Quando o número de horas
trabalhadas exceder a 5, calcule o excesso de pagamento armazenando-o na variável "e". Caso contrario,
zerar tal variável. A hora excedente de trabalho vale R$20,00. No final do processamento, imprima o
salário total e o salário excedente."""

# variáveis
valor_hora = 10.00
valor_hora_excedente = 20.00
e = 0

# entradas
c = int(input("Informe seu código: "))
n = float(input("Quantas horas você trabalhou neste mês? "))

# processamento
if n > 50:
    e = (n - 50) * valor_hora_excedente
    salario_total = 50 * valor_hora + e
    print("Salario base: R${0:.2f}   Salário excedente: R${1:.2f}".format(50 * 10, e))
    print("Salário total: R${0:.2f}".format(salario_total))
else:
    print("Salário total: R${0:.2f}".format(n * 10))
    print("Salário excedente: R${0:.2f}".format(e))
