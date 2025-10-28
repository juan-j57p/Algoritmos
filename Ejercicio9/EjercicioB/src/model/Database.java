package model;

public class Database {
   private int[] numbers;

   public Database() {
      this.numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
   }

   public int search (int number) {
      int position = -1;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == number) {
            position = i;
         }
      }
      return position;
   } 
}
