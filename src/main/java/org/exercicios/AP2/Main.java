package org.exercicios.AP2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insere os valores [5, 8, 3, 2] no início da lista
        list.insertAtBeginning(5);
        list.insertAtBeginning(8);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);

        // Insere o valor 7 no fim da lista
        //list.insertAtEnd(7);

        // Remove o elemento que está no início da lista
        //list.removeFromBeginning();

        // Obtém o valor do elemento que está na posição 2 da lista
        //int value = list.getValueAtPosition(2);
        //System.out.println("Valor na posição 2: " + value);

        // Remove o elemento que está no fim da lista
        //list.removeFromEnd();

        // Imprime a lista completa
        System.out.print("Lista completa: ");
        list.printList();

        // Imprime a lista completa de trás para frente
        System.out.print("Lista completa de trás para frente: ");
        list.printReverseList();
    }
}
