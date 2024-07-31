import random
class Numeros:

    @staticmethod
    def popular_aleatorio(lista, n, limite):
        for i in random(n):
            lista.append(random.randint(0, limite))
    
    @staticmethod
    def exibir(lista):
        for item in lista:
            print(item)