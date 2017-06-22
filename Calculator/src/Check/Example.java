package Check;

import Check.Prime;
import Check.Armstrong;
import Check.Palindrome;
import Check.Countdigit;
class Example
{
public static void main(String args[])
{
Prime obj1 = new Prime(2);
obj1.primeCheck();
Armstrong obj2 = new Armstrong(153);
obj2.armstrongCheck();
Palindrome obj3 = new Palindrome(101);
obj3.palindromeCheck();
Countdigit obj4 = new Countdigit(125);
obj4.countCheck();
}
}
