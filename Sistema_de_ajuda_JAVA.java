public class Sistema_de_ajuda 
{
    public static void main(String[]args)
    throws java.io.IOException
    {
        char search, searchin;
        char ignorar1, ignorar2, ignorar3, ignorar4, ignorar5;
looper: for(;;)
        {

            System.out.println("Digite qual comando você está procurando: ");
            System.out.println("1 - para: Imprimir na tela");
            System.out.println("2 - para: Ler input do teclado");
            System.out.println("3 - para: comando if");
            System.out.println("4 - para: comando for");
            System.out.println("5 - para: comando while");
            System.out.println("6 - para: comando do-while");
            System.out.println("7 - para: comando switch");
            System.out.println("8 - para: labels");
            System.out.println("9 - para: Operadores");
            System.out.println("0 - para: fechar");
            System.out.println("\n\n");
            search = (char)System.in.read();
            System.out.println("\n\n");
             do
            {
                ignorar1 = (char)System.in.read();
            }while(ignorar1 != '\n');
            switch(search)
            {
                case '1': System.out.println("System.out.println(\"o que se quer escrever\");");
                          System.out.println("\n\n");
                break;
                case '2': System.out.println("embaixo da main:");
                        System.out.println("throws java.io.IOException{}");
                        System.out.println("comando de leitura:");
                        System.out.print(" variável = (casting)System.in.read();");
                        System.out.println("\tTodo input sai como int, por isso o casting");
                        System.out.println("");
                        System.out.println("Para adcionar mais de 1 input no teclado é NECESSÁRIO fazer isto: ");
                        System.out.println("do{\n   char ignore = (char)System.in.read();\n}while(ignorar != 'contrabarra'n); ");
                        System.out.println("\n\n");
                break;
                case '3': 
                        System.out.println("1 - if");
                        System.out.println("2 - else");
                        System.out.println("3 - else if");
                        System.out.println("0 - voltar");
                        System.out.println("\n\n");
                        searchin = (char)System.in.read();
                        do
                        {
                            ignorar2 = (char)System.in.read();
                        }while(ignorar2 != '\n');
                        if(searchin !=0);
                        {
                            while(searchin !='0')
                            {
                                if(searchin == '1')
                                    {
                                        System.out.println("if(condição) \n{\"bloco de comando\"}");
                                        System.out.println("\n\n");
                                    }
                                else if(searchin == '2')
                                {
                                    System.out.println("if(condição) \n{\"bloco de comando\"} \nelse \n{\"bloco de comando\"}");
                                    System.out.println("a condição do else é o oposto de todos os if antecessores dentro de um bloco");
                                    System.out.println("\n\n");
                                }
                                else if(searchin == '3')
                                {
                                    System.out.println("if(condição) \n{\"bloco de comando\"} else if(condição) \n{\"bloco de comando\"}");
                                    System.out.println("else if cria uma condição específica que o if não faz");
                                    System.out.println("\n\n");
                                }
                                System.out.println("\n\n\n\n");
                                System.out.println("1 - if");
                                System.out.println("2 - else");
                                System.out.println("3 - else if");
                                System.out.println("0 - voltar");
                                System.out.println("\n\n");
                                searchin = (char)System.in.read();
                                do
                                {
                                    ignorar3 = (char)System.in.read();
                                }while(ignorar3 != '\n');
                            }
                        }
                        System.out.println("\n\n");
                break;
                case '4': System.out.println("for(iniciação;condição;repetição)");
                        System.out.println("apenas os \";\" são necessários");
                        System.out.println("\n\n");
                break;
                case '5': System.out.println("while(condição)");
                        System.out.println("\n\n");
                break;
                case '6': System.out.println("do \n{bloco de comando a ser repetido\n}while(condição);");
                    System.out.println("\n\n");
                break;
                case '7': System.out.println("switch(variavel) \n{\n    case 1:\n    break;\n    case...:\n    break;\n    default:\n    }");
                    System.out.println("\n\n");
                break;
                case '8': System.out.println("label: {...}\nbreak label;");
                        System.out.println("label: repetidor(){...}\ncontinue label;");
                        System.out.println("\n\n");
                break;
                case '9': System.out.println("1 - Aritméticos");
                        System.out.println("2 - Lógicos");
                        System.out.println("0 - sair");
                        searchin = (char)System.in.read();
                        do
                        {
                            ignorar4 = (char)System.in.read();
                        }while(ignorar4 != '\n');
                        if(searchin !=0)
                        {   
                            while(searchin != 0)
                            {
                                if(searchin == '1')
                                {
                                    System.out.println("+ = soma");
                                    System.out.println("- = subtração");
                                    System.out.println("* = multiplicação");
                                    System.out.println("/ = divisão");
                                    System.out.println("% = resto de divisão inteira");
                                    System.out.println("\n\n");
                                }
                                else if(searchin == '2')
                                {
                                    System.out.println("== = igual");
                                    System.out.println("!= = diferente");
                                    System.out.println("& = e");
                                    System.out.println("| = ou");
                                    System.out.println("! = não");
                                    System.out.println("\n\n");
                                }
                                System.out.println("\n\n\n\n");
                                System.out.println("1 - Aritméticos");
                                System.out.println("2 - Lógicos");
                                System.out.println("0 - sair");
                                System.out.println("\n\n");
                                searchin = (char)System.in.read();
                                do
                                {
                                    ignorar5 = (char)System.in.read();
                                }while(ignorar5 != '\n');
                            }
                        }
                    System.out.println("\n\n");
                break;
                case '0': 
                System.out.println("\n\n");
                break looper;
            }
        }
    }
}
