var = [1,1,1,2,3,4,1,2,3,4,5]

var1 = {5,1,1,2,3,4,1,2,3,4,5}
print(var1)

var1.add(1)
var1.add("1")
var1.add((1,2,3))
#En los sets no se pueden agregar listas

print(var1)

var1.discard(3)
print(var1)

var2={"a","b"}

#Como contatenar sets: (usando update)
var1.update(var2)
print(var1)