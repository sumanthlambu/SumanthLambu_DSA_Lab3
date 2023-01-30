package com.greatlearning.bracketBalancer;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {
				
		test("{[()]}");
		test("{}");
		test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("M[]W");
		test("M[]");
		test("[<>");
		
	}
	

	private static void test(String brackets) {
			
		BracketChecker checker = new BracketChecker(brackets);
		Result result = checker.check();
		System.out.println(result);
	}
}
