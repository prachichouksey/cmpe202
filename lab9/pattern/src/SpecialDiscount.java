 


class SpecialDiscount implements DiscountCompute<Integer> {

  @Override
  public Integer compute(Integer n) {
    System.out.println("Computing special discount:" + n );
                return n-(n*0.50);
  }

}