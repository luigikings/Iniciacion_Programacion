#Funciones (def)
def funcionQueNoDevuelveNada():
    print("Hola")
    
    
def funcionConParametros(parametro1,parametro2):
    print("el parametro 1 es:",parametro1)
    print("el parametro 2 es:",parametro2)
    
def funcionConParametros(para1):
    print("el parametro 1 es:",para1)
    
funcionConParametros(13)

def funcionConReturn():
    return "Este es el return"

print(funcionConReturn())

def funcionConMultiplesReturn():
    return 1,2,3,4

#Podemos guardar varios returns de una funcion
print(funcionConMultiplesReturn())
var,var1,var2,var3 = funcionConMultiplesReturn()
print(var,var1,var2,var3)
#Se usa _ para ignorar una varaible


#Funcion recursivas:
def fibonacci(n):
    f=[0,1]
    r=0
    for i in range(0,n-1):
        r=f[i]+f[i+1]
        f.append(r)
    return f

print(fibonacci(10))

def fibonacciRecursivo(n):
    if n==0:
        return 0
    if n==1:
        return 1
    else:
        return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2)
    
print(fibonacciRecursivo(10))