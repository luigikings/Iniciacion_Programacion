'''
iterator, yield , next y hasNext
'''

def bucle():
    i=0
    while i!=10:
        yield "El valor de i es:"+str(i)
        i+=1
        
print(bucle())
print(next(bucle()))
print(next(bucle()))
print(next(bucle()))
print(next(bucle()))

iterator = bucle()
print("Guardado en una variable:")
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))

print("Impresion por bucle:")

for item in iterator:
    print(item)
    
print("Prueba con bucles:")
iterator2 = bucle()
for item in iterator2:
    print(item)
print("---------------------")
for item in iterator:
    print(item)
print("---------------------")

print("Prueba con while True")
iterator3 = bucle()

while True:
    try:
        print(next(iterator3))
    except:
        print("Ya no tengo mas elementos")
        break
    
lista = [1,2,3,4,5,6,7]
print(lista)
print(iter(lista))
