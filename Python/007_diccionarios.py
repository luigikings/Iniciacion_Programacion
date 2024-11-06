#Diccionarios son como HashMaps
#clave : valor
dicc = {"elem1":1,"elem2":[1,2,3]}


print(dicc["elem2"])

#Recorrer en for
for key in dicc:
    print(key)
    
#Recupero solo las llaves
varClaves=dicc.keys()
print(varClaves)

#Recuero solo los valores
varValores=dicc.values()
print(varValores)

#Recorrer ambos datos (llaves y valores)
for k,v in dicc.items():
    print(k,v)
    
#eliminar un elemento de un diccionario
dicc.pop("elem2","Esta clave no existe")

