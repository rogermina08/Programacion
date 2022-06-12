# Laboratorio N°3
# Roger Andrés Mina Rodriguez 1740928
# Anderson Pelaez 1747225 


c=int(input("Digite la cantidad de personas a encuestar:"))

x=0
y=0
z=0
w=0

for i in range(1,c+1,1):
    sexo=int(input("Digite su sexo:"))
    laboral=int(input("Digite su condición laboral:"))

    if (sexo==2 and laboral==1):
        x=x+1

    if (sexo==1 and laboral==2):
        y=y+1

    if (sexo==2):
        z=z+1

    if (sexo==1):
        w=w+1
        
        
              
porcentaje=(w/c)*100

print ("Total de mujeres que trabajan:",x)
print ("Total de hombres desempleados:",y)
print ("Total mujeres:",z)
print ("Porcentaje de hombres:",porcentaje)             
              
              
