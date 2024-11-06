'''Hecho por: Luis Angel Jose Da Silva'''

'''#Tres en raya:'''
#Funcion para mirar victoria del 3 en raya:
def ComprobarGanadorTresEnRaya(tablero):
    '''Primero comprobamos si alguna fila es igual:'''
    
    #Recorremos las filas del tablero:
    for i in range(len(tablero)):
        #Guardamos la fila
        fila = tablero[i]
        #Miramos si en esa misma fila los 3 caracteres son iguales:
        if fila[0] == fila[1] and fila[1] == fila[2]:
            #Si es asi guardamos el caracter que este en dicha fila
            ganador = fila[0]
            #y ahora verificamos si es una X
            if ganador == 'X':
                #en caso afirmativo anunciamos ganador y devolvemos el caracter ganador
                print("El Ganador es X")
                return ganador
            #Hacemos lo mismo con la O
            elif ganador == 'O':
                #en caso afirmativo anunciamos ganador y devolvemos el caracter ganador
                print("El Ganador es O")
                return ganador
            #y en cualquier otro caso significa que puedes ser que las casillas contengas '' o ' ' o '-' o '_' entonces no esta rellena la fila
            
    '''Ahora comprobamos si alguna columna es igual:'''
    
    #Guardamos las 3 filas del tablero
    fila1 = tablero[0]
    fila2 = tablero[1]
    fila3 = tablero[2]
    
    #Con un bucle for del 0 al 2 comprobamos si la primera,segunda y tercera posicion de cada fila es igual a la otra fila con la misma posicion (la columna)
    for i in range(0,3): 
        #miramos si la columna es igual
        if fila1[i] == fila2[i] and fila2[i] == fila3[i]:
            #en caso de que si guardamos el caracter que este en la columna
            ganador = fila1[i]
            #verificamos si es X
            if ganador == 'X':
                #anunciamos ganador y devolvemos la X
                print("El Ganador es X")
                return ganador
            #verificamos si es O
            elif ganador == 'O':
                #anunciamos ganador y devolvemos la O
                print("El Ganador es O")
                return ganador
            #en otro caso sera una columna vacia (sin jugada)

            
    '''Ahora comprobamos ambas diagonales'''
    
    #miramos la primera diagonal son todas iguales:
    if fila1[0] == fila2[1] and fila2[1] == fila3[2]:
        #en caso de que si hacemos lo mismo de antes verificamos si es X o O y anunciamos ganador y lo devolvemos
        ganador = fila1[0]
        if ganador == 'X':
            print("El Ganador es X")
            return ganador
        elif ganador == 'O':
            print("El Ganador es O")
            return ganador
    
    #Ahora repetimos lo mismo pero mirando la diagonal contraria:
    if fila1[2] == fila2[1] and fila2[1] == fila3[0]:
        ganador = fila1[0]
        if ganador == 'X':
            print("El Ganador es X")
            return ganador
        elif ganador == 'O':
            print("El Ganador es O")
            return ganador
        
    #Ahora comprobamos si en el tablero ya no se puede hacer mas jugadas para saber si es empate o sigue la partida:
    contadordejugadas=0
    #recorremos el tablero completo
    for i in range(len(tablero)):
        for j in range(len(tablero[i])):
            #y sumamos +1 al contador si encontramos una X o una O
            if tablero[i][j] == 'X' or tablero[i][j] == 'O':
                contadordejugadas += 1
              
    #Si al final encontramos 9 jugadas hechas (que son las maximas que se pueden hacer) significa finalmente que hay un empate:
    if contadordejugadas == 9:
        print("Empate! no hay ganador") 

#Partidas
tablero3EnRaya1=[
    ['X','X','O'],
    ['','X','O'],
    ['','','O']
]
tablero3EnRaya2=[
    ['X','O','X'],
    ['O','X','O'],
    ['O','X','O']
]
tablero3EnRaya3=[
    ['X','X','O'],
    ['O','X','X'],
    ['O','O','X']
]

tablero3EnRaya3=[
    ['X','X','X'],
    ['O','X','O'],
    ['O','O','']
]

