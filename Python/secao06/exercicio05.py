"""Seção 06 - Exercício 05

João, pescador, comprou um microcomputador para controlar o rendimento diário de
seu trabalho. Toda vez que ele traz um peso de peixes maior do que o permitido pelo
Estado (50 quilos), é cobrado uma multa de R$4,00 por quilo excedente. João precisa
que você faça um algoritmo que leia a variável "p" (peso de peixes) e verifique se
há excesso. Se houver, gravar na variável "e" (excesso) e na variável "m" a multa
que deverá ser paga. Caso contrário, mostrar essas variáveis como zero."""

# entrada
peso_de_peixes = int(input("Quantos quilos foram pescados? "))

# processamento e saída
if(peso_de_peixes > 50):
    e = "excesso"
    m = (peso_de_peixes - 50) * 4.00
    print("Você deverá pagar uma multa no valor de {0:.2f} reais.".format(m))
    print("Excesso de {0} quilos.".format(m - 50))
else:
    e = 0
    m = 0
    print("Multas: {0} reais". format(m))
    print("Excesso: {0} quilos".format(e))
