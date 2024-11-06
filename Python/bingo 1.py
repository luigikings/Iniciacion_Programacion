import random

'''hacer el juego de la serpiente en una matriz de 7x7 haciendo 10 movimientos de forma aleatoria,
la cabeza se representa con la O, el cuerpo con el = y la cola con < y debe ocupar 4 casillas'''

def impresion ():
    for i in range (len(tablero)):
        print(tablero[i])
        
def serpient(vec):
    vecX=vec[0]
    vecY=vec[1]
    ultPos=serpiente[3]
    vecSerpX=ultPos[0]
    vecSerpY=ultPos[1]
    vecSerpX+=vecX
    vecSerpY+=vecY
    if vecSerpX > 0 and vecSerpX < len(serpiente) and vecSerpY > 0 and vecSerpY < len(serpiente):
        if tablero [vecSerpX][vecSerpY] == "=" :
            serpient(vectores[random.randrange(0,4)])
        else:
            print()
            serpiente.append([vecSerpX, vecSerpY])
            tablero[serpiente[0][0]][serpiente[0][1]]="_"     
            tablero[serpiente[1][0]][serpiente[1][1]]="<"   
            tablero[serpiente[2][0]][serpiente[2][1]]="="            
            tablero[serpiente[3][0]][serpiente[3][1]]="="          
            serpiente.pop(0)
            tablero[serpiente[3][0]][serpiente[3][1]]="O"  
            impresion()          
    else :
        serpient(vectores[random.randrange(0,4)])
        
tablero = [["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"],
           ["_","_","_","_","_","_","_"]]
       
vectores = [(0,1),(0,-1),(1,0),(-1,0)]
serpiente = [[0,0],[1,0],[2,0],[3,0]]
for i in range(10):
    serpient(vectores[random.randrange(0,4)])
