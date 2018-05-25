package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static BigInteger iterative(int limit) {
    BigInteger product = BigInteger.ONE;
    for (int i = 1; i <= limit; i++) {
      product = product.multiply(BigInteger.valueOf(i)); // auto conversion from integer to long
    }
    return product;
  }

  public static BigInteger recursive(int limit) {
    if (limit <= 1) {
      return BigInteger.ONE;
    }
    return recursive(limit - 1).multiply(BigInteger.valueOf(limit));
  }

  public static void main(String[] args) {
    assert iterative(0).equals(BigInteger.ONE) : "0! is 1 by definition";
    assert iterative(52).equals(recursive(52)) : "Recursive factorial must give same result as "
        + "iterative factorial.";
  }

}
