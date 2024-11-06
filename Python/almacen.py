class Almacen:
    
    def __init__(self) -> None:
        self.elementos = dict()
    
    def agregarElemento(self,elemento):
        if isinstance(elemento,dict):
            return
        nombreClase = elemento.__class__.__name__
        if nombreClase in self.elementos.keys():
            aux = self.elementos[nombreClase]
            aux.append(elemento)
            self.elementos[nombreClase]= aux
        else:
            aux = [elemento]
            self.elementos[nombreClase]=aux
            
    def getAlmacen(self):
        return self.elementos
            
            
        
        
alma = Almacen()

alma.agregarElemento("holis")
alma.agregarElemento("holis")
alma.agregarElemento(3)
alma.agregarElemento(2)
alma.agregarElemento([2,4,5])
print(alma.getAlmacen)