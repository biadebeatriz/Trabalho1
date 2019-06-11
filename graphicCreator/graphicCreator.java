package graphicCreator;

import java.util.Arrays;
import java.util.Vector;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import Interfaces.*;


public class graphicCreator implements IgraphicCreator{
	private ITableProducer producer;
	private String[] attributes;
    private String[][] instances;
    private Vector<String> askedQuestionsList;
    private Vector<Vector<String>> possibleDiseasesGrid;
    private JPanel panel;
    private JTable table;
    private JScrollPane scrollPane;
    private boolean Isvisible;
	
	
    public graphicCreator(boolean isGrafico) {
    	possibleDiseasesGrid = new Vector<Vector<String>>();
    	askedQuestionsList = new Vector<String>();
    	this.Isvisible = isGrafico;
    }

	public Vector<String> possibleDiseases() {
		Vector<String> result = new Vector<String>();
		
		for (int i = 0; i < instances.length; i++) {
			if (!result.contains(instances[i][attributes.length-1])) {
				result.add(instances[i][attributes.length-1]);
			}
		}
		
		
		return result;
		
	}
	
	
	public void connect(ITableProducer producer) {
		this.producer = producer;
    	this.instances = producer.requestInstances();
    	this.attributes = producer.requestAttributes();
        askedQuestionsList.add("Before any question");
        possibleDiseasesGrid.add(possibleDiseases());
	}
	
	public void updateTable(String[][] instances) {
		this.instances = instances;
	}

	public void update(String askedQuestion) {

        askedQuestionsList.add("After asking about "+askedQuestion);
        possibleDiseasesGrid.add(possibleDiseases());
    
    }
	
	// Transforma linhas em colunas para usar na tabela
	private Vector<Vector<String>> organizeData() {
		Vector<Vector<String>> result = new Vector<Vector<String>>();
		Vector<String> aux;

		for (int i = 0; i < possibleDiseasesGrid.get(0).size(); i++) {
			aux = new Vector<String>();
			for (int j = 0; j < askedQuestionsList.size();j++) {
				if (possibleDiseasesGrid.get(j).size() > i) {
					aux.add(possibleDiseasesGrid.get(j).get(i));
				}
				else
					aux.add("");
			}

			result.add(aux);

		}
		return result;
	}
	
    public void createGraphic() {
    	JFrame frame = new JFrame("Possibles diseases according to the asked questions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable(organizeData(), askedQuestionsList);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(600, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(this.Isvisible);
    }

}
