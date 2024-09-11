// See https://aka.ms/new-console-template for more information
using Aula1109;

List<Aluno> lista = new List<Aluno>();

lista.Add(new Aluno("Matheus", 19));
lista.Add(new Aluno("Romeo", 19));
lista.Add(new Aluno("Viti", 19));
lista.Add(new Aluno("Gilberto", 20));
lista.Add(new Aluno("Bruno", 19));
lista.Add(new Aluno("Bruno", 18));
lista.Add(new Aluno("Anthony", 20));
lista.Add(new Aluno("Arthur", 19));

//lista.Sort();
//lista = lista.OrderBy(a => a.Nome).ThenBy(a => a.Idade).ToList();
//Ordenacao.pente(lista);
Ordenacao.bolha(lista);
foreach (var item in lista)
{
    Console.WriteLine(item);
}