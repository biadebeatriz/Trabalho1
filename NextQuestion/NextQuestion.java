public interface NextQuestion {
    public String nextQ(String tabela[[]]);
  }
  
  public class NQ implements NextQuestion{
      
      public String nextQ(String tabela[][]){
        int nlinha = tabela.getRowDimension(),ncoluna = tabela.getColumnDimension();
        int cont=0,ideal=(nlinha-1)/2,maxf=0,colmax=0;
        for(int i=1; i<=ncoluna;i++){
            for(int j=1;j<=nlinha;j++){
                if(tabela[j][i]=='f'){
                    cont++;
                }
            }
            if(Math.abs(cont-ideal)<Math.abs(maxf-ideal){
                maxf=cont;
                colmax=i;
            }

        }
        return tabela[0][colmax];
      }
      
  }