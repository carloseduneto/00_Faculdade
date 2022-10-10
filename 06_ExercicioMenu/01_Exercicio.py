
import json

#Funções do código
def AbrirArquivo(Caminho):
    Dados= None
    with open (Caminho, encoding="utf-8") as Arquivo:
        Dados= json.load(Arquivo)
    return Dados


def Informacoes(conteudoDaLista):
            print(f'Nome: {conteudoDaLista["Nome"]}')
            print(f'Email: {conteudoDaLista["Email"]}')
            print(f'CPF: {conteudoDaLista["CPF"]}')
            print(f'Endereço: {conteudoDaLista["Endereco"]}')
            print(f'Data de Nascimento: {conteudoDaLista["DataDeNascimento"]}')
            print('¨¨'*30)


def ListarTodos(dados):
    print ("---Listar Todos---")
    for conteudoDaLista in dados:
        Informacoes(conteudoDaLista)

def ListarPorCPF (dados, CPF):
    print(f'Buscar CPF: {CPF}')
    for conteudoDaLista in dados:
        if conteudoDaLista["CPF"] == CPF:
            Informacoes(conteudoDaLista)            
            return True

    return False


def AdicionarNovoRegistro():
    print("¨¨¨¨¨Adiciona novo registro¨¨¨¨¨")
    registro = {}    
    registro['Nome']=Nome=input ("Digite o nome: ")
    registro['CPF']=Nome=input ("Digite o CPF: ")
    registro['Email']=Nome=input ("Digite o Email: ")
    registro['Endereco']=Nome=input ("Digite o Endereço: ")
    registro['DataDeNascimento']=Nome=input ("Digite a Data de Nascimento: ")
    print(registro)
    return registro

def Salvar (Dados, Caminho):
    #Transformar de dict para json
    # Serializar Json
    ObjetoJson=json.dumps(Dados, indent=4)
    with open(Caminho, "w") as Saida: #W para escrever nele
        Saida.write(ObjetoJson)

#Exercício - implementar o código que exclui um determinado registro e posteriormente salve os dados no arquivo sem o registro da base de dados
def ExcluirRegistro(Dados, CPFExcluir):

            print("O CPF a ser excluído contém os seguintes registros: ")
            ListarPorCPF(Dados, CPFExcluir)
            ListaAposExcluir=[]
            Escolha4=input("Deseja excluir permanentemente o registro? ").lower()

            if Escolha4 in "sim":
                # print(len(BaseDados))
                for i in range (len(Dados)):
                    RegistroTemporario=Dados[i]
                    # print(RegistroTemporario["CPF"])
                    if CPFExcluir != RegistroTemporario["CPF"]:
                        ListaAposExcluir.append(RegistroTemporario)
                print("Registro Excluído com Sucesso!")
                Salvar(ListaAposExcluir,Caminho)
            elif Escolha4 in "nao" or Escolha4 in "não":
                print("Operação Cancelada")
                Salvar(Dados,Caminho)
    

#Código em si
Escolha=" "

#Condicionais
if __name__=="__main__":
    while Escolha != "5":
        print("▦"*30)
        print("1- Listar Todos")
        print("2- Listar por CPF")
        print("3- Adicionar novo registro")
        print("4- Excluir registro por CPF")
        print("5- Sair")
        print("▦"*30)
        Escolha=input(">>")
        if Escolha== "1":
            print("▦▦▦▦ Listar todos ▦▦▦▦")
            Caminho="./02_Fonte.json"
            BaseDados=AbrirArquivo(Caminho)
            print(BaseDados)

        elif Escolha=="2":
            Escolha2=" "
            while Escolha2 not in ("0sair") :
                Caminho="./02_Fonte.json"
                BaseDados=AbrirArquivo(Caminho)
                print("▦"*30)
                print("Escolha entre algum dos CPFs cadastrados: ")
                for ConteudoDaLista in BaseDados:
                    print(ConteudoDaLista["CPF"])
                print("▦"*30)
                print("1 - Consultar dados pelo CPF")
                print("0 - Sair")                 
                Escolha2=input(">>").lower()
                if Escolha2 == "1":
                    CPF=input("Digite o CPF:")
                    print("▦"*30)
                    ListarPorCPF(BaseDados, CPF)

        elif Escolha=="3":
                Caminho="./02_Fonte.json"
                BaseDados=AbrirArquivo(Caminho)
                NovoRegistro=AdicionarNovoRegistro()
                BaseDados.append(NovoRegistro)
                Salvar(BaseDados,Caminho)

        elif Escolha=="4":
            Caminho="./02_Fonte.json"
            BaseDados=AbrirArquivo(Caminho)
            CPFExcluir=input("Digite o CPF que deseja excluir o registo: ")
            ExcluirRegistro(BaseDados, CPFExcluir)

            



