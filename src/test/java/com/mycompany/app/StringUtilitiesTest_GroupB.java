package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilitiesTest_GroupB {

  @Test
  public void test01() {
    String input = "racecar";
    boolean ouput = StringUtilities.isPalindrome(input);
    assertTrue("The word " + input + " is a palindrome", ouput);
  }

  @Test
  public void test02() {
    String input = null;
    boolean ouput = StringUtilities.isPalindrome(input);
    assertFalse("Null string is not a palindrome", ouput);

    input = "";
    ouput = StringUtilities.isPalindrome(input);
    assertFalse("Empty string is not a palindrome", ouput);
  }

  
  @Test
  public void test03() {
    String input = "a nut for a jar of tuna";
    boolean ouput = StringUtilities.isPalindrome(input);
    assertTrue(
      "The sentence is a palindrome (ignore whitespace characters)",
      ouput
    );

    input = "taco cat.";
    ouput = StringUtilities.isPalindrome(input);
    assertFalse("The sentence is not a palindrome (period)", ouput);
  }

  @Test
  public void test04() {
    String input = "Is Water Wet?";
    String testValue = "Wet? Water Is";
    String actualOutput = StringUtilities.reverse(input);
    assertNotEquals("Invalid reversed string", testValue, actualOutput);
  }

  @Test
  public void test05() {
    assertEquals(
      "Convert uppercase to lowercase is failing",
      "gOOD mORNING!",
      StringUtilities.toggleCase("Good Morning!")
    );
  }

  @Test
  public void test06() {
    assertEquals(
      "Convert uppercase to lowercase boundary condition is failing",
      "a2z",
      StringUtilities.toggleCase("A2Z")
    );
    assertEquals(
      "Convert lowercase to uppercase boundary condition is failing",
      "Z2A",
      StringUtilities.toggleCase("z2a")
    );
  }

  @Test
  public void test07() {
    String input = "Sir, This Is A Wendy's";
    String processed_reverse = StringUtilities.reverse(input);
    assertNotNull(processed_reverse);
    String processed_toggle = StringUtilities.toggleCase(processed_reverse);
    assertEquals(
      "The input sentence did not reverse",
      "s'ydneW A sI sihT ,riS",
      processed_reverse
    );
    assertEquals(
      "The input sentence did not reverse and change case",
      "S'YDNEw a Si SIHt ,RIs",
      processed_toggle
    );
  }

  @Test
  public void test08() {
    String input = "A Programmer";
    int count = 4;
    assertTrue(
      "The input sentence contains vowels",
      StringUtilities.vowelCounter(input) > 0
    );
    assertEquals(
      "The input sentence has "+count+" vowels",
      count,
      StringUtilities.vowelCounter(input)
    );
  }

  @Test
  public void test09() {
    String input = "E.g.,";
    int count = 3;
    assertTrue(
      "The input sentence has non-alphanumeric characters",
      StringUtilities.nonAlphaNumericCounter(input) > 0
    );
    assertEquals(
      "The input sentence has "+count+" non-alphanumeric characters (Two periods and one comma)",
      count,
      StringUtilities.nonAlphaNumericCounter(input)
    );
  }

  @Test
  public void test10() {
    String input = "There's No Place Like 127.0.0.1";
    assertTrue(
      "The input sentence has non-alphanumeric characters",
      StringUtilities.nonAlphaNumericCounter(input) > 0
    );
    assertEquals(
      "The input sentence has 8 non-alphanumeric characters",
      8,
      StringUtilities.nonAlphaNumericCounter(input)
    );
  }
}
