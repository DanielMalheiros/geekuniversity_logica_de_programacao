"""Seção 06 - Exercício 03

Leia um número e verifique se ele é par ou impar. Se par, armazena-lo em "p", se
impar, armazena-lo em "i". Exibir "p" e "i" no final do processamento."""

# variável
n = int(input("Escolha um número: "))
p = 0
i = 0

# processamento e saída
if n % 2 == 0:
    p = n
    print(p)
    print(i)
else:
    i = n
    print("O número {0} é impar.".format(i))
    print(p)
    print(i)

