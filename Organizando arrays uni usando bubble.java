public class Bubble 
        /*Esse loop checa os elementos adjacentes, buscando por elementos fora de ordem.
        Quando um par de elementos fora de ordem é encontrado, os dois elementos trocam do posição.
        Depois que cada um trocar, o elemento menor move para a posição a esquerda e esse loop continua 
        até que toda array fique organizada
        */
{
    public static void main(String[]args)
    {
        int a, b, t;
        int tamanho;
        int[] nums = {99,-10,100123, 18, -978, 5623, 463, -9, 287, 49};
        tamanho = 10;
        System.out.print("Array original é: ");
        for(int i=0; i < tamanho; i++)
            System.out.print(" " +nums[i]);
        System.out.println();
        
        //Bubble organizador
        for(a=1; a<tamanho; a++)
        {
            for(b=tamanho-1; b>=a;b--)
            {
                if(nums[b-1] > nums[b]) //se está fora de ordem
                {
                    //permutar elementos
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        //A saída da array organizada
        System.out.print("Array organizada: ");
        for(int i=0;i<tamanho;i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }    
}
