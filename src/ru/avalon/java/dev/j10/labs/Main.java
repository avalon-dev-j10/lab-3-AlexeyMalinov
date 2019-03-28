package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;
import ru.avalon.java.dev.j10.labs.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
		// 0. Создать массив из 20 целых чисел и адресовать его с сохранить ссылку в переменную array.
    	int[] array = new int[20];

    	// 1. Проинициализировать массив значениями последовательности чисел Фибоначчи.
		Initializer fibInitializer = new FibonacciInitializer();
		fibInitializer.initialize(array);

		// 2. Найти сумму элементов массива.
		int arrayElemetsSum = addingArrayElements(array);

		// 3. Проинициализировать массив последовательностью случайных чисел в диапазоне от -50 до 50.
        Initializer randomInitializer = new RandomInitializer(-50, 50);
        randomInitializer.initialize(array);

        //4. Отсортировать массив с использованием пузырьковой сортировки.
		Sort bubbleSort = new BubbleSort();
		bubbleSort.sort(array);

		//5. Проинициализировать массив последовательностью случайных чисел в диапазоне от -50 до 50.
		randomInitializer.initialize(array);

		// 6. Отсортировать массив с использованием сортировки выбором.
		Sort selectionSort = new SelectionSort();
		selectionSort.sort(array);

		//7. Проинициализировать массив последовательностью случайных чисел в диапазоне от -50 до 50.
		randomInitializer.initialize(array);

		//8. Отсортировать массив с использованием сортировки Шелла.
        Sort shellSort = new ShellSort();
        shellSort.sort(array);
    }

	/**
	 * Статический метод суммирующий все элементы массива
	 * @param array
	 * @return
	 */
    public static int addingArrayElements(int[]array){
		int sum = 0;
    	for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
    	return sum;
	}
}
