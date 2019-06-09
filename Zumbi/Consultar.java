package Zumbi;
import Interfaces.*;
import graphicCreator.*;
import attTable.*;
import zumbi.Interfaces.IRedutorPossibilidades.*;
import zumbi.Componentes.*;
import zumbi.Componentes.RedutorPossibilidades.FabricaRedutor;

public class Consultar {
    public static void main(String[] args){

        // instanciando o componente DataSet
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("/home/guiloko/eclipse-workspace/Projeto322/src/zombie-health-spreadsheet-ml-training.csv");

// instanciando o componente paciente
        IPatient aPatient = new Patient();

// conectando-o no componente DataSet
        aPatient.connect(dataset);

// Instanciando o componente RedutorPossibilidades
        IRedutorPossibilidades redutor = FabricaRedutor.criaRedutor();

// instanciando o componente graphicCreator
        IgraphicCreator cgraphic = graphicCreatorFactory.create();
// Conectando-o ao componente dataset         
        cgraphic.connect(dataset);
        
// Instanciando o componente attTable
        IattTable attTable = attTableFactory.create();
        
// Conectando-o ao componente dataset e redutor        
        attTable.connect(dataset);
        attTable.connect(redutor);
        
// Conectando-o ao componente graphiccreator        
        attTable.attach(cgraphic);
        
        
// instanciando o componente doutor louco
        IDoctor cDoctor = new Doctor();

// conectando-o ao componente DataSet
        cDoctor.connect(dataset);
        
        cDoctor.connect(attTable);

// conectando-o ao componente paciente
        cDoctor.connect(aPatient);
        cDoctor.connect(cgraphic);
// executando a entrevista
        cDoctor.startInterview();


    }
}
