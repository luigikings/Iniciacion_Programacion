class Museo():

    def __init__(self,nombre):
        self.nombre = nombre
        self.listaCuadros = []
        self.listaPersona = []
        self.aforo = 7

    def agregarCuadro(self,cuadro):
        print("Cuadro agregada")
        self.listaCuadros.append(cuadro)

    def agregarPersona(self,persona):
        if len(self.listaPersona) >= 7:
            print("Aforo Maximo alcanzado!")
        else:
            print("Persona agregada")
            self.listaPersona.append(persona)

    def mostrarVisitantes(self):
        for visitante in self.listaPersona:
            print("Nombre:",visitante.nombre)
