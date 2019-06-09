package Zumbi;

import graphicCreator.*;

public class Consultar {
    public static void main(String[] args){

        // instanciando o componente DataSet
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("/home/guiloko/eclipse-workspace/Projeto322/src/zombie-health-spreadsheet-ml-training.csv");

// instanciando o componente paciente
        IPatient aPatient = new Patient();

// conectando-o no componente DataSet
        aPatient.connect(dataset);

// instanciando o componente doutor louco
        IDoctor cDoctor = new Doctor();

// conectando-o ao componente DataSet
        cDoctor.connect(dataset);
        
// instanciando o componente graphicCreator
        IgraphicCreator cgraphic = new graphicCreator();
// conectando-o com a componente dataset        
        cgraphic.connect(dataset);

// conectando-o ao componente paciente
        cDoctor.connect(aPatient);
        cDoctor.connect(cgraphic);
// executando a entrevista
        cDoctor.startInterview();


    }
}
