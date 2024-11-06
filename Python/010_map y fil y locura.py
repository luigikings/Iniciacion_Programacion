from functools import reduce

lista_numeros= list(range(1,10000))
aux = 0

for x in lista_numeros:
    if x%2==0:
        aux+=x

print(aux)

def pares(x):
    return x%2==0

def sumar(x,y):
    return x+y

listafiltrada = filter(pares,lista_numeros)
sumanumeros = reduce(sumar,listafiltrada)
print(sumanumeros)