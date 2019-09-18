"""Seção 06 - Exercício 10

Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil-a = 5 a 7 anos
Infantil-b =  a 11 anos
Juvenil-a = 12 a 13 anos
Juvenil-b = 14 a 17 anos
Adultos = Maiores de 18 anos
"""

# entrada
idade = int(input("Qual a idade do nadador? "))

# processamento e saída
if idade < 5:
    print("A idade minima para competir é de 5 anos.")
elif idade >= 5 and idade <= 7:
    print("Categoria Infantil-A.")
elif idade >= 8 and idade <= 11:
    print("Categoria Infantil-B.")
elif idade >= 12 and idade <= 13:
    print("Categoria Juvenil-A.")
elif idade >= 14 and idade <= 17:
    print("Categoria Juvenil-B.")
elif idade > 18:
    print("Categoria Adultos.")



