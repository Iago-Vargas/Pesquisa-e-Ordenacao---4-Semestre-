#Iago Vargas
import random

class Util:

    @staticmethod
    def gerar_nome_e_idade(tamanho_nome):
        """
        Gera um nome e uma idade aleatórios para um estudante.

        :param tamanho_nome (int): O número de caracteres do nome gerado.
        :return: Uma tupla contendo o nome do estudante e a idade do estudante.
        """
        letras = 'abcdefghijklmnopqrstuvwxyz'
        nome_gerado = ''

        for _ in range(tamanho_nome):
            letra_sorteada = letras[random.randint(0, len(letras) - 1)]
            nome_gerado += letra_sorteada

        idade_gerada = random.randint(18, 70)
        return nome_gerado, idade_gerada

    @staticmethod
    def gerar_nomes_e_idades_para_lista(lista, quantidade, tamanho_nome):
        """
        Preenche uma lista com nomes e idades gerados aleatoriamente.

        :param lista: A lista a ser preenchida com nomes e idades dos estudantes.
        :param quantidade (int): O número de pares nome e idade a serem gerados.
        :param tamanho_nome (int): O número de caracteres que cada nome deve ter.
        """
        for _ in range(quantidade):
            lista.append(Util.gerar_nome_e_idade(tamanho_nome))
