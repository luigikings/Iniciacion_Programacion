#Primera Clase de Python:

'''
Comentario 
Multi
Lineas
'''

'''
Tipos de datos en python:
    - Booleanos
    - Entero
    - Decimales
    - Textos
    - Listas
    - Tuplas
    - Conjuntos (Set)
    - Diccionarios
'''

#Numeros Enteros y Decimales
numeroEntero = 5
numeroDecimal = 5.2

print("El numero Entero es: "+ str(numeroEntero))
print("El numero Decimal es: ", numeroDecimal)

#Textos:
variableTexto = "Esto es un texto"
print(variableTexto)

#Booleanos:
variableBooleano = True
print("Variable tipo booleano:",variableBooleano)

'''
Operadores:
    -Operadores Aritméticos + - * / % **(Elevado a) //(Division Exacta, sin el resto)
        Suma (+)
        Resta (-)
        Multiplicacion (*)
        División (/)
        Resto (%)
        Exponente (**)
        Division Exacta (//)
        
    -Operadores Relacioales > < >= <= == !=
        Mayor(>)
        Menor(<)
        Mayor o Igual y Menos o igual (>= <=)
        Igual(==)
        Distinto(!=)
        
    -Operadores de asignación = += -= *= /= ... el resto de Aritmericos
        Asignar un valor (=)
        Asignacion de suma (+=)
        Asignacion de resta (-=)
        
    -Opeadores lógicos and or not
        Y lógico(and)
        O lógico(or)
        No lógico(not)
        
    -Operadores de pertenencia
        Para saber si un valor esta dentro de otro(in)
        
    -Opadores de identidad
        Para saber si un elemento es igual a otro (is)
'''

'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|
|    Para calcular el abosluto de un numero se usa el abs y para redondear utilizamos el round
|
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
 
varabs=-5
print(abs(varabs))
varound=3.3
print(round(varound))
 
'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|
|   Con la funcion eval podemos resolver una operacion de un string
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
n=2
print(eval("3+9/6*n"))
 
'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|
|    Con la funcion type podemos saber el tipo de dato
|
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
 
print(type(5))
print(type("true"))
print(type(6.7))
print(type(False))
 
 
'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|
|    En Python los rangos son un tipo de dato muy utilizado se escribe range y hay tres formas de escribir un rango
|   1: pos inicial 0 hasta la seleccionada-1. 2: pos inicial y final-1. 3: pos inicial, final-1 y los pasos.
|   para visualizar los datos tenemos que convertirlo a una lista.
|
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
 
print(range(10))
print(range(5,10))
print(range(5,10,2))
 
print(list(range(10)))
print(list(range(5,10)))
print(list(range(5,10,2)))
 
'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|           IF Y FOR
|    No son necesarios ni los parentesis ni las llaves
|   Para el for necesitamos el rango y concretar el indice
|  
|
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
 
if 5<6:
    print("es menor")
elif 5<4:
    print("5<4")    
else:
    print("no es menor")    
 
var="hola buenos dias"  
for indice in range (0,len(var),2):
    print(var[indice])
 
for letra in var:
    print(letra)      
   
   
'''
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
|          
|    
|  
|  
|
|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|
'''
 
var = input("Dame un número")
print("El numero es:",var)