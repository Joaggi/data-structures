class LinkedList():

    def __init__(self):
        self.dato = None
        self.siguiente = None



    
datoInicial = LinkedList() # Creo un objeto de tipo LinkedList 

datoInicial.dato = 3 # Asignado un dato 3 al objeto creado anteriormente

datoSegundo = LinkedList()

datoSegundo.dato = 10

datoInicial.siguiente = datoSegundo

print(datoInicial.dato)
print(datoInicial.siguiente.dato)