import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main
{
  private static class LISTA
  {
    public int valor;
    public LISTA prox;
  }
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    LISTA inicio = null;
    LISTA final_ = null;
    LISTA auxiliar;
    LISTA anterior;
    int comando, numero, achado;
    do
    {
      System.out.println("\n  ------- MENU DE OPÇÔES ------- ");
      System.out.println(" | 1 - Inserir Valor no Início. |");
      System.out.println(" | 2 - Inserir Valor no Final.  |");
      System.out.println(" | 3 - Consultar Elementos.     |");
      System.out.println(" | 4 - Remover Elemento(s).     |");
      System.out.println(" | 5 - Esvaziar Lista.          |");
      System.out.println(" | 6 - Encerrar.                |");
      System.out.println("  ------------------------------ ");
      System.out.println("\n  --------- DIGITE UMA ---------");
      System.out.print("             OPÇÃO: ");
      comando = scan.nextInt();
      System.out.println("  ------------------------------ \n");
      if (comando < 1 || comando > 6)
      {
        System.out.println("  ============================== ");
        System.out.println("          OPÇÃO INVÁLIDA");
        System.out.println("         TENTE NOVAMENTE!");
        System.out.println("  ============================== ");
      }
      if (comando == 1)
      {
        System.out.println("  --------- INFORME UM ---------");
        System.out.print("             VALOR: ");
        LISTA novo = new LISTA();
        novo.valor = scan.nextInt();
        System.out.println("  ------------------------------ \n");
        if (inicio == null)
        {
          inicio = novo;
          final_ = novo;
          final_.prox = inicio;
        }
        else
        {
          novo.prox = inicio;
          inicio = novo;
          final_.prox = inicio;
        }
        System.out.println("  ============================== ");
        System.out.println("  O VALOR FOI INSERIDO NO ÍNICIO ");
        System.out.println("  ============================== ");
      }
      if (comando == 2)
      {
        System.out.println("  --------- INFORME UM ---------");
        System.out.print("             VALOR: ");
        LISTA novo = new LISTA();
        novo.valor = scan.nextInt();
        System.out.println("  ------------------------------ \n");
        if (inicio == null)
        {
          inicio = novo;
          final_ = novo;
          final_.prox = inicio;
        }
        else
        {
          final_.prox = novo;
          final_ = novo;
          final_.prox = inicio;
        }
        System.out.println("  ============================== ");
        System.out.println("  O VALOR FOI INSERIDO NO FINAL! ");
        System.out.println("  ============================== ");
      }
      if (comando == 3)
      {
        if (inicio == null)
        {
        System.out.println("  ============================== ");
        System.out.println("        A LISTA ESTÁ VAZIA ");
        System.out.println("  ============================== ");
        }
        else
        {
          System.out.println("  ====== VALORES DA LISTA ====== ");
          System.out.print("   ");
          auxiliar = inicio;
          do
          {
            System.out.print(auxiliar.valor + "  ");
            auxiliar = auxiliar.prox;
          }
          while (auxiliar != inicio);
          System.out.println("\n  ============================== ");
        }
      }
      if (comando == 4)
      {
        if (inicio == null)
        {
        System.out.println("  ============================== ");
        System.out.println("        A LISTA ESTÁ VAZIA ");
        System.out.println("  ============================== ");
        }
        else
        {
          System.out.println("  ====== VALORES DA LISTA ====== ");
          System.out.print("   ");
          auxiliar = inicio;
          do
          {
            System.out.print(auxiliar.valor + "  ");
            auxiliar = auxiliar.prox;
          }
          while (auxiliar != inicio);
          System.out.println("\n  ==============================  \n");
          System.out.println("  --------- INFORME UM ---------");
          System.out.print("             VALOR: ");
          numero = scan.nextInt();
          System.out.println("  ------------------------------ \n");
          auxiliar = inicio;
          anterior = null;
         achado = 0;
          int quantidade = 0;
          auxiliar = inicio;
          do
          {
            quantidade = quantidade + 1;
            auxiliar = auxiliar.prox;
          }
          while (auxiliar != inicio);
          int elemento = 1;
          do
          {
            if (inicio == final_ && inicio.valor == numero)
            {
              inicio = null;
             achado = achado + 1;
            }
            else
            {
              if (auxiliar.valor == numero)
              {
               achado = achado + 1;
                if (auxiliar == inicio)
                {
                  inicio = auxiliar.prox;
                  final_.prox = inicio;
                  auxiliar = inicio;
                }
                else if (auxiliar == final_)
                {
                  final_ = anterior;
                  final_.prox = inicio;
                  auxiliar = auxiliar.prox;
                }
                else
                {
                  anterior.prox = auxiliar.prox;
                  auxiliar = auxiliar.prox;
                }
              }
              else
              {
                anterior = auxiliar;
                auxiliar = auxiliar.prox;
              }
            }
            elemento = elemento + 1;
          }
          while (elemento <= quantidade);

          if ( achado == 0)
          {
            System.out.println("  ============================== ");
            System.out.println("  O ELEMENTO NÃO FOI ENCONTRADO! ");
            System.out.println("  ============================== ");
          }
          else if ( achado == 1)
          {
            System.out.println("  ============================== ");
            System.out.println("     1 ELEMENTO FOI REMOVIDO! ");
            System.out.println("  ============================== ");
          }
          else
          {
            System.out.println("  ============================== ");
            System.out.println("   "+achado+" ELEMENTOS FORAM REMOVIDOS!");
            System.out.println("  ============================== ");
          }
        }
      }
      if (comando == 5)
      {
        if (inicio == null)
        {
          System.out.println("  ============================== ");
          System.out.println("        A LISTA ESTÁ VAZIA ");
          System.out.println("  ============================== ");
        }
        else
        {
          inicio = null;
          System.out.println("  ============================== ");
          System.out.println("    TODOS ELEMENTOS REMOVIDOS! ");
          System.out.println("  ============================== ");
          
        }
      }
    }
    while (comando != 6);
    System.out.println("  ============================== ");
    System.out.println("       APLICAÇÃO ENCERRADA! ");
    System.out.println("  ============================== ");
  }
}
