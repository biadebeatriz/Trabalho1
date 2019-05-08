package Zumbi;

public class Consultar {
    public static void main(String[] args){

        // instanciando o componente DataSet
        IDataSet dataset = new DataSetComponent();
        dataset.setDataSource("/home/beatriz/IdeaProjects/Trabalho1/zombie-health-spreadsheet-ml-training.csv");

// instanciando o componente paciente
        IPatient aPatient = new Patient();

// conectando-o no componente DataSet
        aPatient.connect(dataset);

// instanciando o componente doutor louco
        IDoctor cDoctor = new Doctor();

// conectando-o ao componente DataSet
        cDoctor.connect(dataset);

// conectando-o ao componente paciente
        cDoctor.connect(aPatient);

// executando a entrevista
        cDoctor.startInterview();


    }
}
