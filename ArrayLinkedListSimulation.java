/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylinkedlistsimulation;

/**
 *
 * @author BED
 */
public class ArrayLinkedListSimulation {
  
    private int[] array;
    
    private int size;
  
    private static final int INITIAL_CAPACITY = 5;

  
    public ArrayLinkedListSimulation() {
        array = new int[INITIAL_CAPACITY];
        size = 0;
    }

   
    public void add(int value) {
        if (size == array.length) {
           
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray; 
        }
        array[size] = value;
        size++;
    }

   
    public int poll() {
        if (size == 0) {
            return -1; 
        }
        int removedElement = array[0];
        
        for (int i = 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        return removedElement;
    }

    
    public int peek() {
        if (size == 0) {
            return -1;  
        }
        return array[0]; 
    }

   
    public int pop() {
        if (size == 0) {
            return -1;  
        }
        size--;
        return array[size];  
    }

   
    public static void main(String[] args) {
       
        ArrayLinkedListSimulation simulation = new ArrayLinkedListSimulation();

        
        System.out.println("Adding elements to the list:");
        simulation.add(10);
        simulation.add(20);
        simulation.add(30);
        simulation.add(40);
        simulation.add(50);
        System.out.println("Array after adding elements: " + simulation.toString());

      
        System.out.println("Poll (remove first element): " + simulation.poll());
        System.out.println("Array after polling: " + simulation.toString());

        
        System.out.println("Peek (first element): " + simulation.peek());

        
        System.out.println("Pop (remove last element): " + simulation.pop());
        System.out.println("Array after popping: " + simulation.toString());

       
        System.out.println("Poll from empty array: " + simulation.poll());
        System.out.println("Peek from empty array: " + simulation.peek());
        System.out.println("Pop from empty array: " + simulation.pop());
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}




