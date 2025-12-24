package LR5.Example6;

public class MinMaxClass {

    private int min;
    private int max;

    public MinMaxClass(int arg) {
        setValues(arg);
    }

    public MinMaxClass( int arg1, int arg2){
            setValues(arg1, arg2);
        }

        public void setValues ( int arg){
            updateFields(arg, arg);
        }

        public void setValues ( int arg1, int arg2){
            updateFields(arg1, arg2);
        }

        private void updateFields ( int a, int b){

            int currentMin = Math.min(a, b);
            int currentMax = Math.max(a, b);

            this.min = Math.min(this.min, currentMin);
            this.max = Math.max(this.max, currentMax);

        }

        public void display () {
            System.out.println("Поле min: " + min);
            System.out.println("Поле max: " + max);
            System.out.println("-----------------");
        }
    }
