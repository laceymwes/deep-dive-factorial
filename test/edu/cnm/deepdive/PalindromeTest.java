package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import static edu.cnm.deepdive.Palindrome.isPalindrome;
import org.junit.jupiter.api.Test;

// Entry point for Test classes is the class beginning.
class PalindromeTest {

  private static final String[] PALINDROMES = {
      "radar",
      "A man, a plan, a canal - panama!",
      "Madam, I'm Adam!",
  };

  private static final String[] NON_PALINDROMES = {
      "A man, a plan, a canal - panamo!",
      "ab",
      "abbac",
  };

  @Test
  void testInterestingPalindromes() {
    for(String test : PALINDROMES){
      assertTrue(isPalindrome(test)); // if return value !True, assertion fails, test fails.
    }
    for(String test : NON_PALINDROMES){
      assertFalse(isPalindrome(test)); // if return value True, assertion fails, test fails.
    }
  }

  @Test
  void testDegeneratePalindromes(){
    assertTrue(isPalindrome(""), "Empty string is by definition a palindrome."); // if return value !True, assertion fails, test fails.
    assertTrue(isPalindrome("A"), "Single-character string is by definition a palindrome.");// ^^
  }
}