def encontrar_caminho_labirinto(matriz, posicao_atual, posicao_final, caminho_atual=[]):
    caminho_atual.append(posicao_atual)

    if posicao_atual == posicao_final:
        return caminho_atual

    lin, col = posicao_atual
    posicoes_vizinhas = [(lin-1, col), (lin+1, col),
                         (lin, col-1), (lin, col+1)]
    posicoes_validas = []
    for posicao in posicoes_vizinhas:
        lin, col = posicao
        if 0 <= lin < len(matriz) and 0 <= col < len(matriz[0]) and matriz[lin][col] != 1 and posicao not in caminho_atual:
            posicoes_validas.append(posicao)

    if len(posicoes_validas) == 0:
        return None

    caminhos = []
    for posicao in posicoes_validas:
        novo_caminho = encontrar_caminho_labirinto(
            matriz, posicao, posicao_final, caminho_atual[:])
        if novo_caminho is not None:
            caminhos.append(novo_caminho)

    if len(caminhos) == 0:
        return None
    caminhos_ordenados = sorted(caminhos, key=len)
    return caminhos_ordenados[0]
