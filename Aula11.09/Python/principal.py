from Aluno import Aluno

lista = []


lista.append(Aluno ("Alex", 50))
lista.append(Aluno("Matheus", 19));
lista.append(Aluno("Romeo", 19));
lista.append(Aluno("Viti", 19));
lista.append(Aluno("Gilberto", 20));
lista.append(Aluno("Bruno", 19));
lista.append(Aluno("Bruno", 18));
lista.append(Aluno("Anthony", 20));
lista.append(Aluno("Arthur", 19));

lista.sort()

for item in lista:
    print (item)