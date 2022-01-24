package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyStringException() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketAtBeginningAndEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketAtSecondConnectedWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketAtStartReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void twoBracketsWithinBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void singleBracketHasWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void misNestBracketSecondWordThrowsException() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test(expected = IllegalArgumentException.class)
    public void misNestedBracketsThrowsException() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test(expected = IllegalArgumentException.class)
    public void misNestedBracketInMiddleOfTwoNestedBracketsThrowsException() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void singleBracketThrowsException() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


}
