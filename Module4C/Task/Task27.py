# Create a test case that compares two strings
# Create another test case that compares different numbers
#
# Use any unit testing framework from this week's lessons.
import unittest


class test(unittest.TestCase):
    def test_compare_strings(self):
        str1 = "Hello, World!"
        str2 = "Hello, World!"
        self.assertEqual(str1, str2, "The strings are not equal")

    def test_compare_numbers(self):
        num1 = 42
        num2 = 42
        self.assertEqual(num1, num2, "The numbers are not equal")

    if __name__ =='__main__':
        unittest.main()



