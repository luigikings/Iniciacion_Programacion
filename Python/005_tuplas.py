#Las tuplas son listas que no se pueden modificar sus valores

'''
    ¿Que podemos hacer con las tuplas?
        -Crear
        -Saber elementos de una tupla
        -Saber el número de elementos
'''

objTupla = (1,2,3,4)
print(objTupla[3])

for i in objTupla:
    print(i)
    
print("Numeros de 4:",objTupla.count(4))
print("Numero de elementos", len(objTupla))
print("Tipo de elemento", type(objTupla))

