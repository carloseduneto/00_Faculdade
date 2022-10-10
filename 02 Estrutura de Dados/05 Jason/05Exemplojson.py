from email.mime import base
import json



# for registro in dados:
#     print(f"Nome: {registro['Nome']}")
#     print(f"Email: {registro['Email']}")


def AbrirArquivo(Caminho):
    dados= None
    with open (Caminho, encoding="utf-8") as arquivo:
        dados= json.load(arquivo)

    return dados

def Informacoes(conteudoDaLista):
            print(f'Nome: {conteudoDaLista["Nome"]}')
            print(f'Email: {conteudoDaLista["Email"]}')
            print(f'CPF: {conteudoDaLista["CPF"]}')
            print(f'Endereço: {conteudoDaLista["Endereço"]}')
            print(f'Data de Nascimento: {conteudoDaLista["Data de Nascimento"]}')
            print('¨¨'*30)

def listarTodos(dados):
    print ("---Listar Todos---")
    for conteudoDaLista in dados:
        Informacoes(conteudoDaLista)

def listarPorCPF (dados, CPF):
    print(f'Buscar CPF: {CPF}')
    for conteudoDaLista in dados:
        if conteudoDaLista["CPF"] == CPF:
            Informacoes(conteudoDaLista)            
            return True

    return False

def Adicionar():
    print("¨¨¨¨¨Adiciona novo registro¨¨¨¨¨")
    registro = {}    
    registro['Nome']=Nome=input ("Digite o nome: ")
    registro['CPF']=Nome=input ("Digite o CPF: ")
    registro['Email']=Nome=input ("Digite o Email: ")
    registro['Endereço']=Nome=input ("Digite o Endereço: ")
    registro['Data de Nascimento']=Nome=input ("Digite a Data de Nascimento: ")
    print(registro)
    return registro

def Salvar (Dados, Caminho):
    #Transformar de dict para json
    # Serializar Json
    ObjetoJson=json.dumps(Dados, indent=4)
    with open(Caminho, "w") as Saida: #W para escrever nele
        Saida.write(ObjetoJson)


#Exercício - implementar o código que exclui um determinado registro e posteriormente salve os dados no arquivo sem o registro da base de dados
def Excluir(Dados, CPF):
    pass
    




if __name__ =="__main__": #só vai executar se estiver dentro desse arquivo, e usa as funções
    Caminho="./04Ex.json"
    baseDados=AbrirArquivo(Caminho)
    print(baseDados)
    listarTodos(baseDados)
    listarPorCPF(baseDados, 15478966658)
    NovoRegistro=Adicionar()
    print (type(NovoRegistro))
    print(type(baseDados))
    baseDados.append(NovoRegistro)
    listarTodos(baseDados)
    Salvar(baseDados, Caminho)
    