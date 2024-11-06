import random

'''
Un pacman donde con fantasmas que no se mueven el pacman se mueva hasta que choque con uno y muera
'''

#Funcion para genera 1 fantasma
def generarF():
    x = random.randint(0,7)
    y = random.randint(0,7)
    #en caso de que haya ya un fantasma en esa pocion llamamos de nuevo la funcion
    if tablero[x][y] == "F":
        generarF()
    #sino llevamos esa posicion con el fantasma
    else:
        tablero[x][y] = "F"

#Funcion para generar la posicion del Pacman, devolvemos una lista con la posX y posY [0,0]
def generarP():
    pacmanX = random.randint(0,7)
    pacmanY = random.randint(0,7)
    #en caso de que haya ya un fantasma en esa pocion llamamos de nuevo la funcion
    if tablero[pacmanX][pacmanY] == "F":
        generarP()
    #sino devolvemos la lista con ambas posiciones
    else:
        return [pacmanX,pacmanY]

#Funcion para imprimir el tablero
def imprimirtablero():
    #Primero modificamos el tablero y ponemos la P donde indice la posicion de la variable pacman
    tablero[pacman[0]][pacman[1]]="P"
    #luego imprimimos fila por fila
    for i in range(len(tablero)):
        print(tablero[i])
    print()

#Funcion para generar el tablero con los fantasmas
def generarTablero():
    #llamamos la funcion generarF las veces que queramos fantasmas, 5 veces = 5 fantasmas
    for i in range(5):
        generarF()

#Funcion para elegir un vector al azar de la lista de vectores
def sacarVector():
    return random.choices(vectores)

#funcion para mover el pacman, le pasamos el pacman como parametro
def mover(pacman):
    #usamos un bucle while(true) hasta que el vector utilizado sea usable (es decir, que el nuevopacman no se salga del tablero)
    while(True):
        #sacamos 1 vector de la lista de vectores
        vector = sacarVector()
        #inicializamos el nuevopacman
        nuevopacman = [0,0]
        #ahora modificamos este nuevopacman sumandole el pacman y el vector
        nuevopacman[0] = pacman[0]+vector[0][0]
        nuevopacman[1] = pacman[1]+vector[0][1]
        print(vector)
    
        #Un if para verificar que el nuevopacman sigue dentro de nuestro tablero
        if nuevopacman[0] > 0 and nuevopacman[0] < len(tablero) and nuevopacman[1] > 0 and nuevopacman[1] < len(tablero):
            #si en la nueva posicion hay una F entonces el pacman choco con un fantasma y perdio y muere
            if tablero[nuevopacman[0]][nuevopacman[1]] == "F":
                #devolvemos un None de manera que ahora pacman sera igual a none
                return None
            #sino donde estaba el pacman escribimos el suelo _ y devolvemos el nuevo pacman
            else:
                tablero[pacman[0]][pacman[1]] = "_"
                return nuevopacman
        #en caso contrario volver a llamar al bucle y empezar de 0
        else:
            continue

'''
Main:
'''
#Generamos el tablero 8x8 vacio
tablero = [["_" for i in range(8)] for j in range(8)]

#Generamos los vectores solo se mueve arriba, abajo, derecha y izquierda
vectores = (0,1),(0,-1),(1,0),(-1,0)

#generamos el pacman
pacman = generarP()
#generamos el tablero
generarTablero()
#hacemos un bucle infinito hasta que el pacman pierda, es decir choque con un fantasma
while(True):
    imprimirtablero()
    pacman = mover(pacman)
    #si pacman es None significa que choco asi que entonces choco y murio
    if pacman == None:
        print("PERDISTE ;( TROSTI")
        break
'''aaaaaa
asdasd
asdasd
asdasdas




aaaaaa
'''
'''
Cuidense el dulce muchachos!
Python no podra con nosotros!

se les quiere
atte: LK, el artista <3
PD: marico el que lo lea
'''