import math

"""
Ejercicio 1:
Crear un programa que calcule el área de un triángulo rectángulo dado su base y altura.
Utiliza variables para almacenar la base, la altura y el resultado del cálculo del área.
"""

baseTriangulo = 5
alturaTriangulo = 10
resultado = (baseTriangulo*alturaTriangulo)/2
print(resultado)

"""
Ejercicio 2:
Escribir un programa que convierta grados Celsius a grados Fahrenheit.
Utiliza una variable para almacenar los grados Celsius, realiza el cálculo y muestra el resultado.
"""
cel=0
#grados centígrados × 9/5) +32.
fahrenheit = (cel * 9/5) + 32
print(fahrenheit)

"""
Ejercicio 3:
Crear un programa que calcule el perímetro y el área de un círculo dado su radio.
Utiliza una variable para almacenar el radio, realiza los cálculos y muestra los resultados.
"""
radio = 10
perimetro = 2*math.pi*radio
area = math.pi*(radio**2)
print("Perimetro=",perimetro,"Area=",area)

"""
Ejercicio 4:
Escribir un programa que determine si un número dado es par o impar.
Utiliza una variable para almacenar el número, aplica el operador de módulo y muestra el resultado.
"""
num1 = 3
if num1 % 2 == 0:
    print("ES PAR")
else:
    print("ES IMPAR")

"""
Ejercicio 5:
Crear un programa que calcule la hipotenusa de un triángulo rectángulo dado sus catetos.
Utiliza dos variables para almacenar los catetos, aplica el teorema de Pitágoras y muestra el resultado.
"""
cateto1 = 3
cateto2 = 6
hipotenusa = math.sqrt((cateto1**2)+(cateto2**2))
print(hipotenusa)


"""
Ejercicio 7:
Escribir un programa que determine si un año es bisiesto o no.
Utiliza una variable para almacenar el año, aplica las reglas para determinar si es bisiesto y muestra el resultado.
"""
anio = 2024
if anio % 4 == 0 and anio % 100 != 0:
    print(anio,"ES BISIESTO")
else:
    print("NO ES BISIESTO")

"""
Ejercicio 8:
Crear un programa que convierta una cantidad de dólares a euros.
Utiliza una variable para almacenar la cantidad de dólares, realiza la conversión y muestra el resultado.
"""
dolares = 100
euros = dolares * 0.92
print(euros)

"""
Ejercicio 9:
Escribir un programa que determine si un número dado es positivo, negativo o cero.
Utiliza una variable para almacenar el número, aplica condiciones y muestra el resultado.
"""
num2 = -100
if num2 > 0:
    print("ES MAYOR QUE 0")
elif num2 == 0:
    print("ES 0")
else:
    print("ES MENOR QUE 0")

"""
Ejercicio 10:
Crear un programa que calcule el promedio de tres números dados.
Utiliza tres variables para almacenar los números, realiza el cálculo y muestra el resultado.
"""
#Forma sin lista
num3 = 6
num4 = 10
num5 = 4
promedio = (num3+num4+num5)/3
print(promedio)

#Forma con lista
notas = 6,10,4
promedio = 0
for num in notas:
    promedio += num
#La funcion len() sirve para sacar la cantidad de datos de una lista
print(promedio/len(notas))
    
"""
Ejercicio 11:
Crear un programa que determine si un número dado es primo o no.
Utiliza una variable para almacenar el número, aplica las reglas para determinar si es primo y muestra el resultado.
"""
num6 = 100
for num in range(2,num6-1):
    if num6 % num == 0:
        print(num6,"NO ES PRIMO")
        break


"""
Ejercicio 12:
Escribir un programa que determine si un número dado es múltiplo de otro.
Utiliza dos variables para almacenar los números, aplica el operador de módulo y muestra el resultado.
"""
num7 = 12
num8 = 15

if num7 % num8 == 0:
    print(num7,"ES MULTIPLO DE",num8)
else:
    print(num7,"NO ES MULTIPLO DE",num8)


"""
Ejercicio 13:
Crear un programa que calcule el factorial de un número dado.
Utiliza una variable para almacenar el número, realiza el cálculo del factorial y muestra el resultado.
"""
num9 = 10
factorial = 1

for num in range(1,num9+1):
    factorial *= num
   
print(factorial)

"""
Ejercicio 14:
Escribir un programa que determine si una cadena de texto es palíndromo o no.
Utiliza una variable para almacenar la cadena, aplica condiciones y muestra el resultado.
"""
texto = "oso"
for num in range(1,len(texto)+1):
    if texto[num-1] == texto[len(texto)-num]:
        print(texto[num-1],"es palindromo")
    else:
        print(texto[num-1],"no es palindromo")

print(texto[2])

textoreversed = ""
for num in range(len(texto)-1,-1,-1):
    textoreversed += texto[num]

print(textoreversed)

if texto == textoreversed:
    print(texto,"es palindromo")
else:
    print(texto,"no es palindromo")

"""
Ejercicio 15:
Crear un programa que cuente la cantidad de vocales en una cadena de texto dada.
Utiliza una variable para almacenar la cadena, itera sobre cada carácter y cuenta las vocales, luego muestra el resultado.
"""
texto = "osovbbbbbba"
vocales = 0

for num in range(len(texto)):
    if texto[num] == "a" or texto[num] == "e" or texto[num] == "i" or texto[num] == "o" or texto[num] == "u":
        vocales += 1
print(vocales,"es el numero de vocales")

"""
Ejercicio 16:
Escribir un programa que determine si una cadena de texto dada es un pangrama o no.
Un pangrama es una frase que contiene todas las letras del alfabeto al menos una vez.
Utiliza una variable para almacenar la cadena, itera sobre cada letra y verifica si está presente en el alfabeto, luego muestra el resultado.
"""
texto = "abcdefghijklmnopqrstuvwx"
alfabeto = "abcdefghijklmnopqrstuvwxyz"
pangrama = True

for num in range(len(alfabeto)):
    if alfabeto[num] not in texto:
        pangrama = False
        break

if pangrama:
    print(texto,"es un pangrama")
else:
    print(texto,"no es un pangrama")
"""
Ejercicio 17:
Escribir un programa que calcule el máximo común divisor (MCD) de dos números enteros.
Utiliza dos variables para almacenar los números, aplica el algoritmo de Euclides y muestra el resultado.
"""
num1 = 100
num2 = 200
for num in range(1,num1+1):
    if num2 % num == 0:
        print(num2,"es el MCD de",num1)
        break

"""
Ejercicio 18:
Crear un programa que calcule la potencia de un número dado elevado a otro número entero.
Utiliza dos variables para almacenar la base y el exponente, realiza el cálculo de la potencia y muestra el resultado.
"""
num1 = 3
num2 = 2
potencia = 1
for num in range(1,num1+1):
    potencia = num1 ** num2
    
print(potencia)


"""
Ejercicio 19:
Escribir un programa que calcule el área de un círculo dado su radio, utilizando una función.
La función debe recibir el radio como argumento y devolver el área del círculo.
"""
def area_circulo(radio):
    return math.pi * radio ** 2

print(area_circulo(4))

"""
Ejercicio 20:
Crear un programa que determine si un número dado es perfecto o no.
Un número perfecto es aquel que es igual a la suma de sus divisores propios positivos (excluyendo al propio número).
Utiliza una variable para almacenar el número, realiza los cálculos y muestra el resultado.
"""

num1 = 6
suma = 0

for num in range(1,num1):
    if num % 2 == 0:
        suma += num

if num1 == suma:
    print(num1,"es un numero perfecto")
else:
    print(num1,"no es un numero perfecto")
