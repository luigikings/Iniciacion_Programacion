"""
Crear un tablero de 10x10 con una pieza que empiece en el centro y que se mueva hasta salirse por los huecos del tablero.
Las paredes se representan con | y los espacios del tablero con _  
 
"""
"""
|                       |
|                       |
|                       |
|                       |
|                       |
 
"""

tablero = [
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
    ["|","_","_","_","_","_","_","_","_","|"]
]
bola = [5,5]
vectores = [(1,0),(-1,0),(0,1),(0,-1),(1,1),(1,-1),(-1,1),(-1,-1)]

def imprimirTablero():
    tablero[bola[0][bola[1]]] = "O"
    for i in range(len(tablero)):
        print(tablero[i])
        
def moverBola():
           
        
        