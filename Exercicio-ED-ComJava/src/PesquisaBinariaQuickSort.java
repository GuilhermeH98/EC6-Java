import java.util.Scanner;

public class PesquisaBinariaQuickSort 
{
		static void QuickSort(int[] vetor, int esq, int dir)
	    {
	        int pivo, aux, i, j;
	        int meio;
	        i = esq;
	        j = dir;
	        meio = (int)((i + j) / 2);
	        pivo = vetor[meio];
	        do
	        {
	            while (vetor[i] < pivo) i = i + 1;
	            while (vetor[j] > pivo) j = j - 1;
	            if (i <= j)
	            {
	                aux = vetor[i];
	                vetor[i] = vetor[j];
	                vetor[j] = aux;
	                i = i + 1;
	                j = j - 1;
	            }
	        }
	        while (j > i);
	        if (esq < j) QuickSort(vetor, esq, j);
	        if (i < dir) QuickSort(vetor, i, dir);
	    }

	   
	    static int PesquisaBinaria(int[] vetor, int chave)
	    {
	        int meio;

	        int esq = 0;
	        int dir = vetor.length -1;

	        do
	        {
	            meio = (esq + dir) / 2;
	            if (vetor[meio] == chave)
	            {
	                return meio;
	            }
	            else if (chave > vetor[meio])
	            {
	                esq = meio + 1;
	            }
	            else
	            {
	                dir = meio - 1;
	            }
	        }
	        while (esq <= dir);

	        return -1;
	    }



	    public static void main(String[] args)
	    {
	   	 Scanner teclado = new Scanner (System.in);
	        int[] dados = new int[6];
	        int chave;

	        
	        System.out.printf("Entre com %d números %n", dados.length);
	        for (int i = 0; i < dados.length; i++)
	        {
	            dados[i] = teclado.nextInt();
	        }
	        QuickSort(dados, 0, dados.length - 1);
	        
	        System.out.printf(" %n %n Números ordenados: %n");
	        for (int i = 0; i < dados.length; i++)
	        {
	            //Console.WriteLine(dados[i]);
	            System.out.println(dados[i]);
	        }

	        do
	        {
	       	 System.out.print("Informe um valor para pesquisar ou -1 para sair:");
	            
	            chave = teclado.nextInt();
	            int posicao;

	            if (chave != -1)
	            {
	                posicao = PesquisaBinaria(dados, chave);
	                if (posicao == -1)
	                   
	                    System.out.println("Valor não encontrado!");
	                else
	                    
	                    System.out.printf("Valor encontrado na posicao %d %n", posicao);
	            }
	        } 
	        while (chave != -1);      
	        
	        teclado.close();

	    }

}



