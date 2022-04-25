package com.chandanghosh.reverse_word;

import java.util.Stack;

public class ReverseWord
{
    public static void main(String[] args)
    {
        System.out.println(new ReverseWord().reverse("123456789"));
    }

    public String reverse(String word)
    {
        Stack<Character> stack = new Stack<>();
        for (char s : word.toCharArray())
        {
            stack.push(s);
        }

        StringBuilder str = new StringBuilder();
        for (int i = stack.size() - 1; i >= 0; i--)
        {
            str.append(stack.pop());
        }
        return str.toString();
    }
}
