public class StrategyDiscount {

        public static void main(String[] args) {

            DiscountCompute<Double> Discount = new RegularDiscount();
            
            System.out.println(Discount.compute(100.0));

            Discount = new SpecialDiscount();
            System.out.println(Discount.compute(100.00));

        }
    }



