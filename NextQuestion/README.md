# Trabalho Grupo Um

# Componente chooseNextQuestion

Campo | Valor
----- | -----
Classe | <Trabalho1.NQ> 
Autores | Lucas André
Objetivo | Escolher a melhor próxima pergunta a se fazer
Interface | NextQuestion
~~~

public interface NextQuestion {
    public String nextQ(String tabela[[]]);
}
~~~

## Detalhamento da Interface

### Interface QuestionOrder`
Interface provida capaz de analisar a tabela de doenças e à partir dela retornar a próxima melhor pergunta.
 
Método | Objetivo
-------| --------
`CQO` | Analisa a tabela, coluna por coluna e vê qual delas tem a melhor distribuição de F e V para eliminar o maior caso de doenças possível na próxima pergunta.
