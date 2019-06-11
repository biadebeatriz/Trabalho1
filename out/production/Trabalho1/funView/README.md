# Trabalho Grupo Um
Trabalho mais top que tem de mc322

# Componente FunView

Campo | Valor
----- | -----
Classe | <Trabalho1.InterfaceGrafica> 
Autores | Beatriz Siqueria
Objetivo | Ilustrar de maneira bonitinha os pacientes e o doutor 
Interface | FunView
~~~

public interface IgraphicCreator {
  public void update();
  public void createGraphic();
  public void connectTable(ITableProducer producer);
}
~~~

## Detalhamento da Interface

### Interface IgraphicCreator`
Interface provida capaz de inicializar o atendimento do zombie graficamente. E mostrar os zombies sendo atendidos. 
 
Método | Objetivo
-------| --------
`update` | Adiciona um "estado" a mais no gráfico das possiveis doenças a partir do estado atual da tabela fonte de dados.
`createGraphic` | Cria o gráfico final baseado nos estados que já foram adicionados pelo método update e o mostra na tela.
`connectTable` | Conecta essa componente com a fonte de dados, que no caso é a tabela de casos. 
