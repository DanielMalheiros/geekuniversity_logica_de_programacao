"""Seção 07 - Exercício 07

Sua organização acaba de contratar um estágiario para trabalhar no Suporte de Informática, com a
intenção de fazer um levantamento nas sucatas encontradas nesta área. A primeira tarefa dele será
testar todos os cerca de 200 mouses que se encontraram lá, testando e anotando o estado de cada um
deles para verificar o que se pode aproveitar deles. Foi requisitado que você desenvolva um programa
para registrar este levantamento. O programa deverá receber um número indeterminado de entradas, cada
uma contendo um numero de identificação do mouse e o tipo de defeito:
-Necessita de esfera;
-Necessita de limpeza;
-Necessita de troca de cabo ou conector
-Quebrado ou inutilizado.

Uma identificação igual a zero encerra o programa. Ao final o programa deverá emitir o seguinte relatório:
Quantidade de mouses: 100
Situação                                      Quantidade      Percentual
1-Necessidade de esfera                          40              40%
2-Necessita de limpeza                           30              30%
3-Necessita de troca de cabo ou conector         15              15%
4-Quebrado ou inutilizado                        15              15%
"""

# variáveis
contador_total = 0
contador_sit_1 = 0
contador_sit_2 = 0
contador_sit_3 = 0
contador_sit_4 = 0

# entrada s

identificador = int(input("Informe a identificação do mouse: "))

while identificador != 0:
    print("1-Necessidade de esfera")
    print("2-Necessita de limpeza")
    print("3-Necessita de troca de cabo ou conector")
    print("4-Quebrado ou inutilizado")
    defeito = int(input("Informe o tipo de defeito do mouse ID {0}:".format(identificador)))

# processamento
    if defeito == 1:
        contador_sit_1 = contador_sit_1 + 1
    elif defeito == 2:
        contador_sit_2 = contador_sit_2 + 1
    elif defeito == 3:
        contador_sit_3 = contador_sit_3 + 1
    elif defeito == 4:
        contador_sit_4 = contador_sit_4 + 1
    elif defeito != 1 and defeito != 2 and defeito != 3 and defeito != 4:
        contador_total = contador_total - 1
        defeito = int(input("Número inválido. Informe o tipo de defeito do mouse ID {0}:".format(identificador)))
    contador_total = contador_total+1
    identificador = int(input("Informe a identificação do mouse: "))

p1 = (contador_sit_1 / contador_total) * 100
p2 = (contador_sit_2 / contador_total) * 100
p3 = (contador_sit_3 / contador_total) * 100
p4 = (contador_sit_1 / contador_total) * 100

print("Quantidade de mouses: {0}:".format(contador_total))
print("Situação                                       Quantidade       Percentual")
print("1- Necessidade de esfera                          {0}            {1:.2f}%".format(contador_sit_1, p1))
print("2- Necessidade de limpeza                         {0}            {1:.2f}%".format(contador_sit_2, p2))
print("3- Necessidade de troca de cabo/conector          {0}            {1:.2f}%".format(contador_sit_3, p3))
print("4- Quebrado ou inutilizado                        {0}            {1:.2f}%".format(contador_sit_4, p4))

