package Interfaces;

import Trabalho1.src.Zumbi.ITableProducer;
import Trabalho1.src.Zumbi.ITableProducerReceptacle;

public interface IgraphicCreator extends ITableReceptacle{
	  public void update(String askedQuestion);
	  public void createGraphic();
}
