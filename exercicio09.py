"""Seção 06 - Exercício 9

A secretaria do meio ambiente que controla o indice de poluiçao mantem 3 grupos
de indústrias que são altamente poluentes. O índice de poluião aceitavel varia
de 0,05 a 0,25. Se o indice crescer para 0,3, as industrias do primeiro grupo
são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as
indústrias do primeiro e segundo grupo devem suspender suas atividades. Se o
índice atingir 0,5, todos os grupos devem suspender suas atividades. Faça um
algoritmo que leia o índice de poluição medido e emita a notificação adequada
aos diferentes grupos de indústrias."""

# entrada
indice = float(input("Qual o índice de poluição?"))

#processamento e saída
if indice < 0.3:
    print("Indice de poluição dentro dos níveis aceitaveis.")
elif indice >= 0.3 and indice < 0.4:
    print("Atenção: indústrias do primeiro grupo devem suspender as atividades.")
elif indice >= 0.4 and indice < 0.5:
    print("Atenção: indústrias do primeiro e segundo grupo devem suspender as atividades.")
elif indice >= 0.5:
    print("Atenção: todas os grupos de indústrias devem suspender suas atividades.")