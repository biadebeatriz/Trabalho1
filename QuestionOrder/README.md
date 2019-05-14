# Trabalho Grupo Um

# Componente chooseQuestionOrder

Campo | Valor
----- | -----
Classe | <Trabalho1.QuestionOrder> 
Autores | Lucas André
Objetivo | Escolher a melhor ordem de perguntas possível 
Interface | QuestionOrder
~~~

public interface QuestionOrder {
  public ArrayList<Integer> CQO();
}
~~~

## Detalhamento da Interface

### Interface QuestionOrder`
Interface provida capaz de analisar a tabela de doenças e à partir dela retornar a ordem de perguntas que elimina o maior número possível de doenças candidatas.
 
Método | Objetivo
-------| --------
`CQO` | A partir de um algoritmo guloso (Em trabalho), identifica qual a ordem de questões que elimina a maior quantidade de doenças.
