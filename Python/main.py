from Museo import Museo
from Cuadro import Cuadro
from Persona import Persona

'''
El museo Eldavots tiene una exposición de distintos cuadros. El museo tiene un aforo máximo de 7 personas. 
desde este museo se quiere llevar un registro de los cuadros expuestos donde se pueda ver el año de la obra, el genero y el autor. 
Asimismo queremos registrar los datos de los visitantes entre los que deben estar el genero, nombre y edad. 
Se quiere revisar cuantas mujeres mayores de 25 asisten al museo y cuanto se recauda por parte del publico varón. La entrada vale 35 euros.
'''

Museo1 = Museo("Eldavots")

Cuadro1 = Cuadro("Rocket League","LK","2001","Barbaro")
Cuadro2 = Cuadro("UwUntu","Davuntu","1600","Coquette")
Cuadro3 = Cuadro("Yillet","Sabi","1234","Moderno")

Persona1 = Persona("Luigi",21,"Hombre")
Persona2 = Persona("Andrea",18,"Mujer")
Persona3 = Persona("Sabina",42,"Mujer")
Persona4 = Persona("Davo",33,"Hombre")
Persona5 = Persona("Deyby",26,"Hombre")
Persona6 = Persona("David",9,"Hombre")

listaCuadros=[Cuadro1,Cuadro2,Cuadro3]
listaPersonas=[Persona1,Persona2,Persona3,Persona4,Persona5,Persona6]

for persona in listaPersonas:
    Museo1.agregarPersona(persona)

for cuadro in listaCuadros:
    Museo1.agregarCuadro(cuadro)


print(Persona1)
