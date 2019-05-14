package Trabalho1.graphicCreator;

import java.util.Arrays;
import java.util.Vector;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Trabalho1.src.Zumbi.ITableProducer;

public class graphicCreator extends JFrame implements IgraphicCreator{
	private ITableProducer producer;
	private String[] attributes;
    private String[][] instances;
    private Vector<String> askedQuestionsList;
    private Vector<Vector<String>> possibleDiseasesGrid;
    private JPanel panel;
    private JTable table;
    private JScrollPane scrollPane;
	
	
    public graphicCreator() {
    	super("Possibles diseases according to the asked questions");
    	possibleDiseasesGrid = new Vector<Vector<String>>();
    	askedQuestionsList = new Vector<String>();
    }
    
	public void connect(ITableProducer producer) {
		this.producer = producer;
	}
	
	private Vector<String> possibleDiseases() {
		Vector<String> result = new Vector<String>();
		
		for (int i = 0; i < instances.length; i++) {
			if (!result.contains(instances[i][attributes.length-1])) {
				result.add(instances[i][attributes.length-1]);
			}
		}
		
		return result;
		
	}
	public void update(String askedQuestion) {
		// Tem que dar um jeito de atualizar a fonte de dados toda vez que for dar update, pra isso a componente que deleta linhas
		// vai ter que realmente deletar linhas do arquivo. Ideia: fazer o metodo requestAttributes e requestInstances chamar readDS
		
		this.attributes= producer.requestAttributes();
        this.instances = producer.requestInstances();
        
        askedQuestionsList.add(askedQuestion);
        possibleDiseasesGrid.add(possibleDiseases());
    
    }
	
	// Transforma linhas em colunas para usar na tabela
	private Vector<String[]> organizeData() {
		Vector<String[]> result = new Vector<String[]>();
		Vector<String> aux = new Vector<String>();
		Object[] aux_obj;
		
		
		// erro no result.add
		for (int i = 0; i < possibleDiseasesGrid.get(0).size(); i++) {
			aux.clear();
			for (int j = 0; j < askedQuestionsList.size();j++) {
				if (possibleDiseasesGrid.get(j).size() > i)
					aux.add(possibleDiseasesGrid.get(j).get(i));
			}
			aux_obj = aux.toArray();
			result.add(Arrays.copyOf(aux_obj, aux_obj.length,String[].class));
		}
		return result;
	}
	
    public void createGraphic() {
    	
    	
    	int i = 0;
    }
    public void connectTable(ITableProducer producer) {
    	this.producer = producer;
    }

    public static void main(String[] args) {
    	

    }
}
