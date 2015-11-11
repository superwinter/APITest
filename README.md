API-Functional-Test
=================

API functional tests
Use CommonTest framework to test API.

How does it work
----------------
 - A Java program that reads and execute all test cases. The Java program seldom change once created.
 - The testcases are written in XML, which should be our main focus.

How to run the tests
--------------------
- mvn -Dtestcase=testcase/getResponseBody.xml clean test
