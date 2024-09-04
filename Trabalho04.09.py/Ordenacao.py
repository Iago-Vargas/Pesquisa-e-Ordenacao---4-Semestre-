#Iago Vargas
class Ordenacao:

    @staticmethod
    def metodo_bolha(lista):
        """
        Ordena uma lista utilizando o método de ordenação Bubble Sort.

        :param lista: A lista a ser ordenada usando o algoritmo Bubble Sort.
        :return: A lista ordenada.
        """
        houve_troca = True
        while houve_troca:
            houve_troca = False
            for i in range(len(lista) - 1):
                if lista[i] > lista[i + 1]:
                    houve_troca = True
                    lista[i], lista[i + 1] = lista[i + 1], lista[i]  # Troca dos elementos

        return lista

    @staticmethod
    def metodo_selecao(lista):
        """
        Ordena uma lista utilizando o método de ordenação Selection Sort.

        :param lista: A lista a ser ordenada usando o algoritmo Selection Sort.
        :return: A lista ordenada.
        """
        n = len(lista)
        for i in range(n):
            min_index = i
            for j in range(i + 1, n):
                if lista[j] < lista[min_index]:
                    min_index = j
            lista[i], lista[min_index] = lista[min_index], lista[i]  # Troca dos índices de posição

        return lista

    @staticmethod
    def metodo_insercao(lista):
        """
        Ordena uma lista utilizando o método de ordenação Insertion Sort.

        :param lista: A lista a ser ordenada usando o algoritmo Insertion Sort.
        :return: A lista ordenada.
        """
        for i in range(1, len(lista)):
            chave = lista[i]
            j = i - 1
            while j >= 0 and lista[j] > chave:
                lista[j + 1] = lista[j]
                j -= 1
            lista[j + 1] = chave

        return lista
