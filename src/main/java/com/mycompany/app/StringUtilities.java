package com.mycompany.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilities {

  public static void main(String[] args) {
    System.out.println("Welcome");
  }
  
  public static String reverse(String inputString) {
    if (inputString == null) {
      return null;
    }

    String reversedString = "";
    for (int i = inputString.length() - 1; i >= 0; i--) {
      char ch = inputString.charAt(i);
      reversedString = reversedString + ch;
    }

    return reversedString;
  }

  private static String removeWhitespaces(String inputString) {
    String newString = "";
    for (int i = 0; i < inputString.length(); i++) {
      if (!Character.isWhitespace(inputString.charAt(i))) {
        newString = newString + inputString.charAt(i);
      }
    }
    return newString;
  }

  public static boolean isPalindrome(String inputString) {
    String processedString = reverse(inputString);
    String inputProcessedString = removeWhitespaces(inputString);
    if (inputProcessedString.equals(processedString)) {
      return true;
    }
    return false;
  }

  public static int vowelCounter(String inputString) {
    int count = 0;
    for (int i = 0; i < inputString.length(); i++) {
      char ch = inputString.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    return count;
  }

  public static String toggleCase(String inputString) {
    String toggledString = "";
    for (int i = 0; i < inputString.length(); i++) {
      char ch = inputString.charAt(i);
      if (ch >= 'a' && ch < 'z') {
        ch = (char) (ch - 'a' + 'A');
      } else if (ch >= 'A' && ch <= 'Z') {
        ch = (char) (ch - 'A' + 'a');
      }
      toggledString = toggledString + ch;
    }
    return toggledString;
  }

  public static int nonAlphaNumericCounter(String inpuString) {
    Pattern p = Pattern.compile(".*\\W+.*");
    Matcher m = null;
    int counter = 0;

    for (int i = 0; i < inpuString.length() - 1; i++) {
      m = p.matcher(Character.toString(inpuString.charAt(i)));
      if (m.find()) {
        counter++;
      }
    }
    return counter;
  }
}
