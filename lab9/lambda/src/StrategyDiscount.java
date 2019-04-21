public class StrategyDiscount {

        public static void main(String[] args) {

            DiscountCompute<Double> Discount = (n)-> {
                System.out.println("Computing regular discount:" + n );
                return n-(n*0.10);
            };
            System.out.println(Discount.compute(100.0));

            Discount = (m)-> {
                System.out.println("Computing special discount: "+m);
                return m-(m*0.50);
            };
            System.out.println(Discount.compute(100.00));

        }
    }



