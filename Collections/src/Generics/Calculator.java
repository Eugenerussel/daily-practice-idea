package Generics;

    class Calculator<T>{
        private T value;

        public Calculator(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
        public T doubleValue(){
            if(value instanceof Integer i){
                return (T)Integer.valueOf(i*2);
            }
            return null;
        }
        public T doubleVal(){
            // to get type of the variable or objects from any class,we can use
            // Instanceof keyword
            if(value instanceof String str){
                return (T)(str+str);
            }
            return null;
        }
        public static void main(String[] args) {
            Calculator<Integer> calculator=new Calculator<>(20);
            System.out.println(calculator.doubleValue());
            Calculator<String> calculator1=new Calculator<>("Hello ");
            System.out.println(calculator1.doubleVal());
        }
    }
