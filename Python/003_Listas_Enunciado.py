"""
Ejercicio 1:
Crear una lista vacía y agregar elementos.
Escribe un programa que cree una lista vacía llamada "mi_lista" y agregue los números del 1 al 5 a esta lista.
"""
lista1 = []

for i in range(1,6):
    lista1.append(i)
print(lista1)

"""
Ejercicio 2:
Acceder a elementos de una lista.
Escribe un programa que defina una lista llamada "colores" que contenga los nombres de varios colores y muestre el primer y el último elemento de la lista.
"""
colores = ["azul","rojo","verde","amarillo"]
print(colores[0],colores[len(colores)-1])

"""
Ejercicio 3:
Modificar elementos de una lista.
Escribe un programa que tenga una lista de números del 1 al 5 y cambie el tercer elemento de la lista por el número 10.
"""
lista1 = [1,2,3,4,5]

lista1[2] = 10

print(lista1)


"""
Ejercicio 4:
Eliminar elementos de una lista.
Escribe un programa que tenga una lista de nombres de frutas y elimine el segundo elemento de la lista.
"""
listafrutas = ["platano","pera","manzana","uvas"]
listafrutas.pop(1)
print(listafrutas)

"""
Ejercicio 5:
Contar elementos de una lista.
Escribe un programa que cuente cuántas veces aparece la palabra "perro" en una lista dada.
"""
listaanimales = ["pato","perro","gato","perro","perro","caballo"]
perros = 0
for i in listaanimales:
    if i == "perro":
        perros += 1

print("Hay un total de ",perros, "perros")

"""
Ejercicio 6:
Crear una lista a partir de elementos ingresados por el usuario.
Escribe un programa que solicite al usuario ingresar 5 nombres y cree una lista con estos nombres.
"""
listanombres = []
for i in range(5):
    nombre = input("Ingrese un nombre: ")
    listanombres.append(nombre)
    
print(listanombres)


"""
Ejercicio 7:
Concatenar dos listas.
Escribe un programa que tenga dos listas de números y las concatene para formar una sola lista.
"""
lista1 = [1,2,3,4,5]
lista2 = [6,7,8,9,10]

lista3 = lista1 + lista2
print(lista3)


"""
Ejercicio 8:
Ordenar una lista alfabéticamente.
Escribe un programa que tenga una lista de nombres de países y los ordene alfabéticamente.
"""
listaPaises = ["Venezuela","Colombia","Perú","Uruguay","Brasil","Argentina"]
listaPaises.sort()

print(listaPaises)

"""
Ejercicio 9:
Reemplazar elementos de una lista.
Escribe un programa que tenga una lista de números del 1 al 5 y reemplace los elementos del segundo al cuarto por el número 0.
"""
listaNums = [1,2,3,4,5]
for i in range(1,4):
    listaNums[i] = 0
print(listaNums)

"""
Ejercicio 10:
Buscar un elemento en una lista.
Escribe un programa que tenga una lista de números y verifique si el número 5 está presente en la lista.
"""
listaNumeros = [1,2,3,4,5]

if 5 in listaNumeros:
    print("El número 5 está presente en la lista")

"""
Ejercicio 11:
Calcular la longitud de una lista.
Escribe un programa que tenga una lista de colores y calcule cuántos elementos tiene la lista.
"""
listaColores = ["azul","rojo","verde","amarillo"]
print(len(listaColores))

"""
Ejercicio 12:
Crear una lista de números pares.
Escribe un programa que cree una lista de los primeros 5 números pares a partir de un rango.
Agrega esos números pares a una lista
"""
listaNumerosPares = []
for i in range(0,5):
    listaNumerosPares.append(i*2)

"""
Ejercicio 13:
Sumar todos los elementos de una lista.
Escribe un programa que tenga una lista de números y sume todos sus elementos.
"""
listaSuma=[1,2,3,4,5]
total = 0
for i in range(len(listaSuma)):
    total += listaSuma[i]
    
print(total)

"""
Ejercicio 14:
Contar elementos mayores que un número dado.
Escribe un programa que tenga una lista de números y cuente cuántos elementos son mayores que 5.
"""
listaNumerosMayores5 = [1,2,3,4,5,6,8,11,555,222]
total = 0
for i in range(len(listaNumerosMayores5)):
    if listaNumerosMayores5[i] > 5:
        total += 1

print(total)

