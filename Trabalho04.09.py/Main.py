#Iago Vargas
from geradores import Util
from ordenacao import Ordenacao
import random

# Listas inicializadas vazias
lista_bubble_sort = []
lista_insertion_sort = []
lista_selection_sort = []
lista_sorted = []

quantidade_estudantes = 60000  # Total de 60 mil estudantes gerados.

tamanho_nome = random.randint(3, 4)  # Tamanho dos nomes será aleatório entre 3 e 4 caracteres.

# Gerando os nomes e idades.
Util.gerar_nomes_e_idades_para_lista(lista_bubble_sort, quantidade_estudantes, tamanho_nome)
Util.gerar_nomes_e_idades_para_lista(lista_selection_sort, quantidade_estudantes, tamanho_nome)
Util.gerar_nomes_e_idades_para_lista(lista_insertion_sort, quantidade_estudantes, tamanho_nome)
Util.gerar_nomes_e_idades_para_lista(lista_sorted, quantidade_estudantes, tamanho_nome)

# ----------------------------------------------------- #

print("\n==== Lista Bubble Sort ORDENADA ====\n")
Ordenacao.metodo_bolha(lista_bubble_sort)
for estudante in lista_bubble_sort:
    print(estudante)

