'''
map(funcion, cosa a recorrer)
- la funcion se pone sin parentesis
- la funcion minimo 1 parametro

'''

#Vamos a sumar 1 a una lista usando el map

#creamos la funcion
def sumar1(x):
    return x+1

#creamos la lista
lst = [1,2,3,4,5,6,7,8,9]

#y ahora usamos el map
print(list(map(sumar1,lst)))
#la convertimos en lista porque no podemos imprimir el map
lst = list(map(sumar1,lst))
print(lst)

#ahora usamos 2 listas, ambas listas tienen que tener la misma cantidad de datos

lista1 = [1,2,3]
lista2 = [3,2,1]

def sumarList(x,y):
    return x+y

print(list(map(sumarList,lista1,lista2)))

#vamos a ver el len de cada string de la siguiente lista
listatxt = ["Hola" , "que", "talEstas"]

print(list(map(len,listatxt)))

#funcion para pasar todo a mayusculas

print(list(map(str.upper,listatxt)))

di = [{"persona1":"Luis","edad":22},
      {"persona2":"Luis","edad":22},
      {"persona3":"Luis","edad":22}]

def sumarEdad(x):
    return x.get("edad")+1
    
def sumarEdad2(x):
    return x["edad"]+1

def dictSumar1(x):
    x["edad"]+=1
    return x

print(list(map(sumarEdad,di)))
print(list(map(sumarEdad2,di)))
print(di)

#importacion interesante:
import time

#funciona para ver los tiempos que utilizan nuestras funciones y asi vemos que tan optimos son:
lista=list(range(1,10000000))
lista1 = list(range(1,10000000))

inicio=time.time()
for i in range(len(lista)):
    lista[i]+=1
final=time.time() 
print(final-inicio)   

    
def sumar1Lista(x):
    return x+1

inicio=time.time()
list(map(sumar1Lista,lista1))
final = time.time()
print(final-inicio)

#Podemos ver que tarda mas el map que el bucle for


