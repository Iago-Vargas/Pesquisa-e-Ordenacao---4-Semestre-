#Iago Vargas
class Estudante:
    def __init__(self, nome_estudante, idade_estudante):
        """
        Construtor - Inicializa uma nova instância da classe Estudante.

        :param nome_estudante (str): O nome do estudante.
        :param idade_estudante (int): A idade do estudante.
        """
        self.nome_estudante = nome_estudante
        self.idade_estudante = idade_estudante

    def get_nome_estudante(self):
        return self.nome_estudante

    def set_nome_estudante(self, nome_estudante):
        self.nome_estudante = nome_estudante

    def get_idade_estudante(self):
        return self.idade_estudante

    def set_idade_estudante(self, idade_estudante):
        self.idade_estudante = idade_estudante

    def __str__(self):
        """
        Retorna uma representação em string da instância da classe Estudante.

        :return: Uma string formatada com o nome e a idade do Estudante.
        """
        return f"Estudante [ nome={self.nome_estudante}, idade={self.idade_estudante} ]"
