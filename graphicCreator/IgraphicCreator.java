package graphicCreator;

import Trabalho1.src.Zumbi.ITableProducer;
import Trabalho1.src.Zumbi.ITableProducerReceptacle;

public interface IgraphicCreator extends ITableProducerReceptacle{
	  public void update(String askedQuestion);
	  public void createGraphic();
}
