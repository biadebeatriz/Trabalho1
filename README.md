# Trabalho Grupo Um
O objetivo desse trabalho é a implementação de um programa capaz de simular o diagnóstico da doença de um Paciente por um Doutor através de diversas perguntas feitas pelo mesmo de forma com que o diagnóstico seja feito rapidamente, ou seja, menos perguntas sejam necessárias. Além disso também serão implementadas interfaces gráficas para melhor visualização da situção e dos resultados.

Para cumprir esse objetivo o trabalho foi dividido em componentes, cujo resumo de cada uma está abaixo e sua documentação detalhada em sua respectiva pasta.

### Componente graphicCreator
Gerar um gráfico que mostra a variaço do número possivel de doenças conforme o médico faz perguntas ao paciente.

### Componente chooseQuestionOrder
Faz uma busca na tabela dada para definir a ordem de perguntas que se elimina o maior número de doenças em potêncial.

### Componente reduceTable
Reduz a tabela de doenças de acordo com a resposta obtida do paciente e notifica as componentes nextQuestion e graphicCreator, de acordo com o pattern Observer.

### Componente funView
Inicializa visualmente o programa, e ilustrar de maneira bonitinha os pacientes e o doutor.

