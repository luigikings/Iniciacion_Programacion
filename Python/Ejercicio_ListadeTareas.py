'''
Se quiere crear un programa en Python para gestionar una listade tareas pendientes. El programa
debe permitir al usuario agregar nuevas tareas, marcar tareas como completadas, eliminar tareas de la lista
y ver todas las tareas pendientes.
   
El programa debe de comenzar mostrando un menú de opciones al usuario, donde pueda seleccionar la
operación que desea realizar. Se elige agregar una nueva tarea, debe ingresar la descripción de la tarea y agreagarla
a la lista de tareas pendientes.Si se marca una tarea como completa, debe mostrar la lista de tareas pendientes
y permitir al usuario seleccionar la tarea que desea marcar como completa.
   
Cuando un usuario completa una tarea, debe eliminarse de la lista de tareas pendientes y agregarse a la lista
de tareas completas. Ahi se almacena su descripción y la fecha en la que se completo. El programa tambien debe
permitir a el usuario eliminar tareas pendientes si ya no son necesarias.
   
Para ayudar al usuario a mantenerse organizado debe haber una opción para ver tods las tareas pendientes mostrando
descripción y ID unico. Esto facilita la referencia cuando el usuario quiera eliminar una tarea.
'''
import random
class Tarea:
    
    #Constructor:
    def __init__(self,id,descripcion,fechaInicio,):
        self.id = id
        self.descripcion = descripcion
        self.fechaCompletada = ""
        self.fechaInicio = fechaInicio
        self.completada = False
    
    #Funcion para marcar como completada la tarea: (Cambiar estado y agregar fecha fecha finalizacion):
    def completarTarea(self):
        self.completada = True
        print("Indica la fecha Actual de finalizacion:")
        fecha = input()
        self.fechaCompletada = fecha
        print("Cambio de Estado!")
        
    #Funcion para mostrar toda la info de la tarea:
    def mostrarInfo(self):
        print("Id:",self.id,"Descripcion:",self.descripcion,"Fecha Completada:",self.fechaCompletada,"Fecha Inicio:",self.fechaInicio,"Completada:",self.completada)
        
    #Funcion para devolver el id
    def getId(self):
        return self.id
        
class GestionTarea:
    
    #Constructor:
    def __init__(self):
        self.listaPendiente = []
        self.listaCompletado = []
        
    #Funcion Menu Principal:
    def menuPrincipal(self):
        print("Bienvenido a tu gestor de Tareas!")
        print("Elige que opcion quieres?")
        
        print("1: Agregar Tarea")
        print("2: Eliminar Tarea")
        print("3: Mostrar Tareas Pendientes")
        print("4: Completar Tarea")
        
        usuario = input()
        
        if usuario == 1:
            print("Creemos una tarea:")
            #id
            comprobador = True
            while(comprobador):
                id = random.randint(0,999)
                for tarea in self.listaPendiente:
                    idtarea = tarea.getId()
                    if idtarea != id:
                        comprobador = False
            #Descripcion
            desc = input("Pon la Descripcion:")
            #Fecha
            fecha = input("Pon la fecha de hoy")
            tarea = Tarea(id,desc,fecha)
            self.agregarTarea(tarea)
            
        elif usuario == 2:
            print("Elige que tarea deseas eliminar:")
            self.mostrarTareasPendientes()
            idTarea = input("id de la tarea a elegir:")
            tareaEliminar = None
            for tarea in self.listaPendiente:
                if tarea.getId() == idTarea:
                    tareaEliminar = tarea
            if tareaEliminar == None:
                print("No esta ese ID mamabicho!")
            else:
                self.eliminarTarea(tareaEliminar)
        
        elif usuario == 3:
            print("Tareas Pendientes:")
            self.mostrarTareasPendientes
            
        elif usuario == 4:
            print("Elige que tarea deseas marcar como COMPLETADO:")
            self.mostrarTareasPendientes()
            idTarea = input("id de la tarea a completar:")
            tareaCompletada = None
            for tarea in self.listaPendiente:0
                if tarea.getId() == idTarea:
                    tareaEliminar = tarea
            
    #Funcion para agregar una tarea a una lista:
    def agregarTarea(self,tarea):
        self.listaPendiente.append(tarea)
        print("Tarea Agregada!!")
        print()
    
    #Funcion para eliminar una tarea a una lista:
    def eliminarTarea(self,tarea):
        if tarea in self.listaPendiente:
            self.listaPendiente.pop(tarea)
    
    #Funcion para mostrar la lista de Tareas:
    def mostrarTareasPendientes(self):
        print(list(map()))
            
    #Funcion para completar una tarea y moverla de lista (completada!)
    def moverTareaLista(self,tarea):
        self.listaPendiente.pop(tarea)
        tarea.completarTarea()
        self.listaCompletado.append(tarea)
        print("Tarea Completada!")
        

#Main:

    

