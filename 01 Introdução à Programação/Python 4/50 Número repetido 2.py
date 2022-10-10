num=[""]*10


for i in range(10):
    num[i]=(input(f"\nDigite o {i+1}º número: "))
    for j in range (0, i, +1):
        while num[i]==num[j]:
            print("\nNúmero já digitado!")
            num[i]=(input(f"\nDigite o {i+1}º número: "))
            
'''
import os

def clearConsole():
    command = 'clear'
    if os.name in ('nt', 'dos'):  # If Machine is running on Windows, use cls
        command = 'cls'
    os.system(command)

clearConsole()
'''

