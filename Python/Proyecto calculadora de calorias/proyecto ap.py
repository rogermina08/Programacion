#PROYECTO

#Roger Andres Mina Rodriguez 1740928
#Anderson Pelaez Rivera 1747225

# PROGRAMA QUE CALCULA LAS KILOCALORIAS DE ALGUNOS ALIEMENTOS POR PORCION EN GRAMOS 


from tkinter import*
def calcular():
      x=Ealimento.get()
      y=float(Ecantidad.get())
      
      if(x=="arroz"):
          calorias=(3.54*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="avena"):
          calorias=(3.67*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="harina"):
          calorias=(3.53*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="pan"):
          calorias=(2.55*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="yuca"):
          calorias=(3.38*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="arveja"):
          calorias=(3.4*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="garbanzos"):
          calorias=(3.61*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="lentejas"):
          calorias=(3.36*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="huevo"):
          calorias=(1.62*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="galletas"):
          calorias=(4.64*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="azucar"):
          calorias=(3.8*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="miel"):
          calorias=(3*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="fresas"):
          calorias=(0.36*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="mandarina"):
          calorias=(0.4*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="mango"):
          calorias=(0.57*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="manzana"):
          calorias=(0.52*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="naranja"):
          calorias=(0.44*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="papaya"):
          calorias=(0.45*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="pera"):
          calorias=(0.61*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="piña"):
          calorias=(0.51*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="platano"):
          calorias=(0.90*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="uva"):
          calorias=(0.81*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="almendras"):
          calorias=(6.2*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="mani"):
          calorias=(5.6*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="queso"):
          calorias=(0.92*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="leche"):
          calorias=(0.68*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="lomo de cerdo"):
          calorias=(2.08*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="muslo de pollo"):
          calorias=(1.86*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="atun en lata con aceite"):
          calorias=(2.8*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
      if(x=="atun en lata con agua"):
          calorias=(1.27*y)
          Ecalorias.delete(0,END)
          Ecalorias.insert(0,calorias)
    
gui=Tk()
gui.geometry("350x250")



Ealimento=Entry(gui,width=30)
Ecantidad=Entry(gui,width=30)
Ecalorias=Entry(gui,width=30)

Lejemplos=Label(gui,text="ALIMENTOS: arroz,avena,harina,pan,yuca,arvejas") 
Lejemplo=Label(gui,text="garbanzos,lentejas,huevo,galletas,azucar,miel,fresas")
Lejempl=Label(gui,text="mandarina,mango,manzana,naranja,papaya,pera")
Lejemp=Label(gui,text="piña,platano,uva,almendras,mani,queso")
Lejem=Label(gui,text="leche,lomo de cerdo, muslo de pollo")
Leje=Label(gui,text="atun en lata con aceite, atun en lata con agua")

Lalimento=Label(gui,text="ALIMENTO")
Lcantidad=Label(gui,text="GRAMOS POR PORCION")

Bcalorias=Button(gui,text="Calcular Kcal.",command=calcular)


Lejemplos.pack()
Lejemplo.pack()
Lejempl.pack()
Lejemp.pack()
Lejem.pack()
Leje.pack()


Lalimento.pack()
Ealimento.pack()

Lcantidad.pack()
Ecantidad.pack()

Bcalorias.pack()
Ecalorias.pack()

gui.mainloop()

