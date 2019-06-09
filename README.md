# Trabalho Grupo Um
O objetivo desse trabalho é a implementação de um programa capaz de simular o diagnóstico da doença de um Paciente por um Doutor através de diversas perguntas feitas pelo mesmo de forma com que o diagnóstico seja feito rapidamente, ou seja, menos perguntas sejam necessárias. Além disso também serão implementadas interfaces gráficas para melhor visualização da situção e dos resultados.

Para cumprir esse objetivo o trabalho foi dividido em componentes, cujo resumo de cada uma está abaixo e sua documentação detalhada em sua respectiva pasta.

# Componente graphicCreator
Gerar um gráfico que mostra a variaço do número possivel de doenças conforme o médico faz perguntas ao paciente.

Campo | Valor
----- | -----
Classe | graphicCreator.graphicCreator
Autores | Guilherme Correa
Objetivo | Gerar um gráfico que mostra a variaço do número possivel de doenças conforme o médico faz perguntas ao paciente
Interface | IgraphicCreator
	
~~~

public interface IgraphicCreator extends ITableReceptacle {
   public void update(String askedQuestion);
	 public void createGraphic();
}

public interface ITableReceptacle {
	public void updateTable(String[][] instances);
	public void connect(ITableProducer producer);
}

~~~

## Detalhamento da Interface

## Interface IgraphicCreator`
Interface provida para ser capaz de criar um grafico conforme Objetivo.

Método | Objetivo
-------| --------
`update` | Adiciona um "estado" a mais no gráfico das possiveis doenças a partir do estado atual da tabela fonte de dados.
`createGraphic` | Cria o gráfico final baseado nos estados que já foram adicionados pelo método update e o mostra na tela.

## Interface ITableReceptacle
Interface dos observers de attTable, cujo objetivo é atualizar a tabela desses componentes.

Método | Objetivo
-------| --------
`updateTable` | Atualiza a tabela com a passado por parâmetro.
`connect` | Conecta com uma fonte de dados inicial.



# Componente nextQuestion
Faz uma busca na tabela dada para definir a ordem de perguntas que se elimina o maior número de doenças em potêncial.

# Componente attTable
Seguindo o pattern Observer, essa componente é responsável por diminuir a tabela a cada resposta obtida do paciente e notificar os observers, que no caso são as componentes nextQuestion e graphicCreator. Utiliza a componente RedutorPossibilidades do grupo OsMatitos.

Campo | Valor
----- | -----
Classe | attTable.attTable
Autores | Guilherme Correa
Objetivo | Atualizar a tabela de sintomas e notificar as componentes que a utilizam.
Interface | IattTable
	
~~~

public interface IattTable extends ITableProducerReceptacle{
	public void attach(ITableReceptacle tableReceptacle);
	public void notifyReceptacle();
	public void update(int pergunta, String resposta);
	public void connect(IRedutorPossibilidades redutor);
}


~~~

## Detalhamento da Interface

## Interface IattTable`
Interface provida para ser capaz de atualizar a tabela e notificar as componentes que a utilizam, ela extende a interface ITableProducerReceptacle para obter uma tabela inicial.

Método | Objetivo
-------| --------
`attach` | Conecta uma componente observadora a ela, afim de a notificar quando a tabela é atualizada.
`notifyReceptacle` | Notifica as componentes que utilizam a tabela de que ela foi alterada.
`update` | Atualiza a tabela de acordo com a resposta de uma determinada pergunta feita ao paciente.
`connect` | Se conecta a componente RedutorPossibilidades


# Componente funView
Inicializa visualmente o programa, e ilustrar de maneira bonitinha os pacientes e o doutor.

