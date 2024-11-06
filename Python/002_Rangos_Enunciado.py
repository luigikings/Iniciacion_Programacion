import string

"""
Ejercicio 1: Creación de un Rango Simple
Define un rango que vaya desde 0 hasta 5 (inclusive).
Imprime el rango creado.
"""
print(list(range(6)))

"""
Ejercicio 2: Creación de un Rango con Inicio y Fin Específicos
Define un rango que vaya desde 5 hasta 10 (inclusive).
Imprime el rango creado.
"""
print(list(range(5,11)))


"""
Ejercicio 3: Creación de un Rango con Incremento Específico
Define un rango que vaya desde 1 hasta 10 (inclusive) con incremento de 2.
Imprime el rango creado.
"""
print(list(range(1,11,2)))


"""
Ejercicio 4: Iteración sobre un Rango Simple
Itera sobre un rango que vaya desde 0 hasta 3 (inclusive).
Imprime cada valor del rango en una línea separada.
"""
rango = range(4)
for i in rango:
    print(i)

"""
Ejercicio 5: Iteración sobre un Rango con Incremento Específico
Itera sobre un rango que vaya desde 0 hasta 10 (inclusive) con incremento de 2.
Imprime cada valor del rango en una línea separada.
"""
rango2 = range(0,11,2)
for i in rango2:
    print(i)

"""
Ejercicio 6: Uso de Rangos en Funciones de Control de Flujo
Itera sobre un rango que vaya desde 10 hasta 1 (inclusive) con decremento de 1.
Imprime cada valor del rango en una línea separada.
"""
rango3 = range(10,1,-1)
for i in rango3:
    print(i)

"""
Ejercicio 7: Uso de Rangos en Condicionales
Verifica si un número ingresado por el usuario está dentro de un rango predefinido.
"""

rango4 = range(0,11,2)
num = input("Ingrese un número: ")
if num in rango4:
    print("El número ingresado está dentro del rango")
else:
    print("El número esta fuera de ranking")

"""
Ejercicio 8: Uso de Rangos para Generar Secuencias de Números
Genera una lista de números pares en el rango de 0 a 10 (inclusive).
Imprime la lista resultante.
"""
listaNum1 = list(range(0,11,2))
print(listaNum1)

"""
Ejercicio 9: Uso de Rangos para Sumar Elementos
Calcula la suma de todos los números en el rango de 1 a 100 (inclusive).
Imprime el resultado de la suma.
"""
listaNum2 = list(range(1,101))
suma = 0
for num in listaNum2:
    suma += num
print(suma)

"""
Ejercicio 10: Uso de Rangos para Contar Elementos
Cuenta cuántos números pares hay en el rango de 1 a 50 (inclusive).
Imprime el total de números pares.
"""
listaNum3 = list(range(1,51))
cont = 0
for num in listaNum3:
    if num % 2 == 0:
        cont+= 1
print("cantidad de pares:",cont)

"""
Ejercicio 11: Uso de Rangos en una Función
Define una función llamada `imprimir_rango` que reciba un parámetro `limite`.
La función debe imprimir todos los números desde 0 hasta el `limite` (inclusive) utilizando un rango.
"""
def imprimir_rango(limite):
    return print(list(range(0,limite)))
imprimir_rango(5)

"""
Ejercicio 12: Uso de Rangos en una Función con Paso Personalizado
Define una función llamada `imprimir_rango_paso` que reciba tres parámetros: `inicio`, `fin` y `paso`.
La función debe imprimir todos los números desde `inicio` hasta `fin` (inclusive) utilizando un rango con el paso especificado.
"""
def imprimir_rango_paso(inicio,fin,paso):
    return print(list(range(inicio,fin,paso)))
imprimir_rango_paso(0,5,2)

"""
Ejercicio 13: Uso de Rangos para Generar Secuencias de Caracteres
Genera una lista de letras del alfabeto inglés (minúsculas) utilizando un rango.
Imprime la lista resultante.
"""
listaNum3 = list(string.ascii_lowercase)
print(listaNum3)

"""
Ejercicio 14: Uso de Rangos para Generar Patrones
Genera un patrón numérico en forma de triángulo utilizando un rango y la función `join()`.
Imprime el patrón resultante.
"""


"""
Ejercicio 15: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón numérico en forma de triángulo invertido utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 16: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de asteriscos en forma de pirámide utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 17: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de números en forma de diamante utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 18: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de pirámide utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 19: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de pirámide invertida utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 20: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de diamante utilizando un bucle for.
Imprime el patrón resultante.
"""
