class Aluno:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def __str__(self):
        return "Aluno{" + "nome=" + self.nome + ", idade=" + self.idade + '}'
    
    def __eq__ (self, other):
        if isinstance(other, Aluno):
            return self.nome == other.nome
        return False
    
    def __repr__(self):
        return f"Aluno(Nome: {self.nome!r} - Idade: {self.idade})"
    
    def __gt__ (self, other):
        if not isinstance (other, Aluno):
            return NotImplemented
        if self.nome > other.nome:
            return True
        elif self.nome < other.nome:
            return False
        return self.idade > other.idade