#Ejemplos:
ComprobarGanadorTresEnRaya(tablero3EnRaya1)
ComprobarGanadorTresEnRaya(tablero3EnRaya2)
ComprobarGanadorTresEnRaya(tablero3EnRaya3)

print()
print()
print()

'''#Sudoku:'''

def ComprobarSudoku(tablero):
    '''Primero comprobamos las filas:'''
    
    #Recorremos las filas del tablero
    for i in range(len(tablero)):
        #cada vez que miremos una fila creamos una lista de numeros del 1 al 9
        listaNums = [1,2,3,4,5,6,7,8,9]
        #ahora recorremos cada posicion de la fila
        for j in range(len(tablero[i])):
            #miramos si el numero que recorremos esta en nuestra lista de numeros
            if tablero[i][j] in listaNums:
                #si es el caso recorremos la lista de numeros
                for x in range(len(listaNums)):
                    #y borramos de la lista de numeros el numero que recorremos de la fila
                    if listaNums[x] == tablero[i][j]:
                        #borramos y salimos ya que no hace falta recorrer el resto de la lista de numeros
                        listaNums.pop(x)
                        break
            #si no significa que ese numero ya ha sido eliminado por lo que esta repetido entonces significa que esa fila esta mal hecha
            #al estar mal hecha hace que el tablero ya este mal
            else:
                #asi que indicamos que perdiste y hacemos un return para salir (no hace falta seguir comprobando si ya perdiste)
                print("Perdiste! por Fila erronea")
                return
            
    '''Ahora comprobamos las columnas usando el mismo metodo:'''
            
    #ahora haremos exactamente lo mismo pero con las columnas:
    for i in range(len(tablero)):
        listaNums = [1,2,3,4,5,6,7,8,9]
        for j in range(len(tablero[i])):
            if tablero[j][i] in listaNums:
                for x in range(len(listaNums)):
                    if listaNums[x] == tablero[j][i]:
                        listaNums.pop(x)
                        break
            #pero en este caso indicamos que se perdio porque hay una columna mal
            else:
                print("Perdiste! por Columna erronea")
                return
            
    '''Ahora comprobamos los sectores 3x3:'''
    
    '''
    Para comprobar los sectores 3x3 diviremos en 9 el tablero completo:
    crearemos 3 mini tableros cada uno correspondiente a su parte
    lo haremos usando bucles con range de la siguiente forma:
    '''
    
    #inicializamos los 9 minitableros
    minitablero1 =[]
    minitablero2 =[]
    minitablero3 =[]
    minitablero4 =[]
    minitablero5 =[]
    minitablero6 =[]
    minitablero7 =[]
    minitablero8 =[]
    minitablero9 =[]
    
    #y ahora los rellenamos
    #mini tablero 1:
    #recorremos del 0 al 2
    for i in range(0,3):
        #creamos una fila vacia
        fila = []
        #recorremos del 0 al 2 igualmente
        for j in range(0,3):
            #y usamos un append con el tablero utilizando las posiciones usadas en los bucles range 0-3 y 0-3 significa que es el primer minitablerito del tablero grande
            fila.append(tablero[i][j])
        #finalmente agregamos esa fila al minitablero
        minitablero1.append(fila)
        
    #y hacemos esto con cada minitablero y buscando sus posiciones correspondientes:
        
    #mini tablero 2:
    for i in range(0,3):
        fila = []
        for j in range(3,6):
            fila.append(tablero[i][j])
        minitablero2.append(fila)
        
    #mini tablero 3:
    for i in range(0,3):
        fila = []
        for j in range(6,9):
            fila.append(tablero[i][j])
        minitablero3.append(fila)
        
    #mini tablero 4: 
    for i in range(3,6):
        fila = []
        for j in range(0,3):
            fila.append(tablero[i][j])
        minitablero4.append(fila)
        
    #mini tablero 5:
    for i in range(3,6):
        fila = []
        for j in range(3,6):
            fila.append(tablero[i][j])
        minitablero5.append(fila)
    
    #mini tablero 6:
    for i in range(3,6):
        fila = []
        for j in range(6,9):
            fila.append(tablero[i][j])
        minitablero6.append(fila)
        
    #mini tablero 7:
    for i in range(6,9):
        fila = []
        for j in range(0,3):
            fila.append(tablero[i][j])
        minitablero7.append(fila)
        
    #mini tablero 8:
    for i in range(6,9):
        fila = []
        for j in range(3,6):
            fila.append(tablero[i][j])
        minitablero8.append(fila)
        
    #mini tablero 9:
    for i in range(6,9):
        fila = []
        for j in range(6,9):
            fila.append(tablero[i][j])
        minitablero9.append(fila)
        
    #Ahora meto todos estos minitablero dentro una lista para tenerlos todos en 1 lugar
    todosLosMinis = [minitablero1] + [minitablero2] + [minitablero3] + [minitablero4] + [minitablero5] + [minitablero6] + [minitablero7] + [minitablero8] + [minitablero9]
    #recorro la lista de los ministableros
    for i in range(len(todosLosMinis)):
        #compruebo si ese minitablero a recorrer esta bien o mal hecho con una funcion
        if comprobarMiniTablero(todosLosMinis[i]):
            #en caso de que True significa que encontro que el minitablero esta mal anunciamos y que perdiste y hacemos un return
            print("Perdiste por tablero 3x3", todosLosMinis[i])
            return
    
    #En caso de llegar hasta significa que el tablero esta perfecto!
    print("TABLERO PERFECTO!")

