#Al crear una lista se crea una copia de la lista original pero al modificar la copia tambien se modifica la lista original
lista = [1,2,3,4,5,[["a"],"b","c"]]
lista1 = lista
print("-------------------------------------------Sin copy------------------------------------------------------")
print(lista,"lista original")
lista1[0] = 69

print(lista,"lista original")

#existe una funcion llamada .copy() COPIA SUPERFICIAL
print("------------------------------------------Con copy-------------------------------------------------------")
lista2 = lista.copy()
lista2[0] = 999

#en este caso se mantiene
print(lista, "lista original")
print(lista2, "lista copiada")

print("--------------------------------------Con copy pero modificando una lista interna-----------------------------------------")
#al cambiar una lista interna se modifica tambien en la original por eso es una copia superficial si queremos modificar algo interno de una lista se genera de forma independiente
#entonces usaremos copy.deepcopy()
lista2[5][2] = "HOLA"
print(lista, "lista original")
print(lista2, "lista copiada")

print("--------------------------------------------------Con copy.deepcopy()--------------------------------------------------------------")
#si importamos copy podemos llegar a usar el copy.deepcopy() de manera que nos aseguramos al completo que si modificamos algo interno de una lista se genera de forma independiente
import copy

lista3 = copy.deepcopy(lista)
lista3[5][0][0] = "JEJE"

print(lista, "lista original")
print(lista3, "lista copiada")
