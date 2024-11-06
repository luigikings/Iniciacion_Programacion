import random

'''
El juego del Snake:

- tablero 7x7
- no crece
- no hay fruta
- movimientos al azar (10)
- cola (<) cuerpo (=) y cabeza (O)
<==O

+ funcion para verificar posicion valida
+ funcion para mover
+ tablero

'''
tablero = []

#Creamos la serpiente con su respectivas coordenadas
serpiente = [[0,0],[0,1],[0,2],[0,3]]

#Funcion basica para imprimir el tablero
def impTablero():
    tablero = []
    for i in range(8):
        fila = []
        for j in range (8):
            fila.append("-")
        tablero.append(fila)
    tablero[serpiente[0][0]][serpiente[0][1]] = "<"
    tablero[serpiente[1][0]][serpiente[1][1]] = "="
    tablero[serpiente[2][0]][serpiente[2][1]] = "="
    tablero[serpiente[3][0]][serpiente[3][1]] = "O"
    for i in range(len(tablero)):
        print(tablero[i])
    print()
        
#funcion para el  egir una direccion al azar arriba(1,0), abajo(-1,0), derecha(0,1) y izquierda (0,-1)
def elegirDir():
    direcciones = (1,0),(-1,0),(0,1),(0,-1)
    return direcciones[random.randint(0,3)]

#funcion para comprobar que el movimiento es valido
def movValido():
    while(True):
        direccion = elegirDir()
        dirx = direccion[1]
        diry = direccion[0]
        serpx = serpiente[3][0]
        serpy = serpiente[3][1]
    
        nuevaPosx = serpx + dirx
        nuevaPosy = serpy + diry
    
        if (nuevaPosx < len(tablero) and nuevaPosx > 0 and nuevaPosy < len(tablero[nuevaPosx]) and nuevaPosy > 0):
            nuevaCabeza = [nuevaPosx,nuevaPosy]
            if (nuevaCabeza != serpiente[0] and nuevaCabeza != serpiente[1] and nuevaCabeza != serpiente[2]):
                return nuevaCabeza
        else:
            continue
        
#Funcion para mover la serpiente por el tablero
def moverSerp():
    nuevaCabeza = movValido()
    serpiente[0] = serpiente[1]
    serpiente[1] = serpiente[2]
    serpiente[2] = serpiente[3]
    serpiente[3] = nuevaCabeza    

for i in range(3):
    impTablero()
    print(serpiente)
    moverSerp()
    
    
    
    
    
    