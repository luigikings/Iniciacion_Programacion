#Vamos a Hacer que el programa resuelta una supa de letras:
#Sopa de letras:
sopaLetras = [
    ['P', 'Y', 'T', 'H', 'O', 'N', 'A', 'C', 'W', 'Q'],
    ['I', 'T', 'E', 'X', 'U', 'S', 'O', 'B', 'V', 'R'],
    ['N', 'U', 'H', 'N', 'J', 'O', 'I', 'O', 'W', 'L'],
    ['T', 'G', 'C', 'M', 'K', 'T', 'Z', 'L', 'P', 'K'],
    ['E', 'I', 'D', 'O', 'F', 'A', 'G', 'K', 'X', 'J'],
    ['L', 'A', 'T', 'O', 'H', 'D', 'M', 'F', 'Y', 'Z'],
    ['I', 'N', 'G', 'C', 'E', 'O', 'N', 'Z', 'T', 'U'],
    ['G', 'J', 'O', 'C', 'Y', 'U', 'W', 'R', 'E', 'S'],
    ['E', 'C', 'O', 'P', 'R', 'E', 'Q', 'K', 'F', 'I'],
    ['N', 'C', 'A', 'A', 'P', 'A', 'P', 'Ñ', 'H', 'A'],
]
# Palabras a buscar:
palabras = ["PYTHON", "PAPA", "DATOS","COCHAZO","TROPECIENTOS"]
#palabras encontradas:
palabrasEncontradas = []
#lista de vectores:
listaVectores = [(0,1),(0,-1),(1,0),(1,1),(1,-1),(-1,0),(-1,1),(-1,-1)]

#Hacemos una funcion para que busca en la sopa de letras la primera letra de la palabra dada:
def buscarPalabra(palabra):
    for posx in range(len(sopaLetras)):
       for posy in range(len(sopaLetras[posx])):
           if sopaLetras[posx][posy] == palabra[0]:
               posX = posx
               posY = posy
               verificarVectores(posX, posY, palabra,posX,posY)
                      
               
#Ahora hacemos una funcion en donde cuando haya ya encontrado la posicion de la primera letra compruebe en todas las direcciones la siguiente letra de la palabra:
def verificarVectores(posX, posY, palabra,inicioX,inicioY):
    for j in range(len(listaVectores)):
        posX2 = posX + listaVectores[j][0]
        posY2 = posY + listaVectores[j][1]
        if posX2 >= 0 and posX2 < len(sopaLetras) and posY2 >= 0 and posY2 < len(sopaLetras[posX2]):
            if sopaLetras[posX2][posY2] == palabra[1]:
                vector = listaVectores[j]
                seguirVector(vector, posX2, posY2, palabra,2,inicioX,inicioY)
                    
                    
#Ahora hacemos una funcion en donde si ya hemos encontrado la 2da letra continuamos comprobando si la palabra esta pero siguiento el mismo vector:
def seguirVector(vector, posX, posY, palabra,indice,inicioX,inicioY):
    for i in range(indice,len(palabra)):
        posX2 = posX + vector[0]
        posY2 = posY + vector[1]
        if posX2 >= 0 and posX2 < len(sopaLetras) and posY2 >= 0 and posY2 < len(sopaLetras[posX2]):
            if sopaLetras[posX2][posY2] == palabra[i]:
                if indice == len(palabra)-1:
                    print("La palabra:", palabra, "esta en la posicion:(",inicioX,",",inicioY ,")","usando el vector", vector)
                    palabrasEncontradas.append(palabra)
                    break
                else:
                    seguirVector(vector, posX2, posY2, palabra,indice+1,inicioX,inicioY)
                


#Main:
for i in range(len(palabras)):
    buscarPalabra(palabras[i])
    
for i in range(len(palabras)):
    if palabras[i] not in palabrasEncontradas:
        print("La palabra:", palabras[i], "no esta en la sopa de letras")
        
        
print ("cory es la mejor del mundo te lee los pensamientos jajajajajaj")