d=int(input("Ingrese el numero de decenas:"))
p=float(input("Ingrese el preci por unidad:"))
if d>3:
    montotot=p*d*0.85
    obs=d-3
else: 
    montotot=p*d*0.9
    obs=0
print("El precio total de la compra es:",montotot,"El monto descontado es:")

suma_realizada = False
total = 0
a = 5
b = 10
if (suma_realizada==False):
   total= a + b
   suma_realizada = True
if (suma_realizada==True):
   print("se ha realizado una suma y su valor total es:",str (total),)
   


cant_manzanas=0
print("se ha iniciado el carrito. En total hay:" + str(cant_manzanas) + "manzanas.")
cant_manzanas=cant_manzanas + 1
cant_manzanas=0
print("se ha iniciado el carrito. En total hay:" + str(cant_manzanas) + "manzanas.")
cant_manzanas=cant_manzanas + 1


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