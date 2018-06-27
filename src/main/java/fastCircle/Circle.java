package fastCircle;

public class Circle {

    public Circle(){

    }

    public double lastone(double people, double turn){


        double position = 0;

        for (double i=1; i<=people; ++i) {
            /*
            Позиция искомого элемента равна остатку от деления суммы начальной позиции и колличества ходов
            на колличество вышедших людей
            */
            position = (position + turn) % i;
            /*
            я не смог обойтись без цикла так как после каждой итерации позиция смещается и это самый оптимальный
            из найденых мной способов подсчитать это смещение
             */
        }
        return position + 1;
    }


}
