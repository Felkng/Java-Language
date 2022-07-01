public class length {
    public static void main(String args[]) {
        int[] list = new int[10];
        int[] nums = {1,2,3};
        int[][] table = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
        System.out.println("Tamanho da lista é: " + list.length);
        System.out.println("Tamanho de nums é: " + nums.length);
        System.out.println("Tamanho de table é: " + table.length);
        System.out.println("Tamanho de table[0] é: " +table[0].length); //uso de length para obter o tamanho individual de cada linha
        System.out.println("Tamanho de table[1] é: " + table[1].length);
        System.out.println("Tamanho de table[2] é: "+ table[2].length);
        System.out.println();
        
        //uso do length para iniciar a lista
        for(int i=0; i<list.length;i++)
            list[i] = i*i;
        
        System.out.print("Aqui está a lista: ");
        //uso do length para imprimir a lista
        for(int i=0;i<list.length;i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
