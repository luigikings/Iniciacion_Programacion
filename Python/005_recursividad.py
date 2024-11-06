'''
Queremos ver una lista de forma recursiva, cada vez que entremos en una estructura de almacenamiento deberemos dejar más espacios para así ver el árbol que genera la representación gráfica de una forma visual. Además, queremos dar más información visual:

    • Si estoy dentro de una lista usaremos el siguiente separador ->
    • Si estoy dentro de un diccionario usaremos el siguiente separador.>
    • Si estoy dentro de una tupla usaremos el siguiente separador _>
    • Si estoy dentro de un Set usaremos el siguiente separador =>

l = [1,2,3,(1,2,3),4,5,6,[1,{"key1":1,"key2":2,"key3":{"Alumno1","Alumno2",True}},{1,2,3}]]

verListaRecursivaConTipoDatos(l,0,type(l))
'''

l = [1,2,3,(1,2,3),4,5,6,[1,{"key1":1,"key2":2,"key3":{"Alumno1","Alumno2",True}},{1,2,3}]]

def verListaRecursivaConTipoDatos(lista,espacio):
    num = 0
        
    if type(lista) == list:
        operador = "->"
    elif type(lista) == dict:
        operador = ".>"
    elif type(lista) == tuple:
        operador = "_>"
    elif type(lista) == set:
        operador = "=>"
    for i in range(len(lista)):
        if espacio == 1:
            print("     ",end="")
        
        if type(lista[i]) == int:
            print(num,operador,lista[i])
            num += 1
        else:
            print(num,operador,type(lista[i]))
            verListaRecursivaConTipoDatos(lista[i],1)
            
verListaRecursivaConTipoDatos(l,0)