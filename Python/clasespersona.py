class Humano:
    def __init__(self,nombre,apellidos,edad,dni):
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        self.__dni = dni

class Persona(Humano):
    def __init__(self,nombre,apellidos,edad):
        super().__init__(nombre,apellidos,edad)
        
        
    def __str__(self):
        return "Nombre: " + self.nombre+", apellidos: "+self.apellidos+", edad: "+str(self.edad)
        
    def decirHola(self):
        print("Hola me llamo",self.nombre)
    
    def __eq__(self, value):
        return self.apellidos ==  value.apellidos
        
p1 = Persona("Miegul","Martinez",23)
p2 = Persona("Luis","Da Silva",22)

p1.decirHola()
p2.decirHola()
    