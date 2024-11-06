class Persona():

    def __init__(self,nombre,edad,genero):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero
        self.cuadrosVistos = []

    def __str__(self):
        return "nombre: "+self.nombre

    def cuadroVisto(self,cuadro):
        print("Cuadro agregado a visto!")
        self.cuadrosVistos.append(cuadro)