print("¬(A^B)")
valores=[True, False]

VERDADE= 0
MENTIRA= 0

for a in valores:
    for b in valores:
        if not(a and b):
            FORMULA="Verdadeiro"
            VERDADE+=1
        else:
            FORMULA="Falso"
            MENTIRA+=1
        print (f"A = {a} \t B = {b} \t FÓMULA = {FORMULA}")
			
print()
print("¬A^¬B")
valores=[True, False]

VERDADE= 0
MENTIRA= 0

for a in valores:
    for b in valores:
        if not a and not b :
            FORMULA="Verdadeiro"
            VERDADE+=1
        else:
            FORMULA="Falso"
            MENTIRA+=1
        print (f"A = {a} \t B = {b} \t FÓMULA = {FORMULA}")
        
#Construa a fórmula equivalente utilizando apenas os conectivos "¬" e "v" 
print ("1) ¬A^¬B")
valores=[True, False]
VERDADE= 0
MENTIRA= 0

for a in valores:
    for b in valores:
         if a and b:
             FORMULA="Verdadeiro"
             VERDADE+=1
         else:
             FORMULA="Falso"
             MENTIRA+=1
         print (f"A = {a} \t B = {b} \t FÓMULA = {FORMULA}") 
print()
         
print ("2) P -> Q")
valores=[True, False]
VERDADE= 0
MENTIRA= 0

for p in valores:
    for q in valores:
         if not p or q:
             FORMULA="Verdadeiro"
             VERDADE+=1
         else:
             FORMULA="Falso"
             MENTIRA+=1
         print (f"P = {p} \t Q = {q} \t FÓMULA = {FORMULA}") 
         
print()

print ("3)(A ^ B) v C")
valores=[True, False]
VERDADE= 0
MENTIRA= 0

for a in valores:
    for b in valores:
        for c in valores:
            if not p or not q:
                FORMULA="Verdadeiro"
                VERDADE+=1
            else:
                 FORMULA="Falso"
                 MENTIRA+=1
            print (f"A = {a} \t B = {b} \t  C = {c} \t FÓRMULA = {FORMULA}") 
            
print()

print ("4)(A ^ B) v C")
valores=[True, False]
VERDADE= 0
MENTIRA= 0

for a in valores:
    for b in valores:
        for c in valores:
            if not p or not q:
                FORMULA="Verdadeiro"
                VERDADE+=1
            else:
                 FORMULA="Falso"
                 MENTIRA+=1
            print (f"A = {a} \t B = {b} \t  C = {c} \t FÓRMULA = {FORMULA}") 