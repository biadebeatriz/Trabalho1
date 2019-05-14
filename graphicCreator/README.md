# Componente graphicCreator

Campo | Valor
----- | -----
Classe | `<caminho completo da classe com pacotes>` <br> Exemplo: `pt.c08componentes.s20catalog.s10ds.DataSetComponent`
Autores | `Guilherme Correa
Objetivo | `Gerar um gráfico que mostra a variaço do número possivel de doenças conforme o médico faz perguntas ao paciente
Interface | `IgraphicCreator
~

public interface IgraphicCreator {
  public void update();
  public void createGraphic();
  public void connectTable(ITableProducer producer);
}
~

## Detalhamento da Interface

### Interface IgraphicCreator`
Interface provida para ser capaz de criar um grafico conforme Objetivo.

Método | Objetivo
-------| --------
`update` | Adiciona um "estado" a mais no gráfico das possiveis doenças a partir do estado atual da tabela fonte de dados.
`createGraphic` | Cria o gráfico final baseado nos estados que já foram adicionados pelo método update e o mostra na tela.
`connectTable` | Conecta essa componente com a fonte de dados, que no caso é a tabela de casos.
