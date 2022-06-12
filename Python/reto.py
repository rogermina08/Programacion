

from _typeshed import HasFileno
from typing import MutableSet


peso=float(input())
altura=float(input())
imc=peso/(altura*altura)
if imc<17.5 :
    print("Bajo peso")
if 17.6<imc<23.8 :
    print("Normal") 
if 23.9<imc<27.8 :
    print("Sobrepeso") 
if 27.9<imc :
    print("Obeso") 
    


    print ("se ha iniciado el carrito. en total hay: 0 manzanas.")
    r=5*i
    for i in range (1, 6):  
     print("se ha agregado una manzana a la canasta, ahora hay:" + str(r
     ) +"mazanas")

x=int(input("Ingresa el numero del cual quieres el factorial"))

for i in range  (1,x):
  x=x*i
  i+=1

print("el factorial de tu numero es:" + str(x))



y=0.0
for i in range(1,21,1):
    y= y+2/(i*i)
print("El valor de y es:",y)


manzanas=5
cont_manzanas=0
print("se ha iniciado el carrito. en total hay:" +  str(cont_manzanas) + "manzanas.")

while (cont_manzanas<manzanas):
    cont_manzanas=cont_manzanas+1
    print("se ha agregado una manzana a la canasta. ahora hay" + str(cont_manzanas) + "manzanas."
    )
    


    nombre=input("Escriba su nombre:")
    sexo=input("Digite su sexo, hombre o mujer:")
    edad=int(input("Cuántos años tiene:"))
    sexo=0
    while 18<edad<=70:
        if sexo=="hombre":
             sexo= sexo + 1
             print("En total hay:",sexo,"hombres")
        if sexo=="mujer":
              sexo= sexo + 1
              print("En total hay:",sexo,"mujeres")
        if edad>70 and sexo=="mujer":
             cant= sexo + 1
             print("Su nombre es:",nombre,"y tiene:",edad)
             print("En total hay:",cant,"mujeres mayores de 70 años")
        

temperatura=float(input())
f=float((9*temperatura)+(32*5))/5
if 103.3 <=temperatura <=119.3 :
    print(f)
    while 103.3 <=temperatura <=119.3:
      f=f-1
      print(f)
      if f<202.3 :
          break
          
    
else:
    f=float((9*temperatura)+(32*5))/5
    print(f)






variable=int(input())

while variable > 0:
    print ("Actual valor de variable:", variable)
    variable = variable -1
    if variable == 5:
        break

a=float(input())
b=float(input())
def function (a,b):
   z=a*a*b
   return z
print (function(234,67))


def mcd(n,m):
    rest=0
    while (m>0):
        rest=m
        m=n%m
        n=rest
        return n
a=mcd(50,11)
print(a)



def  calculoCostoHuevos(cantAAA,cantAA,cantA,cantB,cantC):
     costoAAA=550*cantAAA
     costoAA=450*cantAA
     costoA=350*cantA
     costoB=150*cantB
     costoC=100*cantC
     total=costoAAA+costoAA+costoA+costoB+costoC
     return f"costoAAA:{costoAAA} "f"costoAA:{costoAA} "f"costoA:{costoA} "f"costoB:{costoB} "f"costoC:{costoC} "f"costo total:{total} "
calculoCostoHuevos(12,2,35,78,5)


def calculadoraMes(registroDeAhorros,nombre):
        xdats=registroDeAhorros.split(";")
        for i in range (len(xdats)):
            xdats[i]=xdats[i].split(",")
            totalMes=""
        print(registroDeAhorros,nombre)
        suma=0
        for j in range (1,len(xdats[i])):
           suma = suma+int(xdats[1][i])
        return nombre,xdats, suma
calculadoraMes("enero:,6000,7000,345;marzo:,230,900,7;febrero:,45,56,78,8","roger")

Numeros=numpy.zeros((50,4))
suma=0.0
for i in range(0,50,1):
  for j in range(0,4,1):
   suma = suma + numeros[i][j]
print("La suma es",suma)