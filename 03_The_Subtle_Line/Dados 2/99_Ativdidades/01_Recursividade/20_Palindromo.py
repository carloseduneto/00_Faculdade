def subStringsPalindromos(s):
    def expandirPalindromo(i, j):
        while i >= 0 and j < len(s) and s[i] == s[j]:
            palindromo.add(s[i:j+1])
            i -= 1
            j += 1

    palindromo = set()
    for i in range(len(s)):
        # busca palíndromos com o caractere atual como centro
        expandirPalindromo(i, i)

        # busca palíndromos com dois caracteres iguais como centro
        expandirPalindromo(i, i+1)

    return palindromo


print(subStringsPalindromos("Antmeta"))
