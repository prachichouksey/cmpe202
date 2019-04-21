 


class RegularDiscount implements DiscountCompute<Integer> {

  @Override
  public Integer compute(Integer n) {
    System.out.println("Computing regular discount:" + n );
                return n-(n*0.10);
  }

}