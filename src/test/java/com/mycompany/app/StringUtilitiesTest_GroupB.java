package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilitiesTest_GroupB {

  @Test
public void test01() {
  String input = "A Nut for A JaR of tuna";
  boolean output = StringUtilities.isPalindrome(input);
  assertTrue("The sentence should be a palindrome (if ignoring whitespace characters)", output);
}

@Test
public void test02() {
  String input = "Is Water Wet?";
  String testValue = "Wet? Water Is";
  String actualOutput = StringUtilities.reverse(input);
  assertNotEquals("The actual String should not be recognized as the reverse of the expected String", testValue, actualOutput);
}

@Test
public void test03() {
  String input = "Sir, This Is A Wendy's";
  String processed_reverse = StringUtilities.reverse(input);
  assertNotNull("Should have been able to reverse input",processed_reverse);
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
public void test04() {
  String input = "z2a";
  assertEquals("Convert lowercase to uppercase boundary condition is failing", "Z2A", StringUtilities.toggleCase(input));
}

@Test
public void test05() {
  String input = "A Programmer";
  int count = 4;
  assertEquals("The input sentence should have "+count+" vowels", count, StringUtilities.vowelCounter(input));
}

@Test
public void test06() {
  String input = "E.g.,";
  int count = 3;
  assertEquals("The input sentence has 3 non-alphanumeric characters (Two periods and one comma), but "+ StringUtilities.nonAlphaNumericCounter(input) + " is returned", count, StringUtilities.nonAlphaNumericCounter(input));
}
}
