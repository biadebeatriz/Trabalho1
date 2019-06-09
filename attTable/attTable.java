package attTable;
import java.util.Arrays;
import java.util.Vector;

import Zumbi.*;
import zumbi.Interfaces.IRedutorPossibilidades.*;
import Interfaces.*;

public class attTable implements IattTable{
	private Vector<ITableReceptacle> receptacles;
	private ITableProducer producer;
	private String[] attributes;
    private String[][] instances;
    private IRedutorPossibilidades redutor;
    
	public attTable() {
		receptacles = new Vector<ITableReceptacle>();
	}
	
	// Conecta com o DScomponent e pega a primeira tabela
	public void connect(ITableProducer producer) {
		this.producer = producer;
		this.attributes= producer.requestAttributes();
        this.instances = producer.requestInstances();
	}
	
	
	public void connect(IRedutorPossibilidades redutor) {
		this.redutor = redutor;
	}
	
	public void attach(ITableReceptacle tableReceptacle) {
		receptacles.add(tableReceptacle);
	}
	
	public void notifyReceptacle() {
		for (ITableReceptacle receptacle: receptacles)
			receptacle.updateTable(instances);
	}
	
	public void update(int pergunta, String resposta) {
		System.out.println("instancias antes");
    	for (int i = 0; i < instances.length ; i++) {
    		for (int j =0 ; j < instances[0].length ; j++) {
    	    	System.out.print(instances[i][j]);

    		}
        	System.out.println();
    	}
		instances = redutor.novaTabela(instances, pergunta, resposta);
		System.out.println("instancias dps");
    	for (int i = 0; i < instances.length ; i++) {
    		for (int j =0 ; j < instances[0].length ; j++) {
    	    	System.out.print(instances[i][j]);

    		}
        	System.out.println();
    	}
		notifyReceptacle();
	}
}