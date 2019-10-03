"""Seção 07 - Exercício 05

Faça um programa que leia um nome de usuário e sua senha e não aceite
a senha igual ao nome do usúario, mostrando uma mensagem de erro e
voltando a pedir informações"""

# entrada
usuario = input("Defina o usuário: ")
senha = input("Informe a senha: ")

# processamento
while usuario == senha:
    print("Usuário e senha devem ser diferentes.")
    usuario = input("Defina o usuário: ")
    senha = input("Informe a senha: ")