"""
Ejercicio 15:
Eliminar duplicados de una lista.
Escribe un programa que tenga una lista con elementos duplicados y elimine los duplicados de la lista.
"""
listaDuplicados = [1,1,1,3,3,3,4,4,5,5]
listaNueva = []
for i in range(len(listaDuplicados)):
    if listaDuplicados[i] not in listaNueva:
        listaNueva.append(listaDuplicados[i])
        
print(listaNueva)
    

"""
Ejercicio 16:
Multiplicar todos los elementos de una lista.
Escribe un programa que tenga una lista de números y multiplique todos sus elementos entre sí.
"""
listaNumerosMultiplicados = [1,2,3,4]
total = listaNumerosMultiplicados[0]
for i in range(1,len(listaNumerosMultiplicados)):
    total *= listaNumerosMultiplicados[i]
    
print(total)


"""
Ejercicio 17:
Comprobar si una lista está vacía.
Escribe un programa que determine si una lista dada está vacía o no.
"""
listaVacia = []

if len(listaVacia) == 0:
    print("La lista está vacía")


"""
Ejercicio 18:
Calcular el promedio de una lista de números.
Escribe un programa que tenga una lista de números y calcule el promedio de esos números.
"""
listaPromedio = [1,2,3,4,5]
promedio = 0
for i in range(len(listaPromedio)):
    promedio += listaPromedio[i]
promedio = promedio/len(listaPromedio)
print(promedio)

"""
Ejercicio 19:
Calcular la suma de los elementos pares de una lista.
Escribe un programa que tenga una lista de números y calcule la suma de todos los elementos pares en la lista.
"""
listaPares = [1,2,3,4,5,6,7,8,9,10]
total = 0
for i in range(len(listaPares)):
    if listaPares[i] % 2 == 0:
        total += listaPares[i]
    
print(total)


"""
Ejercicio 20:
Reemplazar todos los elementos de una lista con un valor dado.
Escribe un programa que tenga una lista de números y reemplace todos sus elementos por un valor dado.
"""
listaRemplazar = [1,2,3,4,5,6,7]
valor = 3

for i in range(len(listaRemplazar)):
    listaRemplazar[i] = valor
    
print(listaRemplazar)
    

"""
Ejercicio 21:
Invertir una lista.
Escribe un programa que tenga una lista de números y la invierta, es decir, que el primer elemento se convierta en el último y viceversa.
"""
listaInvertir = [1,2,3]

for i in range(len(listaInvertir)):
    listaInvertir[i] = 0
    
print(listaInvertir)


"""
Ejercicio 22:
Dividir una lista en partes iguales.
Escribe un programa que tenga una lista de números y la divida en partes iguales de longitud especificada por el usuario.
"""
listaDividir = [1,2,3,4,5,6]
dividir = 2
listaNueva = []
for i in range(len(listaDividir),dividir):
    listaNueva.append(listaDividir[i])
    
print(listaNueva)


"""
Ejercicio 23:
Ordenar una lista en orden descendente.
Escribe un programa que tenga una lista de números y la ordene en orden descendente.
"""


"""
Ejercicio 24:
Unir dos listas en una sola.
Escribe un programa que tenga dos listas de números y las una en una sola lista.
"""

"""
Ejercicio 25:
Eliminar todos los elementos duplicados de una lista.
Escribe un programa que tenga una lista con elementos duplicados y elimine todos los duplicados, dejando solo una ocurrencia de cada elemento.
"""

'''
Ejercicio 26:
Ordenar una lista de cadenas alfabéticamente sin distinción entre mayúsculas y minúsculas:

Escribe un programa que solicite al usuario ingresar una lista de palabras 
y luego ordene la lista alfabéticamente sin distinguir entre mayúsculas y minúsculas.
Además, el programa debe eliminar cualquier palabra duplicada antes de realizar la ordenación.
'''

'''
Ejercicio 27
Escribe un programa que genere dos listas de números aleatorios entre 1 y 20 
y luego calcule e imprima la intersección de estas dos listas,
es decir, los números que aparecen en ambas listas.
Asegúrate de que no haya duplicados en las listas generadas.
'''


'''
Ejercicio 28
Eliminar elementos repetidos de una lista manteniendo el orden original:

Escribe un programa que reciba una lista de números y elimine los elementos 
repetidos de la lista manteniendo el orden original.
'''

'''
Ejercicio 29
Calcular la media de una lista de números:
Escribe un programa que calcule la media de una lista de números ingresada por el usuario.
'''

'''
Ejercicio 30
Encontrar el elemento más grande y el más pequeño en una lista:
Escribe un programa que encuentre el elemento más grande y el más pequeño en una lista de números.
'''