#funcion para comprobar el minitablero esta bien hecho, funciona parecido que antes
def comprobarMiniTablero(tablero):
    #generamos una lista de numeros del 1 al 9 igual que antes pero solo la generamos 1 vez por tablero, (no 1 vez por fila o columna como habiamos hecho antes):
    #esto es asi porque queremos ver que todo el tablero tiene los numeros del 1 al 9 sin repetir
    listaNums = [1,2,3,4,5,6,7,8,9]
    #recorremos filas
    for i in range(len(tablero)):
        #recorremos cada posicion de las filas
        for j in range(len(tablero[i])):
            #comprobamos si el numero recorriendo esta en la lista
            if tablero[i][j] in listaNums:
                #si es asi recorremos la lista
                for x in range(len(listaNums)):
                    #y quitamos el numero recorriendo de la lista
                    if listaNums[x] == tablero[i][j]:
                        listaNums.pop(x)
                        break
            #si no significa que ya se elimino dicho numero entonces esta repetido por lo que esta mal el tablero
            else:
                #devolvemos un True y indicamos que se perdio!
                print("Perdiste! por MiniTablero erroneo")
                return True
    #si no pasa entonces devolvemos un False (que significa que el minitablero esta perfecto!)
    return False

#ejemplos:
tableroSudoku1=[
    [5,3,4,6,7,8,9,1,2],
    [6,7,2,1,9,5,3,4,8],
    [1,9,8,3,4,2,5,6,7],
    [8,5,9,7,6,1,4,2,3],
    [4,2,6,8,5,3,7,9,1],
    [7,1,3,9,2,4,8,5,6],
    [9,6,1,5,3,7,2,8,4],
    [2,8,7,4,1,9,6,3,5],
    [3,4,5,2,8,6,1,7,9]
]
tableroSudoku2=[
    [5,3,9,8,7,6,4,1,2],
    [7,2,8,3,1,4,9,6,5],
    [6,4,1,2,9,5,7,3,8],
    [4,6,2,5,3,9,8,7,1],
    [3,8,5,7,2,1,6,4,9],
    [1,9,7,4,6,8,2,5,3],
    [2,5,6,1,8,7,3,9,4],
    [9,1,3,6,4,2,5,8,7],
    [8,7,4,9,5,3,1,2,6]
]
tableroSudoku3=[
    [5,3,9,8,7,6,4,1,1],
    [7,2,8,3,1,4,9,6,5],
    [6,4,1,2,4,5,7,3,8],
    [4,6,2,5,3,9,8,7,1],
    [3,8,5,7,2,1,6,4,9],
    [1,9,7,4,6,8,2,5,3],
    [2,5,6,1,8,3,3,9,4],
    [9,1,3,6,4,2,5,8,7],
    [8,7,4,9,5,3,1,2,6]
]

#Comprobacion:
ComprobarSudoku(tableroSudoku1)
ComprobarSudoku(tableroSudoku2)
ComprobarSudoku(tableroSudoku3)